public class CreateAndPrintArray {
    public static void main(String[] args) {
        int[] array = new int[100];


        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        /*for (int i = 0; i < array.length; i++) {
            System.out.print("   " + array[i]);
        }*/

        for (int e: array) {
            System.out.print("   " + e);
        }
    }
}
