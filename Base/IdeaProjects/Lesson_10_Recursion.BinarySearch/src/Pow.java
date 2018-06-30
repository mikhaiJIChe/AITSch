public class Pow {
    public static int getPow1(int number, int degree) {
        if (degree == 0) {
            return 1;
        }
        return getPow1(number, degree - 1) * number;
    }

    public static int getPow2(int number, int degree) {

        if (degree == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= degree; ++i) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPow1(2, 10));
        System.out.println(getPow2(2, 16));
    }
}



