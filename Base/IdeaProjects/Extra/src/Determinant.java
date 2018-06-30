/*
ПОСЧИТАТЬ ДЕТЕРМИНАНТ МАТРИЦЫ
 */

import java.util.Scanner;

public class Determinant {

    // функция, создает матрицу случайных вещ. чисел
    public static double[][] getRandomDoubleArray(int arraySize, double from, double to, int accuracy) {
        double[][] array = new double[arraySize][arraySize];

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                array[i][j] = Math.random() * (to - from) + from;
                array[i][j] = Math.round(array[i][j] * Math.pow(10, accuracy)) / Math.pow(10, accuracy);
            }
        }
        return array;
    }

    // функция, создает матрицу, элементы которой вводятся вручную с консоли
    public static double[][] getArrayManually(int arraySize) {
        System.out.println("Введите элементы матрицы " + arraySize + "x" + arraySize + ":");
        Scanner scanner = new Scanner(System.in);
        double[][] a = new double[arraySize][arraySize];
        for (int i = 0; i < a.length; ++i) {
            System.out.println("Введите элементы " + (i + 1) + "го ряда:");
            for (int j = 0; j < a[0].length; ++j) {
                a[i][j] = scanner.nextDouble();
            }
        }
        return a;
    }

    // функция, печатает матрицу
    public static void printArray(double[][] array, int accuracy) {
        for (double[] a : array) {
            System.out.print("|");
            for (double b : a) {
                System.out.printf("%5." + accuracy + "f", b);
            }
            System.out.println(" |");
        }
    }

    public static double getDeterminant(double[][] array) {
        if (array.length == 1) {
            return array[0][0];
        } else if (array.length == 2) {
            return array[0][0] * array[1][1] - array[0][1] * array[1][0];
        }
        double[] det = new double[array.length];
        for (int i = 0; i < array.length; ++i) {
            double[][] minor = new double[array.length - 1][array.length - 1];
            for (int j = 1; j < array.length; ++j) {
                for (int k = 0; k < array.length; ++k) {
                    if (k < i) {
                        minor[j - 1][k] = array[j][k];
                    } else if (k > i) {
                        minor[j - 1][k - 1] = array[j][k];
                    }
                }
            }
            det[i] = Math.pow(-1, i) * array[0][i] * getDeterminant(minor);
        }
        double determinant = 0;
        for (double di : det) {
            determinant += di;
        }
        return determinant;
    }

    public static void main(String[] args) {
        // Создаем матрицу заданного размера со случайными вещ. числами в заданном диапазоне.
        // Также задаем количество знаков после запятой. Можно задать равной нулю, тогда будет матрица целых чисел.
        int accuracy = 1;
        int arraySize = 3;
        double from = 0;
        double to = 3;
        double[][] array = getRandomDoubleArray(arraySize, from, to, accuracy);

        // также можно ввести элементы матрицы вручную с консоли:
//        double[][] array = getArrayManually(arraySize);

        System.out.println("Исходная матрица A:");
        printArray(array, accuracy);

        System.out.printf("Определитель матрицы A: det(A) = %." + accuracy * arraySize + "f", getDeterminant(array));
    }
}