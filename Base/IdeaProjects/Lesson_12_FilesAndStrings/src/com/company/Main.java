package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            scanner.useLocale(Locale.US);
            // дальше работаем со сканнером как обычно
            int count = scanner.nextInt();
            double[] a = new double[count];
            for (int i = 0; i < count; ++i) {
                a[i] = scanner.nextDouble();
            }
            // теперь close не нужен – он вызовется сам: // когда мы все прочитали, сканнер нужно закрыть
        }
    }
}
