/*
•Написать функцию, которая ищет в строке подстроку максимальной длины, состоящую из одного и того же символа, и выдает эту максимальную длину
•Например, есть строка "аааббдеггггв", должно выдаться число 4, потому что есть 4 подряд символа «г», и это максимальная подстрока, где подряд идет один и тот же символ
•Функция должна работать без учета регистра
 */

import java.util.Scanner;

public class MaxSubString {
    public static int getMaxSubStringLength(String enteredLine) {
        int sameSymbolsMaxLength = 1;

        if (enteredLine.length() == 0) {
            sameSymbolsMaxLength = 0;
        } else if (enteredLine.length() > 1) {
            int sameSymbolsCount = 1;
            for (int i = 1; i < enteredLine.length(); i++) {
                char c1 = Character.toLowerCase(enteredLine.charAt(i - 1));
                char c2 = Character.toLowerCase(enteredLine.charAt(i));

                if (c2 == c1) {
                    sameSymbolsCount++;
                    if (sameSymbolsMaxLength < sameSymbolsCount) {
                        sameSymbolsMaxLength = sameSymbolsCount;
                    }
                } else {
                    sameSymbolsCount = 1;
                }
            }
        }
        return sameSymbolsMaxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String enteredLine = scanner.nextLine();

        System.out.println("Длина максимальной подстроки: " + getMaxSubStringLength(enteredLine));
    }
}