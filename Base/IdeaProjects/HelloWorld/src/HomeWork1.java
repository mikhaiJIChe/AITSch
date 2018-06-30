public class HomeWork1 {
    public static void main(String[] args) {
        int a = 25;
        int b = a - 15;
        int c = a * b;

        double x = Math.pow(a, b) / ((double) c * a * b);
        double sq = Math.PI * (Math.abs(b * b - a * a));
        double mx = Math.max(a, b);

        System.out.println(x);
        System.out.println("площадь: " + sq);
        System.out.println("макс: " + mx);
    }
}
