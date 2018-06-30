/*
Задача «Разбиение строки»
•Разбить строку “1, 2, 3, 4, 5” и получить массив из этих чисел и найти их сумму
•Использовать split и Integer.parseInt
 */

public class SplitString {
    public static void main(String[] args) {
        String numbersLine = "1, 2, 3, 4, 5";
        String[] numbers = numbersLine.split(", ");
        int sum = 0;
        for (String e: numbers) {
            int num = Integer.parseInt(e);
            sum += num;
        }
        System.out.println("Сумма чисел в строке: " + sum);
    }
}
