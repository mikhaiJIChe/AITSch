/*
Задача «URL»
•Написать функцию, которая вычленяет из URL адреса имя сервера. Имеется в виду следующее. Для строки вида http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf вычленить SomeServerName
•Строка может начинаться не обязательно с http, но и с https или чего-то другого. Но :// есть всегда
•Учесть случай, когда после :// больше нет слэша:
•http://SomeServerName
•Использовать indexOf и substring
 */

public class URL {
    public static String getServerName(String link) {
        String split = "://";
        int start = link.indexOf(split) + split.length();
        int end = link.indexOf("/", start);

        if (end == -1) {
            end = link.length();
        }
        return link.substring(start, end);
    }
    public static void main(String[] args) {
        String link = "http://SomeServerName";
//        String link = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";

        System.out.println("Имя сервера: " +  getServerName(link));
    }
}
