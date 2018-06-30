/*
Задача на курс «Сортировка выбором»:
•Шаг 1: линейно ищем минимальный элемент в массиве и обмениваем его с первым элементом
•Шаг 2: линейно ищем минимальный элемент в массиве, начиная со второго элемента, обмениваем его со вторым элементом
•…
•Шаг N-1: ставим минимальный элемент из последних двух на N-1 место
 */

import java.util.Arrays;

public class SortingByChoice {
    public static int[] sortByChoice(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int minArray = array[i];
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minArray) {
                    minArray = array[j];
                    indexMin = j;
                }
            }
            array[indexMin] = array[i];
            array[i] = minArray;
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = {10, 29, 16, 65, 15, 59, 94, 92, 46, 100, 6, 42};
        System.out.println("Исходный ряд: " + Arrays.toString(array));

        System.out.println("Отсортированный ряд: " + Arrays.toString(sortByChoice(array)));
    }
}
