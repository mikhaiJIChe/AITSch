/*
•* Распечатать числа от x до y по n в строке
•* Выводить числа ровно, чтобы они были друг под другом. Использовать System.out.printf
 */

import java.util.Scanner;

public class Lesson4_NumbersInLine_Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = scanner.nextInt();
        System.out.println("Введите последнее число");
        int y = scanner.nextInt();
        System.out.println("Введите количество чисел в строке");
        int n = scanner.nextInt();

        int i = 1;
        int number = x;
        int rawLength = y - x + 1;
        while (i <= rawLength) {
            if (i % n == 0) {
                System.out.printf("%7d%n", number);
            } else {
                System.out.printf("%7d", number);
            }
            number++;
            i++;
        }
    }
}
