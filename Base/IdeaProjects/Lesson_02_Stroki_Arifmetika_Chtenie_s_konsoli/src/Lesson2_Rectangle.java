/*
написать программу читающую с коносоли длину и ширину прямоугольника, печатающую площадь и периметр
использовать printf лдя печати в одну строчку
 */

import java.util.Locale;
import java.util.Scanner;

public class Lesson2_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите длину прямугольника: ");
        double length = scanner.nextDouble();

        System.out.println("Введите ширину прямугольника: ");
        double width = scanner.nextDouble();

        double square = length * width;
        double perimeter = 2 * (length + width);

        System.out.printf("Длина = %.2f, Ширина = %.2f, Площадь = %.2f, Периметр = %.2f", length, width, square, perimeter);
    }
}
