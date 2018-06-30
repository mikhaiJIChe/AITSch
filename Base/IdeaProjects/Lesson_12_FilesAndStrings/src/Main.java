import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"), "windows-1251" ))       {
            scanner.useLocale(Locale.US);
            // дальше работаем со сканнером как обычно
            int count = scanner.nextInt();
            double[] a = new double[count + 5];
            int i = 0;
            while (scanner.hasNext()) {
                a[i] = scanner.nextDouble();
                System.out.print(a[i] + ", ");
                i++;
            }
            // теперь close не нужен – он вызовется сам: // когда мы все прочитали, сканнер нужно закрыть
        }
    }
}
