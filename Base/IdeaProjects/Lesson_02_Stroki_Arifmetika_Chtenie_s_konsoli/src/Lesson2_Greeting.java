/*написать программу, читающую с консоли длину и ширину прямоугольника,
и печатающую его площадь
 */

import java.util.Scanner;

public class Lesson2_Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s!", name);
    }
}
