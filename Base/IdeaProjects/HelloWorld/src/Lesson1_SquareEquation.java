public class Lesson1_SquareEquation {
    public static void main(String[] args) {

        double a = 1; //в переменные положили коэффициенты
        double b = 2; //уравнение ax^2+bx+c=0
        double c = 4;

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("Корней нет");
        } else {
            double x1 = (-b + Math.sqrt(d)) / 2 / a;
            double x2 = (-b - Math.sqrt(d)) / 2 / a;
            System.out.println("x1=" + x1 + " m/s");
            System.out.println("x2=" + x2 + " m/s");
        }
    }
}

