import java.util.Locale;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //java.util.Scan
        //scanner.useLocale(Locale.US );

        System.out.println("ВВедите число: ");
        double a = scanner.nextDouble();

        System.out.println("Вы ввели " + a);
    }
}
