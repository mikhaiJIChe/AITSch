import java.util.Scanner;

public class Lesson4_1Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Введите тескт");
                String text = scanner.nextLine();
                System.out.println(text);
                break;
            case "sum":
                System.out.println("Введите 2 числа");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                double sum = num1 + num2;
                System.out.println("Sum = " + sum);
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}
