/*
Задача «Число вхождений»
•Прочитать текст из файла, и написать функцию, которая считает количество вхождений некоторой строки в этот текст без учета регистра символов
•Использовать цикл и indexOf, который принимает начальный индекс, с которого искать
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputsCount {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("InputsCount.txt"), "windows-1251")) {
            String searchString = "Bufferedimage";
            searchString = searchString.toLowerCase();
            int inputsCount = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.toLowerCase();
                int start = 0;
                for (; ; ) {
                    start = line.indexOf(searchString, start);
                    if (start == -1) {
                        break;
                    } else {
                        start += searchString.length();
                        inputsCount++;
                    }
                }
            }
            System.out.println("Число вхождений по запросу " + "\""+ searchString + "\": " + inputsCount);
        }
    }
}