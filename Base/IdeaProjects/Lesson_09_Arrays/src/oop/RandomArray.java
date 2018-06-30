package oop;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static double[] getRandomDoubleArray(int lengthArray, double rangeBegin, double rangeEnd, int accuracy) {
        double[] array = new double[lengthArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * (rangeEnd - rangeBegin) + rangeBegin;
            array[i] = Math.round(array[i] * Math.pow(10, accuracy)) / Math.pow(10, accuracy);
        }

        return array;
    }

    public static int[] getRandomIntArray(int lengthArray, int rangeBegin, int rangeEnd) {
        int[] array = new int[lengthArray];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rangeEnd + 1 - rangeBegin) + rangeBegin;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = getRandomIntArray(12, -3, 18);
        System.out.println(Arrays.toString(array));

        System.out.println();

        double[] array1 = getRandomDoubleArray(12, 3.2, 3.3, 1);
        System.out.println(Arrays.toString(array1));
    }
}
