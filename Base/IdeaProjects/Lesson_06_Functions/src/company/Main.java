package company;

public class Main {

    public static void main(String[] args) {
	double a = 5.55;
	int aa = (int) Math.round(a % 1 * 100);
	System.out.println(aa);
    }
}
