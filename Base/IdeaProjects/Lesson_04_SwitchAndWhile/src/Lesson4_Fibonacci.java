/*
Написать программу, которая принимает с консоли целое число n и возвращает число Фибоначчи с
номером n.
• Числа Фибоначчи задаются следующим
образом:
•fo= 0, f1= 1, fn= fn-1 + fn-2
 */

import java.util.Scanner;

public class Lesson4_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте номер элемента n для ряда Фибоначчи");
        int n = scanner.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("Искомый член ряда Фибоначчи: f" + n + " = " + n);
        } else {
            int i = 3;
            int fnMinus2 = 0;
            int fnMinus1 = 1;
            int fn = 1;
            while (i <= n) {
                fn = fnMinus2 + fnMinus1;
                fnMinus2 = fnMinus1;
                fnMinus1 = fn;
                ++i;
            }
            System.out.println("Искомый член ряда Фибоначчи: f" + n + " = " + fn);
        }
    }
}
