/*
Задача на курс «Быстрая сортировка»
•Как нужным образом поделить массив на две части?
1.Запускаем два счетчика: i слева направо от left до right; j – справа налево от right до left
2.Сначала двигаем i, пока не встретим элемент, который >= x. После этого начинаем двигать j, пока не встретим элемент, который <= x
3.Если i <= j, то делаем обмен элементов по этим индексам, затем сдвигаем оба счетчика еще на один элемент и на шаг 2.
 Иначе – завершаем процесс и на шаг 4
4.В этот момент все элементы, которые <= x, находятся левее i, а которые >= x – правее j
5.Если i < right, то вызываем рекурсивно для части от i до right. Если j > left, то и для части от left до j
 */

import java.util.Arrays;

public class QuickSorting {

    public static void quickSort(int[] array, int left, int right) {

        if (left >= right) {
            return;
        }

        int x = array[left];
        //Запускаем два счетчика: i слева направо от left до right; j – справа налево от right до left
        int i = left;
        int j = right;
        while (i <= j) { //Если i <= j, то..Иначе – завершаем процесс
            // Сначала двигаем i, пока не встретим элемент, который >= x.
            while (array[i] < x) {
                i++;
            }
            // После этого начинаем двигать j, пока не встретим элемент, который <= x
            while (array[j] > x) {
                j--;
            }
            // Если i <= j, то делаем обмен элементов по этим индексам, затем сдвигаем оба счетчика еще на один элемент и на шаг 2.
            if (i <= j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
                j--;
            }
        }
        // Если i < right, то вызываем рекурсивно для части от i до right.
        if (i < right) {
            quickSort(array, i, right);
        }
        //Если j > left, то и для части от left до j
        if (j > left) {
            quickSort(array, left, j);
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 10, 9, 6, 5, 1, 9, 4};
        int left = 0;
        int right = array.length - 1;

        System.out.println("Исходный ряд: " + Arrays.toString(array));

        quickSort(array, left, right);
        System.out.println("Отсортированный ряд: " + Arrays.toString(array));
    }
}

