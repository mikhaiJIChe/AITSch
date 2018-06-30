/*
•Написать функцию, которая принимает массив строк и изменяет его, присваивая элементам эти же строки, но в которых все символы заглавные.
        Для этого использовать метод класса String toUpperCase()
•Пример: String s = “hello”; String b = s.toUpperCase(); // “HELLO”
*/

public class StringArrayUpperCase {

    public static String[] getStringToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
        return array;
    }

    public static void printStringArray(String[] array) {
        for (String e : array) {
            System.out.print(e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array = {"Get ", "string ", "to ", "upper ", "case", ", ", "please."};

        printStringArray(array);
        printStringArray(getStringToUpperCase(array));
    }
}
