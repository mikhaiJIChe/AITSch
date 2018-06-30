/*
Написать функцию, которая ищет указанное число в массиве, и если находит его, то выдает его индекс.
А если не находит, то выдает -1
*/


import java.util.Arrays;

public class FindElement {

    public static int getElementIndex(int number, int[] array) {

        for (int i = 0; i < array.length; ++i) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number = 354;
        int[] array = {13, 24, 48, 6, 545, 4, 35, 435, 43, 54, 354};

        System.out.println("Массив:" + Arrays.toString(array));
        System.out.println("Число: " + number);

        int index = getElementIndex(number, array);

        System.out.println("Индекс искомого числа: " + index);
    }
}
