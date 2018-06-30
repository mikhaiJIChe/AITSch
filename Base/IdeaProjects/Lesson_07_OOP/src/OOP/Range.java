package OOP;
/*
•Создать свой класс OOP.Range (числовой диапазон). В нём:
1.Объявить два вещественных поля from, to
2.Описать конструктор, при помощи которого заполняются поля from, to
3.Функция для вычисления длины интервала
4.Создать метод isInside, который принимает вещественное число и возвращает boolean – результат проверки того, принадлежит ли число диапазону
•После этого написать небольшую программу с использованием этого класса
 */


public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public boolean isInside(double number) {
        return (number >= from && number <= to);
    }

    public double getLength() {
        return (to - from);
    }
}
