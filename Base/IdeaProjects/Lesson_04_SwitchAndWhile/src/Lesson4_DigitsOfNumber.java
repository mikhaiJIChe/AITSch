/*
•Прочитать с консоли целое число
•Найти сумму его цифр
•* Ниже в коде найдите сумму только тех цифр числа, которые являются нечетными числами
•* Ниже в коде найдите максимальную цифру числа
 */

import java.util.Scanner;

public class Lesson4_DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите целое число");
        int number = scanner.nextInt();

        int i = 1; // соответствует номеру разряда
        int sumDigit = 0;
        int sumDigitOdd = 0;
        int maxDigit = 0;

        int digitsCount = (int) Math.log10(number) + 1;
        System.out.println(digitsCount);
        while (i <= digitsCount) {
            int digit = (int) ((number / (Math.pow(10, i - 1))) % 10);
            sumDigit += digit;
            if (digit % 2 == 1) {
                sumDigitOdd += digit;
            }
            if (maxDigit < digit) {
                maxDigit = digit;
            }
            i++;
        }
        System.out.println("Сумма разрядов числа: " + sumDigit);
        System.out.println("Сумма нечетных разрядов числа: " + sumDigitOdd);
        System.out.println("Максимальный разряд числа: " + maxDigit);
    }
}
