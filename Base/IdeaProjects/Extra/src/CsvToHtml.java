import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CsvToHtml {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.out.println("Число введенных аргументов неверное. Нужно ввести 2 аргумента: name1.csv и name2.html. Имена файлов не должны содержать недопустимых символов: >, <, &, # и т.д.");
            return;
        }
        try (PrintWriter writer = new PrintWriter(args[1]); Scanner scanner = new Scanner(new FileInputStream(args[0]))) {

            char splitter = ','; //';';
            char quote = '"';

            String tableStart = "<table>";
            String tableEnd = "</table>";
            String lineStart = "<tr>";
            String lineEnd = "</tr>";
            String cellStart = "<td>";
            String cellEnd = "</td>";
            String cellLine = "<br/>";

            String titleName = "Перевод таблицы из формата .csv в формат .html"; //args[1];

            String tab = "  ";

            writer.println("<!DOCTYPE html>");
            writer.println("<html>");

            writer.println(tab + "<head>");
            writer.println(tab + tab + "<title>" + titleName + "</title>");
            writer.println(tab + "</head>");
            writer.println();

            writer.println(tab + "<body>");

            writer.println(tab + tab + tableStart);

            int quotesCount = 0;
            while (scanner.hasNextLine()) {
                if (quotesCount % 2 == 0) {
                    writer.println(tab + tab + tab + lineStart);
                    writer.print(tab + tab + tab + tab + cellStart);
                }
                String line = scanner.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    char ci = line.charAt(i);

                    if (ci == quote) {
                        quotesCount++;
                        if (quotesCount % 2 == 0 && i < line.length() - 1 && line.charAt(i + 1) == quote) {
                            writer.print(quote);
                        }
                        continue;
                    }
                    if (ci == splitter && quotesCount % 2 == 0) {
                        writer.println(cellEnd);
                        writer.print(tab + tab + tab + tab + cellStart);
                        quotesCount = 0;
                        continue;
                    }
                    if (ci == '<') {
                        writer.print("&lt;");
                        continue;
                    }
                    if (ci == '>') {
                        writer.print("&gt;");
                        continue;
                    }
                    if (ci == '&') {
                        writer.print("&amp;");
                        continue;
                    }
                    writer.print(ci);
                }
                if (quotesCount % 2 == 1) {
                    writer.println();
                    writer.print(tab + tab + tab + tab + tab + cellLine);
                } else {
                    writer.println(cellEnd);
                    writer.println(tab + tab + tab + lineEnd);
                    writer.println();
                }
            }
            writer.println(tab + tab + tableEnd);
            writer.println(tab + "</body>");
            writer.println("</html>");
        }
    }
}