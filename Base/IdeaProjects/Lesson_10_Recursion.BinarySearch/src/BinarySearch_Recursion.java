public class BinarySearch_Recursion {


    public static int binarySearchRecursion(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;

        if (x == a[middle]) {
            return middle;
        } else if (x > a[middle]) {
            return binarySearchRecursion(a, middle + 1, right, x);
        } else {
            return binarySearchRecursion(a, left, middle - 1, x);
        }
    }


    public static void main(String[] args) {
        int[] a = {6, 10, 15, 16, 29, 42, 46, 65, 92, 100};
        int left = 0;
        int right = a.length - 1;
        int x = 15;

        System.out.println(binarySearchRecursion(a, left, right, x));
    }
}
