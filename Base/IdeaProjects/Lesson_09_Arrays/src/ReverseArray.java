//•Переставить элементы массива в обратном порядке

import java.util.Arrays;

public class ReverseArray {

    public static int[] getReverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {21, 3, 846, 53, 1, 3, 2, 13, 654, 8};
        System.out.println("Исходный ряд: " + Arrays.toString(array));

        System.out.println("Обратный ряд: " + Arrays.toString(getReverseArray(array)));
    }
}
