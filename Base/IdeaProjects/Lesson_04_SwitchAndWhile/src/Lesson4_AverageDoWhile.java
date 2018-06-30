/*
Переписать задачу про среднее арифметическое
на цикл do-while
 */

import java.util.Scanner;

public class Lesson4_AverageDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое и последнее числа диапазона");
        int rawBegin = scanner.nextInt(); //начало диапазона
        int rawEnd = scanner.nextInt(); //конец диапазона

        int i = rawBegin;
        int sum = 0;
        int num = 0;
        do {
            sum += i;
            i++;
            ++num;
        } while (i <= rawEnd);
        double average = (double) sum / num;
        System.out.println("Среднее арифметическое:" + average);

        int j = rawBegin;
        int sumEven = 0;
        int numEven = 0;
        do {
            if (j % 2 == 0) {
                sumEven += j;
                ++numEven;
            }
            j++;
        } while (j <= rawEnd);
        double averageEven = (double) sumEven / numEven;
        System.out.println("Среднее арифметическое четных чисел:" + averageEven);
    }
}
