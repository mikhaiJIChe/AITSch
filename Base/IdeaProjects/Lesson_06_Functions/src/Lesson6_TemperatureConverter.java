/*
•Написать программу, которая переводит температуру из градусов Цельсия в градусы Кельвина и Фаренгейта (Фаренгейта – на дом)
•Например, прочитать число – температуру в шкале Цельсия и напечатать две строки – в градусах Кельвина и Фаренгейта
•Перевод градусов Цельсия в градусы Кельвина и перевод в градусы Фаренгейта оформить отдельными функциями
•Формулы найти в интернете
 */

import java.util.Scanner;

public class Lesson6_TemperatureConverter {

    public static double convertFahrenheitToCelsius(double tFahrenheit) {
        return (tFahrenheit - 32) / 1.8;
    }

    public static double convertCelsiusToKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    public static double convertCelsiusToFahrenheit(double tCelsius) {
        return (tCelsius * 1.8 + 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия:");
        System.out.print("t (°C) = ");
        double tCelsius1 = scanner.nextDouble();
        double tFahrenheit1 = convertCelsiusToFahrenheit(tCelsius1);
        double tKelvin1 = convertCelsiusToKelvin(tCelsius1);
        System.out.printf("%.2f °C = %.2f °F = %.2f °K%n", tCelsius1, tFahrenheit1, tKelvin1);


        System.out.println("Введите температуру в градусах Фаренгейта:");
        System.out.print("t (°F) = ");
        double tFahrenheit2 = scanner.nextDouble();
        double tCelsius2 = convertFahrenheitToCelsius(tFahrenheit2);
        double tKelvin2 = convertCelsiusToKelvin(tCelsius1);
        System.out.printf("%.2f °F = %.2f °C = %.2f °K %n", tFahrenheit2, tCelsius2, tKelvin2);
    }
}
