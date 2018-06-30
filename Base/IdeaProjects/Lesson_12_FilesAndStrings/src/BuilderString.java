/*
Задача «StringBuilder»
•Создать строку из чисел от 1 до 100 через запятую при помощи StringBuilder
•Распечатать строку в консоль
 */

public class BuilderString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; ++i) {
            sb.append(i)
                    .append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb.toString());
    }
}
