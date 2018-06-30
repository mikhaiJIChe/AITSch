/*
•Написать программу, вычисляющую среднее арифметическое чисел из некоторого диапазона чисел (например, от 3 до 17)
•Концы диапазона задать переменными, начальное число берите > 1, чтобы было посложнее
•Среднее арифметическое чисел – нужно сумму всех чисел поделить на количество этих чисел
•Ниже в этом же классе - найти среднее арифметическое только четных чисел из этого диапазона чисел
 */

import java.util.Scanner;

public class Lesson4_Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое и последнее числа диапазона");
        int rawBegin = scanner.nextInt(); //начало диапазона
        int rawEnd = scanner.nextInt(); //конец диапазона

        int i = rawBegin;
        int sum = 0;
        int num = 0;
        while (i <= rawEnd) {
            sum += i;
            i++;
            ++num;
        }
        double average = (double) sum / num;
        System.out.println("Среднее арифметическое: " + average);

        int j = rawBegin;
        int sumEven = 0;
        int numEven = 0;
        while (j <= rawEnd) {
            if (j % 2 == 0) {
                sumEven += j;
                ++numEven;
            }
            j++;
        }
        double averageEven = (double) sumEven / numEven;
        System.out.println("Среднее арифметическое четных чисел: " + averageEven);

    }
}
