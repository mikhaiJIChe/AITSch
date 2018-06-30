/*
Есть дом с известным количеством этажей и подъездов. Все подъезды одинаковые, на каждом этаже в подъезде 4 квартиры.
•Считаем, что номера квартир на лестничной площадке распределяются так:
    2   3
    1   4
•То есть можно сказать, что квартира 1 – ближняя слева, квартира 2 – дальняя слева, квартира 3 – дальняя справа, квартира 4 – ближняя справа
•Прочитать с консоли количество этажей, подъездов и номер квартиры. По введенному номеру квартиры выдать номер подъезда и этажа, где находится эта квартира, а также положение квартиры на лестничной площадке
•Выдать сообщение, если квартиры с таким номером нет в доме
 */

import java.util.Scanner;

public class Lesson2_Flats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество подъездов");
        int entrancesInHouse = scanner.nextInt();
        System.out.println("Введите количество этажей");
        int floorsInEntrance = scanner.nextInt();
        System.out.println("Введите номер квартиры");
        int flatNumber = scanner.nextInt();

        final int flatsOnFloor = 4;

        int flatsInHouse = entrancesInHouse * floorsInEntrance * flatsOnFloor;

        if (flatNumber > flatsInHouse) {
            System.out.println("Квартиры с таким номером в доме нет");
        } else {
            int entranceNumber = (int) Math.ceil((double) flatNumber / (floorsInEntrance * flatsOnFloor));
            System.out.println("Номер подъезда: " + entranceNumber);

            int floorNumber = (int) Math.ceil(((double) flatNumber - (entranceNumber - 1) * floorsInEntrance * flatsOnFloor) / flatsOnFloor);
            System.out.println("Номер этажа: " + floorNumber);

            if (flatNumber % 4 == 1) {
                System.out.println("Квартира ближняя слева");
            } else if (flatNumber % 4 == 2) {
                System.out.println("Квартира дальняя слева");
            } else if (flatNumber % 4 == 3) {
                System.out.println("Квартира дальняя справа");
            } else {
                System.out.println("Квартира ближняя справа");
            }
        }
    }
}
