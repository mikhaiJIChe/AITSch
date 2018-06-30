/*
Прочитать с консоли координаты трёх точек на плоскости: (x1, y1), (x2, y2), (x3, y3)
•Вычислить и вывести на экран площадь данного треугольника
•Для вычисления площади можно воспользоваться формулой Герона:
•𝑆Δ=sqrt(𝑝(𝑝−𝑎)(𝑝−𝑏)(𝑝−𝑐)), где 𝑝 −полупериметр треугольника 𝑝=(𝑎+𝑏+𝑐)/2, 𝑎, 𝑏, 𝑐 −длины сторон треугольника
•Проверить на случай, когда эти точки лежат на одной прямой – в этом случае вычислять площадь не нужно, а нужно вывести сообщение об этом
•Для вычисления корня использовать команду Math.sqrt(значение)
 */

import java.util.Locale;
import java.util.Scanner;

public class Lesson3_TriangleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите координаты трех точек на плоскости");

        System.out.println("Первая точка:");
        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();

        System.out.println("Вторая точка:");
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();

        System.out.println("Третья точка:");
        System.out.print("x3 = ");
        double x3 = scanner.nextDouble();
        System.out.print("y3 = ");
        double y3 = scanner.nextDouble();

        double length12 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); // считаем длину стороны треугольника между вершинами 1 и 2
        double length23 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2)); // длина стороны треугольника между вершинами 2 и 3
        double length31 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)); // длина стороны треугольника между вершинами 1 и 2

        double eps = Math.pow(10,-10); // вводим погрешность вычисления

        if (Math.abs((length31 - (length12 + length23))) < eps || Math.abs(length12 - (length31 + length23)) < eps || Math.abs(length23 - (length12 + length31)) < eps) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            double halfPerimeter = (length12 + length23 + length31) / 2;
            double square = Math.sqrt(halfPerimeter * (halfPerimeter - length12) * (halfPerimeter - length23) * (halfPerimeter - length31));
            System.out.println("Площадь треугольника равна: " + square);
        }
    }
}
