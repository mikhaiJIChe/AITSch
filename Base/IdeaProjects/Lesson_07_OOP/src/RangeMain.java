/*
•Создать свой класс Range (числовой диапазон). В нём:
    1.Объявить два вещественных поля from, to
    2.Описать конструктор, при помощи которого заполняются поля from, to
    3.Функция для вычисления длины интервала
    4.Создать метод isInside, который принимает вещественное число и возвращает boolean – результат проверки того, принадлежит ли число диапазону
•После этого написать небольшую программу с использованием этого класса
 */

import OOP.Range;

public class RangeMain {
    public static void main(String[] args) {
        Range range1 = new Range(-5.2, 10.25);

        double from = range1.getFrom();
        double to = range1.getTo();

        double length = range1.getLength();
        System.out.println("Длина диапазона от " + from + " до " + to + " равна " + length);

        double number = 44.5;
        boolean isInside = range1.isInside(number);
        if (isInside) {
            System.out.println("Число " + number + " лежит в пределах диапазона от " + from + " до " + to);
        } else {
            System.out.println("Число " + number + " не принадлежит диапазону чисел от " + from + " до " + to);
        }
    }
}
