package company;

public class Main {
    public static void main(String[] args) {

        int rawCount = 0;
        for (int i = 1; i <= 100; ++i) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                continue;
            }
            rawCount++;
            if (rawCount % 10 != 0) {
                System.out.printf("%4d", i);
            } else {
                System.out.printf("%4d%n", i);
            }
        }
        System.out.println();
        System.out.println("Чисел в ряду: " + rawCount);
    }
}