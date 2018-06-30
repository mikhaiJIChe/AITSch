import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class ImageColorToGray {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        WritableRaster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;

        // создаем массив, в котором будет содержаться текущий пиксель
        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        // вводим матрицу коэффициентов для перевода в черно-белый цвет:
        double[] bwCoeffs = {0.3, 0.59, 0.11};
        // цикл по строкам картинки
        for (int j = 0; j < height; ++j) {
            // цикл пикселям строки
            for (int i = 0; i < width; ++i) {
                // получаем текущий пиксель с координатами i,j
                raster.getPixel(i, j, pixel);
                double grayPixel = 0;
                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    grayPixel += bwCoeffs[k] * pixel[k];
                }
                // присваиваем каждой r-g-b-компоненте пикселя значение, осредненное по заданной формуле для перевода в черно-белое изображение.
                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    pixel[k] = (int) grayPixel;
                }
                raster.setPixel(i, j, pixel);
            }
        }
        ImageIO.write(image, "jpg", new File("image_GrayScale.jpg"));
    }
}