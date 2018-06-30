//Написать функцию, которая ищет максимальное число в массиве вещественных чисел

import java.util.Arrays;

public class GetMaxArray {

    public static double getMaxArray(double[] array) {
        double maxArray = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }
        return maxArray;
    }

    public static double[] getRandomDoubleArray(int lengthArray, double rangeBegin, double rangeEnd, int accuracy) {
        double[] array = new double[lengthArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * (rangeEnd - rangeBegin) + rangeBegin;
            array[i] = Math.round(array[i] * Math.pow(10, accuracy)) / Math.pow(10, accuracy);
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = getRandomDoubleArray(10, -10, 10, 1);//{1.5, 5.1, 0.3, 15.58, 31, -85, 35.4, -16, 78, 12, 45};
        System.out.println("Array = " + Arrays.toString(array));

        System.out.println("max(Array) = " + getMaxArray(array));
    }
}
