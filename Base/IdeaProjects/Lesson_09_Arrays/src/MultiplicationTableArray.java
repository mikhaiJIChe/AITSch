/*
•Написать функцию, которая создает двумерный массив с таблицей умножения
•Размер таблицы должен быть параметром функции
•Вызвать функцию и распечатать результат в main
*/

public class MultiplicationTableArray {
    public static int[][] getMultiplicationTable(int maxNumber) {
        int[][] multiplicationTable = new int[maxNumber][maxNumber];

        for (int i = 0; i < maxNumber; i++) {
            for (int j = 0; j < maxNumber; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiplicationTable;
    }

    public static void printTable(int[][] array) {

        System.out.printf("%3s%s", "", "|");
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("%4d", i + 1);
        }

        System.out.println();
        System.out.printf("%s", "---|");

        for (int[] e: array) {
            System.out.printf("%s", "----");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d%s", i + 1, "|");
            for (int j = 0; j < array[0].length; j++) {
                if (j < array[0].length - 1) {
                    System.out.printf("%4d", array[i][j]);
                } else {
                    System.out.printf("%4d%n", array[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] multiplicationTable = getMultiplicationTable(10);

        printTable(multiplicationTable);
    }
}
