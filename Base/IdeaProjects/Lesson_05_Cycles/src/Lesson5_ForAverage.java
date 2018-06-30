/*
•Распечатать числа, кратные четверке от 1 до 100, причем в обратном порядке (то есть, начиная с 100). Использовать цикл for
•Распечатать квадраты чисел от 1 до n при помощи цикла for, где n – задается в коде
•Например, при n = 4: 1, 4, 9, 16
•Решить задачу про среднее арифметическое чисел от x до y при помощи цикла for
 */

public class Lesson5_ForAverage {
    public static void main(String[] args) {
        System.out.println("Числа кратные 4 от 100 до 1: ");
        for (int i = 100; i >= 1; --i) {
            if (i % 4 == 0) {
                System.out.printf("%4d", i);
            }
        }

        System.out.println();
        System.out.println();

        int n = 10;
        System.out.println("Квадраты чисел от 1 до n: ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i * i);
        }

        System.out.println();
        System.out.println();

        int x = 15;
        int y = 35;
        int num = 0;
        int sum = 0;
        for (int k = x; k <= y; k++) {
            num = num + 1;
            sum += k;
        }
        double average = (double) sum / num;
        System.out.println("Среднее арифметическое: " + average);
    }
}
