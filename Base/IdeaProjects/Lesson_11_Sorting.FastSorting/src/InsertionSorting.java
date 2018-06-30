/*
Задача на курс «Сортировка вставками»
• Пусть i – индекс первого элемента неотсортированной части
• Запоминаем в переменную temp элемент array[i]
• Идем справа налево по отсортированной части при помощи счетчика j, сначала он равен i – 1
• Если j < 0 или temp >= array[j], то заканчиваем идти. Вставляем temp по индексу j + 1. На этом итерация завершена
• Иначе сдвигаем array[j] вправо: array[j + 1] = array[j]
 */

import java.util.Arrays;

public class InsertionSorting {
    public static int[] sortArrayInsertion(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            for (int j = i - 1; ; j--) {
                if (j < 0 || temp >= array[j]) {
                    array[j + 1] = temp;
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {20, 29, 16, 65, 15, 92, 46, 100};

        System.out.println("Исходный ряд: " + Arrays.toString(array));

        System.out.println("Отсортированный ряд: " + Arrays.toString(sortArrayInsertion(array)));

    }
}
