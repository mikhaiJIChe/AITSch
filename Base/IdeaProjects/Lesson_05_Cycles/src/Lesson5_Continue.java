/*
•Распечатать числа от 0 до 100, кроме числа 5, кроме всех чисел, кратных 3 и кроме чисел из диапазона от 60 до 80 включительно
•* Сделать версию с одним if’ом
•* Переписать при помощи while
 */

public class Lesson5_Continue {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 100 ; i++) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                continue;
            }
            System.out.printf("%5d", i);
        }

        System.out.println();
        System.out.println();

        // то же самое с помощью while
        int i = 1;
        while (i <= 100) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                ++i;
                continue;
            }
            System.out.printf("%5d", i);
            ++i;
        }
    }
}
