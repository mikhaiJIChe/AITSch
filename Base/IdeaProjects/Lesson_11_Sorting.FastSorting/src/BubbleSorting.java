/*
Задача на курс «Сортировка пузырьком»
•Выполняем проход по массиву слева направо, сравнивая и при необходимости меняя местами соседние элементы
•После этого максимальный элемент окажется последним
•Повторяем процесс N-1 раз (или меньше, если за некоторую итерацию не произошло ни одного обмена)
 */

import java.util.Arrays;

public class BubbleSorting {

    public static int[] sortArrayBubble(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int countSwaps = 0;
            for (int j = 1; j < array.length - i; ++j) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    countSwaps++;
                }
            }
            if (countSwaps == 0) {
                return array;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 29, 16, 65, 15, 92, 46, 100};

        System.out.println("Исходный ряд: " + Arrays.toString(array));

        System.out.println("Отсортированный ряд: " + Arrays.toString(sortArrayBubble(array)));
    }
}
