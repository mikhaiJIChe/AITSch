/*
•В программе должна быть некоторая загаданная фиксированная строка
•Далее программа предлагает пользователю ввести строку, пользователь вводит
•Если введена та загаданная строка, то программа должна завершаться
•Иначе пользователю дается следующая попытка для ввода и т.д., пока не введет правильно. При этом каждый раз пользователю должно выдаваться приглашение для ввода
•В этой задаче используйте бесконечный цикл и break
 */

import java.util.Scanner;

public class Lesson5_Break {
    public static void main(String[] args) {
        String sTrue = "qwerty";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        for (;;) {
            String sEnter = scanner.nextLine();
            if (sTrue.equals(sEnter)) {
                System.out.println("Верно");
                break;
            } else {
                System.out.println("Попробуйте ещё раз:");
            }
        }
    }
}
