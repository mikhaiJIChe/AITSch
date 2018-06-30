/* написать программу, которая читает с консоли целое число и печатает, что данное число положительное...равно 0... отрицательное
-использовать цепочку if-else
 */
import java.util.Scanner;
public class Lesson3_PositiveAndNegativeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //java.util.Scanner

        double num = scanner.nextDouble();

        if (num > 0) {
            System.out.println("Данное число положительное");
        } else if (num == 0) {
            System.out.println("Данное число равно нулю");
        } else {
            System.out.println("Данное число отрицательное");
        }
    }
}
