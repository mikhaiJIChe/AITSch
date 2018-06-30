/*
Программа запрашивает сегодняшнюю дату, и выдает дату следующего дня
•Например, входные данные: 31 12 2015, на выходе: 01.01.2016
 */

import java.util.Scanner;

public class Lesson3_NextDay2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату");
        System.out.print("day = ");
        int day = scanner.nextInt();
        System.out.print("month = ");
        int month = scanner.nextInt();
        System.out.print("year = ");
        int year = scanner.nextInt();

        if (month > 12) {
            System.out.println("Error: wrong month");
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                int maxday = 30;
                if (day == maxday) {
                    int monthNext = month + 1;
                    int dayNext = 1;
                    int yearNext = year;
                    System.out.printf(" %02d %02d %04d", dayNext, monthNext, yearNext);
                }
                if (day < maxday) {
                    int monthNext = month;
                    int dayNext = day + 1;
                    int yearNext = year;
                    System.out.printf(" %02d %02d %04d", dayNext, monthNext, yearNext);
                }
                if (day > maxday) {
                    System.out.println("Error: wrong day");
                }
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                int maxday = 31;
                if (day == maxday) {
                    if (month != 12) {
                        int monthNext = month + 1;
                        int dayNext = 1;
                        int yearNext = year;
                        System.out.printf(" %02d %02d %04d", dayNext, monthNext, yearNext);
                    } else {
                        int monthNext = 1;
                        int dayNext = 1;
                        int yearNext = year + 1;
                        System.out.printf(" %02d %02d %04d", dayNext, monthNext, yearNext);
                    }
                }
                if (day < maxday) {
                    int monthNext = month;
                    int dayNext = day + 1;
                    int yearNext = year;
                    System.out.printf(" %02d %02d %04d", dayNext, monthNext, yearNext);
                }
                if (day > maxday) {
                    System.out.println("Error: wrong day");
                }
            }
            if (month == 2) {
                if (year % 4 == 0) {
                    int maxday = 29;
                    if (day == maxday) {
                        int monthNext = month + 1;
                        int dayNext = 1;
                        int yearNext = year;
                        System.out.printf(" %02d %02d %04d", dayNext, monthNext, yearNext);
                    }
                    if (day < maxday) {
                        int monthNext = month;
                        int dayNext = day + 1;
                        int yearNext = year;
                        System.out.printf(" %02d %02d %04d", dayNext, monthNext, yearNext);
                    }
                    if (day > maxday) {
                        System.out.println("Error: wrong day");
                    }
                } else {
                    int maxday = 28;
                    if (day == maxday) {
                        int monthNext = month + 1;
                        int dayNext = 1;
                        int yearNext = year;
                        System.out.printf(" %02d %02d %04d", dayNext, monthNext, yearNext);
                    }
                    if (day < maxday) {
                        int monthNext = month;
                        int dayNext = day + 1;
                        int yearNext = year;
                        System.out.printf(" %02d %02d %04d", dayNext, monthNext, yearNext);
                    }
                    if (day > maxday) {
                        System.out.println("Error: wrong day");
                    }
                }
            }
        }
    }
}
