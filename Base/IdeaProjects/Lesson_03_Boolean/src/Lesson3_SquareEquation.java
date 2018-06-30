/*
Прочитать с консоли коэффициенты a, b и c квадратного уравнения 𝑎𝑥2+𝑏𝑥+𝑐=0 и найти решение этого уравнения
•Не забыть рассмотреть все 3 случая – когда есть 2 корня, 1 корень и нет решений
•Рассмотреть в том числе случаи когда a, b, c равны нулю
 */

import java.util.Scanner;

public class Lesson3_SquareEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты a, b и с для квадратного уравнения ax2+bx+c=0");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        final double epsilon = 1.0e-10; // вводим погрешность

        if (Math.abs(a) < epsilon) {
            if (Math.abs(b) < epsilon) {
                if (Math.abs(c) < epsilon) {
                    System.out.println("Тождество. x - любое число");
                } else {
                    System.out.println("Неравенство. Корней нет");
                }
            } else {
                double x = -c / b;
                System.out.println("x = " + x);
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant <= -epsilon) {
                System.out.println("Корней нет");
            } else if (discriminant >= epsilon) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            } else {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            }
        }
    }
}