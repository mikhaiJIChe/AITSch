/*
•Объявить класс OOP.Contact для хранения фамилии, имени и номера телефона человека
•Для каждого поля объявить геттер и сеттер
•В функции main объявить несколько переменных класса OOP.Contact и поработать с ними – повызывать геттеры и сеттеры
 */

import OOP.Contact;

public class ContactMain {
    public static void main(String[] args){
        Contact contact1 = new Contact("Галина","Иванова","1354");
        System.out.println(contact1.getName() + " " + contact1.getSurname() + " " +  contact1.getPhone());

        contact1.setName("Екатерина");
        contact1.setSurname("Петрова");
        contact1.setPhone("128500");

        System.out.println(contact1.getName() + " " + contact1.getSurname() + " " +  contact1.getPhone());
    }
}
