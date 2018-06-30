/* прочитать с консоли целое число
если число положительное, то напечатать "данное число положительное"
 - Напечатайте число четное если оно нечетное и что кратно 5 если оно явл. таковым
 */

import java.util.Scanner;

public class Lesson3_if_chains {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //java.util.Scanner

        double num = scanner.nextDouble();

        if (num > 0) {
            System.out.println("Данное число положительное");
        }
        if (num % 2 == 0) {
            System.out.println("Данное число четное");
        } else {
            System.out.println("Данное число нечетное");
        }
        if (num % 5 == 0) {
            System.out.println("Данное число кратно 5");
        }
    }
}
