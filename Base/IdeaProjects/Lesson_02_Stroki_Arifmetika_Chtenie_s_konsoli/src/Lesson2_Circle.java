/*
написать программу, которая вычисляет и печатает
- Площадь и длину окружности с зад. радиусом
- Посчитать радуюс из зокружности с заданной площадью
- Посчитать площадь сектора с заданным радиусом и углом в градусах
Использовать класс Math: тригонометрические функции, возведение в степень, кв.корень, константа Пи и др.
 */
public class Lesson2_Circle {
    public static void main(String[] args) {
        double radius = 1;
        double degree = 45;

        double square = Math.PI * Math.pow(radius, 2); //вычисляем площадь окружности
        System.out.println("площадь окружности = " + square);

        double length = 2 * Math.PI * radius; //вычисляем длину оркужности
        System.out.println("длина окружности = " + length);

        double radius1 = Math.sqrt(square / Math.PI); //вычисляем радус из площади
        System.out.println("радиус = " + radius1);

        double angle = Math.toRadians(degree);
        double squareSector = square * angle / (2 * Math.PI);
        System.out.print("площадь сектора = " + squareSector);
    }
}
