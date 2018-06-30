/*
Прочитать с консоли три числа – два операнда и код команды
•Код команды должен быть от 1 до 4
•Если он равен 1, то выполнить сложение первых двух чисел. Если 2, то вычитание, если 3, то умножение, если 4, то деление.
•Если ввели число не от 1 до 4, то вывести, что неизвестная операция
•Использовать switch
 */

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Lesson4_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите операнд 1");
        double operand1 = scanner.nextDouble();

        System.out.println("Введите операнд 2");
        double operand2 = scanner.nextDouble();

        System.out.println("Введите код команды");
        int commandCode = scanner.nextInt();

        switch (commandCode) {
            case 1:
                double result = operand1 + operand2;
                System.out.println("Результат: " + result);
                break;
            case 2:
                result = operand1 - operand2;
                System.out.println("Результат: " + result);
                break;
            case 3:
                result = operand1 * operand2;
                System.out.println("Результат: " + result);
                break;
            case 4:
                result = operand1 / operand2;
                System.out.println("Результат: " + result);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
