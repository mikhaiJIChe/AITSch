/*
Задача «Перевод файла в верх.регистр»
•Написать программу, которая читает строки файла, переводит их в верхний регистр и записывает результат во второй файл
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("output_toUpperCase.txt"); Scanner scanner = new Scanner(new FileInputStream("input_toUpperCase.txt"), "windows-1251" )) {
            while (scanner.hasNextLine()) {
                String c = scanner.nextLine();
                writer.println(c.toUpperCase());
            }
        }
    }
}
