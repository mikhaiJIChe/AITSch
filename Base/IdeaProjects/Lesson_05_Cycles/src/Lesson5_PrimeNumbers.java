/*
•Прочитать с консоли целое число
•Найти и распечатать все простые числа, не превышающие введенное число
 */

import java.util.Scanner;

public class Lesson5_PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = scanner.nextInt();

        System.out.printf("%5d", 2);
        int m = 1;
        outer:
        for (int i = 3; i <= n; ++i) {
            int iSqrt = (int) Math.sqrt(i);
            for (int j = 2; j <= iSqrt; ++j) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            m = m + 1;
            if (m % 10 == 0) {
                System.out.printf("%5d%n", i);
            } else {
                System.out.printf("%5d", i);
            }
        }
        /*
        // альтернативная метка
        System.out.printf("%d", 2);
        for (int i = 3; i <= n; ++i) {
            boolean needContinue = false;
            for (int j = 2; j <= i - 1; ++j) {
                if (i % j == 0) {
                    needContinue = true;
                    break;
                }
            }
            if (needContinue) {
                continue;
            }
            System.out.printf("%5d", i);
        }
*/
    }
}
