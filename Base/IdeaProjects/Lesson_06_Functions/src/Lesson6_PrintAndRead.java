/*
•Написать функцию, которая объединяет в себе две операции: вывод пользователю приглашения для ввода в консоль и чтение int’а с консоли
•Функция должна принимать строку и возвращать прочитанное число
•Из функции main несколько раз вызвать данную функцию с разными значениями аргументов
•Пример, как функция будет вызываться: int a = printAndRead(“Введите число:”)
 */

import java.util.Scanner;

public class Lesson6_PrintAndRead {

    public static int printAndRead(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);

        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int b = printAndRead("Введите число: ");
        int c = printAndRead("Введите число: ");
    }
}
