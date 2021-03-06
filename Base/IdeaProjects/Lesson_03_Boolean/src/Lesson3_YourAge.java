/*
Программа просит ввести пользователя свой возраст от 1 до 112 включительно, после чего выводит сообщение «Вам x лет»
•При этом учесть, что для разных чисел разные склонения
•Например, «3 года», «99 лет» и т.д.
•Если введут слишком малое или слишком большое число, то выведите, что «Вы слишком малы» или стары
•Старайтесь использовать логические связки, если это возможно
 */

import java.util.Scanner;

public class Lesson3_YourAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваш возраст");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы");
        } else if (age > 112) {
            System.out.println("Вы слишком стары");
        } else if (age / 10 % 10 == 1) {
            System.out.println("Вам " + age + " лет");
        } else if (age % 10 >= 5 && age % 10 <= 9) {
            System.out.println("Вам " + age + " лет");
        } else if (age % 10 == 1) {
            System.out.println("Вам " + age + " год");
        } else {
            System.out.println("Вам " + age + " года");
        }
    }
}