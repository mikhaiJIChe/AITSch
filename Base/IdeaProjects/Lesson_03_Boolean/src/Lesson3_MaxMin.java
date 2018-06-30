/* Прочитать из консоли 2 целых числа
Вывести наибольшее и наименьшее из них
Сделать данную задачу при помощи if-else и при помощи тренарного оператора
 */

import java.util.Scanner;

public class Lesson3_MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два целых числа");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int max1;
        if (num1 > num2) {
            max1 = num1;
        } else {
            max1 = num2;
        }
        int min1;
        if (num1 < num2) {
            min1 = num1;
        } else {
            min1 = num2;
        }

        int min2 = (num1 < num2) ? num1 : num2;
        int max2 = (num1 > num2) ? num1 : num2;

        System.out.printf("Наибольшее число = %d, Наименьшее число = %d%n", max1, min1);
        System.out.printf("Наибольшее число = %d, Наименьшее число = %d", max2, min2);
    }
}
