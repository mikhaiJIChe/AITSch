/*
•Распечатать числа от 1 до 100 при помощи цикла while, но выводить по 10 чисел в строке, дальше делать перевод строки
•    1   2   3   4   5   6   7   8   9  10
    11  12  13  14  15  16  17  18  19  20
    …
•* Выводить числа ровно, чтобы они были друг под другом. Использовать System.out.printf
•* Распечатать числа от x до y по n в строке
 */

public class Lesson4_10NumbersInline {
    public static void main(String[] args) {
        int i = 1;
        int number = 0;
        while (i <= 100) {
            number++;
            if (i % 10 == 0) {
                System.out.printf("%7d%n", number);
            } else {
                System.out.printf("%7d", number);
            }
            i++;
        }
    }
}
