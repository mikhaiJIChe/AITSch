/*
Задача на курс "Палиндром":
•Объявить некоторую строковую переменную в программе
•Проверить, что данная строка является палиндромом – то есть читается одинаково слева направо и справа налево.
•При проверке не учитывать регистр символов, учитывать только буквы
•Пример палиндрома: «Аргентина манит негра»
•Требование: сделать без создания новой строки и без удаления символов из строки
 */

public class Palindrome {

    public static boolean isPalindrome(String textLine) {

        int j = 0;
        int k = textLine.length() - 1;

        while (j < k) {
            while (!Character.isLetter(textLine.charAt(j)) && j < k) {
                j++;
            }

            while (!Character.isLetter(textLine.charAt(k)) && k > j) {
                k--;
            }

            if (Character.toLowerCase(textLine.charAt(j)) != Character.toLowerCase(textLine.charAt(k))) {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }

    public static void main(String[] args) {
        String textLine = "    ";//"! Яд ем,    как м55е45%д... *~* 354 !   %%%  я%%";//"  Арг24ен,.тин22а ма2нит не//.';гра&&";

        System.out.println(textLine);

        if (isPalindrome(textLine)) {
            System.out.println("Перед Вами палиндром!");
        } else {
            System.out.println("Выражение не является палиндромом.");
        }
    }
}
