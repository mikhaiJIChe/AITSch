//•Найти среднее арифметическое элементов массива, которые являются четными числами

import java.util.Arrays;

public class MeanMassive {

    public static double getMeanArrayEven(int[] array) {

        int count = 0;
        int sum = 0;
        for (int e : array) {
            if (e % 2 == 0) {
                sum += e;
                count++;
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        int[] array = {54, 31, 64, 835, 41, 3, 5, 14, 45, 214, 4};
        System.out.println(Arrays.toString(array));

        double meanEven = getMeanArrayEven(array);

        System.out.println();
        System.out.println("Среднее арифметическое четных элементов: " + meanEven);
    }
}
