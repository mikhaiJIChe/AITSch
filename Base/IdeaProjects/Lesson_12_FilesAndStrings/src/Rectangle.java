import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("rectangle.txt"));
        scanner.useLocale(Locale.US);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        double square = length * width;
        double perimeter = 2 * (length + width);

        System.out.printf("Длина = %.2f, Ширина = %.2f, Площадь = %.2f, Периметр = %.2f", length, width, square, perimeter);
    }
}
