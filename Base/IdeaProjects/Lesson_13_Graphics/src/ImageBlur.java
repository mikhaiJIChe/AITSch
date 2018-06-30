import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class ImageBlur {
    public static void sat(double[] pixel) {
        final int COLORS_COUNT_IN_RGB = 3;
        for (int i = 0; i < COLORS_COUNT_IN_RGB; ++i) {
            if (pixel[i] > 255) {
                pixel[i] = 255;
            } else if (pixel[i] < 0) {
                pixel[i] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        Raster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        // создаем новый объект newImage совпадающий по размерам с image для дальнейшей работы с ним
        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster newRaster = newImage.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;

        // создаем окно размытия
        final int WINDOW_SIZE = 7;
        int halfWindow = WINDOW_SIZE / 2;
        int windowSquare = WINDOW_SIZE * WINDOW_SIZE;
        double[][] window = new double[WINDOW_SIZE][WINDOW_SIZE];
        for (int i = 0; i < WINDOW_SIZE; ++i) {
            for (int j = 0; j < WINDOW_SIZE; ++j) {
                window[i][j] = 1.0 / windowSquare;
            }
        }

        // создаем массив, в котором будет содержаться текущий пиксель
        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        // цикл по строкам картинки
        for (int j = halfWindow; j < height - halfWindow; ++j) {
            // цикл пикселям строки
            for (int i = halfWindow; i < width - halfWindow; ++i) {
                double[] newPixel = new double[COLORS_COUNT_IN_RGB];
                // проходим все элементы окна сглаживания
                for (int m = -halfWindow; m <= halfWindow; ++m) {
                    for (int k = -halfWindow; k <= halfWindow; ++k) {
                        // получаем текущий пиксель с координатами k,m
                        raster.getPixel(i + k, j + m, pixel);
                        for (int n = 0; n < COLORS_COUNT_IN_RGB; ++n) {
                            newPixel[n] += pixel[n] * window[k + halfWindow][m + halfWindow];
                        }
                    }
                }
                sat(newPixel);
                newRaster.setPixel(i, j, newPixel);
            }
        }
        ImageIO.write(newImage, "jpg", new File("imageBlur.jpg"));
    }
}