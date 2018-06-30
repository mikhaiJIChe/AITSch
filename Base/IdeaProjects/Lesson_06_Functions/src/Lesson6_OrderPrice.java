/*
•Написать функцию для расчета стоимости заказа с учетом скидок
•Всего есть два вида товаров, в заказ может входить некоторое количество товаров одного типа и другого типа
•Скидка 5% начисляется, если суммарное количество товаров в заказе не меньше 10
•Скидка 5% начисляется, если суммарная стоимость заказа не меньше 1000 рублей
•Если выполняются оба условия, то скидка 10% от начальной стоимости
 */

import java.util.Scanner;

public class Lesson6_OrderPrice {
    public static int getDiscount(double price1, int count1, double price2, int count2) {
        int totalCount = count1 + count2;
        double totalPrice = price1 * count1 + price2 * count2;

        int countForDiscount = 10;
        double priceForDiscount = 1000;

        if (totalCount >= countForDiscount && totalPrice >= priceForDiscount) {
            return 10;
        } else if (totalCount >= countForDiscount || totalPrice >= priceForDiscount) {
            return 5;
        } else {
            return 0;
        }
    }

    public static String getNameRubles(int priceRubles) {
        if (priceRubles / 10 % 10 == 1 || priceRubles % 10 == 0 || (priceRubles % 10 >= 5 && priceRubles % 10 <= 9)) {
            return "рублей";
        } else if (priceRubles % 10 == 1) {
            return "рубль";
        } else {
            return "рубля";
        }
    }

    public static String getNameKopecks(int priceKopecks) {
        if (priceKopecks / 10 % 10 == 1 || priceKopecks % 10 == 0 || (priceKopecks % 10 >= 5 && priceKopecks % 10 <= 9)) {
            return "копеек";
        } else if (priceKopecks % 10 == 1) {
            return "копейка";
        } else {
            return "копейки";
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость 1го товара:");
        double price1 = scanner.nextDouble();
        System.out.println("Введите количество 1го товара:");
        int count1 = scanner.nextInt();
        System.out.println("Введите стоимость 2го товара:");
        double price2 = scanner.nextDouble();
        System.out.println("Введите количество 2го товара:");
        int count2 = scanner.nextInt();

        // total price:
        double totalPrice = price1 * count1 + price2 * count2;
        int totalPriceRubles = (int) totalPrice;
        int totalPriceKopecks = (int) Math.round(totalPrice % 1 * 100);
        String nameRublesTotal = getNameRubles(totalPriceRubles);
        String nameKopecksTotal = getNameKopecks(totalPriceKopecks);

        System.out.println("Начальная стоимость заказа:");
        System.out.printf("%d %s %02d %s%n", totalPriceRubles, nameRublesTotal, totalPriceKopecks, nameKopecksTotal);

        // discount:
        int discount = getDiscount(price1, count1, price2, count2);

        System.out.println("Ваша скидка:");
        System.out.printf("%d %%%n", discount);

        // price with discount:
        int percentAll = 100;
        double finalPrice = totalPrice * (percentAll - discount) / percentAll;
        int finalPriceRubles = (int) finalPrice;
        int finalPriceKopecks = (int) Math.round(finalPrice % 1 * 100);
        String nameRublesFinal = getNameRubles(finalPriceRubles);
        String nameKopecksFinal = getNameKopecks(finalPriceKopecks);

        System.out.println("Стоимость заказа с учетом скидки:");
        System.out.printf("%d %s %02d %s%n", finalPriceRubles, nameRublesFinal, finalPriceKopecks, nameKopecksFinal);
    }
}