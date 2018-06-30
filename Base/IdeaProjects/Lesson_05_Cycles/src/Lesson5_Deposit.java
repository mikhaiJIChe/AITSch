/*
•Напишите программу, которая рассчитывает сумму банковского вклада с заданной ставкой % годовых на заданное число месяцев
•Вклад с капитализацией – считаем, что после истечения каждого месяца к сумме вклада прибавляется процент от суммы вклада на начало месяца
•Также распечатать прибыль
 */

public class Lesson5_Deposit {
    public static void main(String[] args) {

        double depositIn = 100000;

        double percentYear = 5.85;
        double percentAll = 100;
        int monthsInYear = 12;
        int monthsInPeriod = 24;

        double monthAugmentation = percentYear / percentAll / monthsInYear;

        double depositOut = depositIn;
        for (int i = 1; i <= monthsInPeriod; i++) {
            double monthProfit = monthAugmentation * depositOut;
            depositOut += monthProfit;
        }
        System.out.printf("Внесенная сумма: %.2f руб.%n", depositIn);
        System.out.printf("Итоговая сумма: %.2f руб.%n", depositOut);
        System.out.printf("Прибыль: %.2f руб.%n", depositOut - depositIn);

    }
}
