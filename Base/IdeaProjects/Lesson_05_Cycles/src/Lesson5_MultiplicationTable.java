/*
•Вывести в консоль таблицу умножения чисел от 1 до 10 при помощи циклов for
•Но программа должна работать верно и если попросят таблицу от 1 до другого числа
•Примерно так, только без границ клеток, консоль этого не позволяет
•Добейтесь чтобы числа были выровнены по столбцам (добейте числа нужным количеством пробелов)
•* Добавьте «шапку» таблицы, отделите ее символами, например, | и --
 */

public class Lesson5_MultiplicationTable {
    public static void main(String[] args) {

        int numMax = 10;

        // top:
        String topName = " Multiplication Table ";
        int nameLength = topName.length();
        int columnWidth = 4;
        int tableWidth = (numMax + 1) * columnWidth;

        for (int i = 1; i <= tableWidth; i++) {
            if (i <= (tableWidth - nameLength) / 2 || i > (tableWidth + nameLength) / 2) {
                System.out.print("|");
            } else if (i == (tableWidth - nameLength) / 2 + 1) {
                System.out.print(topName);
            }
        }
        System.out.println();
        for (int i = 1; i <= tableWidth; i++) {
            System.out.print("-");
        }
        System.out.println();

        // body:
        System.out.printf("%4s", "");
        for (int i = 1; i <= numMax; i++) {
            System.out.printf("%4d", i);
        }
        for (int i = 1; i <= numMax; i++) {
            System.out.println();
            System.out.printf("%4d", i);
            for (int j = 1; j <= numMax; j++) {
                System.out.printf("%4d", i * j);
            }
        }
    }
}