public class Lesson6 {
    private static double calc3xPlus4y(double x, double y) {
        return 3 * x + 4 * y;
    }

    public static double getAverage(int start, int end) {
        int count = 0;
        int sum = 0;
        for (int i = start; i <= end; ++i) {
            count++;
            sum += i;
        }
        return (double) sum / count;
    }

    private static int getMax(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    private static int getMin(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        double result3xPlus4y = calc3xPlus4y(8, 9.2);
        System.out.println("Result " + result3xPlus4y);

        double average = getAverage(10, 150);
        System.out.println("Average: " + average);

        double max = getMax(4, 555);
        System.out.println("Max: " + max);

        double min = getMin(4, 555);
        System.out.println("Min: " + min);
    }
}