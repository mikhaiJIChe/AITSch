import java.util.Scanner;

public class Lesson5_PrimeNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = scanner.nextInt();

        System.out.printf("%5d", 2);
        for (int i = 3; i <= n; ++i) {
            int j = 2;
            while (i % j != 0) {
                j++;
            }
            if (i == j) {
                System.out.printf("%5d", i);
            }
        }
    }
}
