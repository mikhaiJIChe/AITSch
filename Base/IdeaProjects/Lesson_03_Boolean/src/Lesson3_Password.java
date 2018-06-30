/*
•В программе объявить строковую переменную, хранящую пароль
•С консоли прочитать строку, сравнить её с этим паролем. Если строка совпала (проверять при помощи equals), то выдать сообщение, что пароль верный
•Если строка не совпала с паролем, и её длина (использовать length) больше длины пароля, то сказать что пароль неверный и строка слишком длинная
•Если строка не совпала с паролем, и её длина меньше, то сказать, что пароль неверный строка слишком короткая
•Иначе сказать, что пароль неверный
 */

import java.util.Scanner;

public class Lesson3_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwordTrue = "Qwerty123";

        System.out.println("Введите пароль");
        String passwordEnter = scanner.nextLine();

        int passwordTrueLength = passwordTrue.length();
        int passwordEnterLength = passwordEnter.length();

        if (passwordTrue.equals(passwordEnter)) {
            System.out.println("Пароль верный");
        } else if (passwordEnterLength > passwordTrueLength) {
            System.out.println("Cтрока слишком длинная");
        } else if (passwordEnterLength < passwordTrueLength) {
            System.out.println("Cтрока слишком короткая");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}
