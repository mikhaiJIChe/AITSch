/*
•Прочитать с консоли год и вывести в консоль, является он високосным или нет
•Старайтесь использовать логические связки, если это возможно
 */

import java.util.Scanner;

public class Lesson3_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не является високосным");
        }
    }
}
