public class GetIndexOfMin {
    public static int getMinIndex(int[] array, int start) {

        int minArray = array[start];
        int index = start;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > minArray) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 52, 0, 27, 2, 222};
        System.out.println(getMinIndex(array, 3));
    }
}

