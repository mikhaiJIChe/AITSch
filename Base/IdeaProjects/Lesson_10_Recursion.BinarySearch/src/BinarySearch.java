/*
Задача "Бинарный поиск".
Реализовать вариант бинарного поиска без рекурсии
1.Вычисляем средний индекс middle через left и right
2.Смотрим элемент по индексу middle. Если он равен x, то всё, нашли
3.Если x > a[middle], то ищем в правой части, положим left = middle + 1, и на шаг 1
4.Если x < a[middle], то ищем в левой части, положим right = middle – 1, и на шаг 1
5.Если left > right, то заканчиваем алгоритм, выдаем -1
*/

public class BinarySearch {
    public static int binarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        for (; ; ) {
            int middle = (right + left) / 2;

            if (x == array[middle]) {
                return middle;
            } else if (x > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

            if (left > right) {
                return -1;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {6, 10, 15, 16, 29, 42, 46, 65, 92, 100};
        int x = 15;

        System.out.println(binarySearch(a, x));
    }
}
