/*
•Для нахождения наибольшего общего делителя двух чисел удобно использовать алгоритм Евклида:
НОД(a,b)=
 = b,если a % b =0
 НОД(b, a % b ) иначе,
•Реализовать вычисление НОД алгоритмом Евклида
•Использовать цикл
•Просьба реализовывать именно этот алгоритм, а не другой
 */

import java.util.Scanner;

public class Lesson5_EuclidAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int a1 = a;
        int b1 = b;
        int greatestCommonDivision;
        for (;;) {
            if (a1 % b1 == 0) {
                greatestCommonDivision = b1;
                break;
            } else {
                int b2 = a1 % b1;
                a1 = b1;
                b1 = b2;
            }
        }
        System.out.println("Наибольший общий делитель: " + greatestCommonDivision);
    }
}
