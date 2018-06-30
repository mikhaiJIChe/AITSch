/*
•Объявить в классе несколько функций с именем getTypeSize
•Каждая функция должна принимать один аргумент одного из следующих типов: byte, short, int, long, float, double
•Функция должна возвращать int – количество байт, требуемых под переменную данного типа
•В функции main сделать по одному примеру использования для каждой перегруженной функции
 */

public class Lesson6_Overload {

    public static int getTypeSize(byte x) {
        return 1;
    }

    public static int getTypeSize(short x) {
        return 2;
    }

    public static int getTypeSize(int x) {
        return 4;
    }

    public static int getTypeSize(long x) {
        return 8;
    }

    public static int getTypeSize(float x) {
        return 4;
    }

    public static int getTypeSize(double x) {
        return 8;
    }

    public static void main(String[] args) {
        byte x1 = 1;
        int sizeTypeByte = getTypeSize(x1);
        System.out.println("x1: " + sizeTypeByte + " байт");

        short x2 = 1;
        int sizeTypeShort = getTypeSize(x2);
        System.out.println("x2: " + sizeTypeShort + " байт");

        int x3 = 1;
        int sizeTypeInt = getTypeSize(x3);
        System.out.println("x3: " + sizeTypeInt + " байт");

        long x4 = 1;
        int sizeTypeLong = getTypeSize(x4);
        System.out.println("x4: " + sizeTypeLong + " байт");

        float x5 = 1;
        int sizeTypeFloat = getTypeSize(x5);
        System.out.println("x5: " + sizeTypeFloat + " байт");

        double x6 = 1;
        int sizeTypeDouble = getTypeSize(x6);
        System.out.println("x6: " + sizeTypeDouble + " байт");
    }
}
