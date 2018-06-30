/*
•Написать функцию, которая проверяет, что массив отсортирован по возрастанию
•И написать функцию, которая проверяет, что массив отсортирован по убыванию
*/

import java.util.Arrays;

public class SortingCheck {
    public static boolean isIncreaseSorting(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreaseSorting(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] array = {21, 3, 846, 53, 1, 3, 2, 13, 654};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(array));

        boolean increaseSorting = isIncreaseSorting(array);
        System.out.println("Сортировка по возрастанию:\n" + increaseSorting);

        boolean decreaseSorting = isDecreaseSorting(array);
        System.out.println("Сортировка по убыванию:\n" + decreaseSorting);
    }
}
