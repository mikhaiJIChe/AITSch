/*
Задача «Подсчет символов»
•Прочитать с консоли строку
•Вывести число букв в этой строке
•Вывести число цифр в этой строке
•Вывести число пробелов в этой строке
•Вывести число остальных символов в строке
 */

import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String enteredLine = scanner.nextLine();

        int letterCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int otherSymbolsCount = 0;

        for (int i = 0; i <= enteredLine.length() - 1; ++i) {
            char c = enteredLine.charAt(i);

            if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            } else {
                otherSymbolsCount++;
            }
        }

        System.out.println("В строке:");
        System.out.println(letterCount + " букв");
        System.out.println(digitCount + " цифр");
        System.out.println(spaceCount + " пробелов");
        System.out.println(otherSymbolsCount + " остальных символов");
    }
}
