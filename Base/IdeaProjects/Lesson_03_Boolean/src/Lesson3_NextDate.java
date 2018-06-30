/*
Программа запрашивает сегодняшнюю дату, и выдает дату следующего дня
•Например, входные данные: 31 12 2015, на выходе: 01.01.2016
 */

import java.util.Scanner;

public class Lesson3_NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату");
        System.out.print("day = ");
        int day = scanner.nextInt();
        System.out.print("month = ");
        int month = scanner.nextInt();
        System.out.print("year = ");
        int year = scanner.nextInt();

        if (day <= 0 || month <= 0 || month > 12 || year <= 0 || year > 9999) {
            System.out.println("Некорректная дата");
        } else {
            int daysInMonth = 31;
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            }

            if (day > daysInMonth) {
                System.out.println("Некорректная дата");
            } else {
                int monthNext = month;
                int dayNext = day + 1;
                int yearNext = year;

                if (day == daysInMonth) {
                    if (month != 12) {
                        monthNext = month + 1;
                        dayNext = 1;
                        yearNext = year;
                    } else {
                        monthNext = 1;
                        dayNext = 1;
                        yearNext = year + 1;
                    }
                }
                System.out.printf("Следующая дата: %02d %02d %04d", dayNext, monthNext, yearNext);
            }
        }
    }
}
