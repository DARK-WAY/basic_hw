package ru.otus.basic.hws.hw10;


public class MainApp {
    public static void main(String[] args) {

        System.out.println("\nЗадача № 1");
        //В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и
        // с помощью цикла выведите информацию только о пользователях старше 40 лет.

        User[] users = new User[] {
                new User("Иванов","Иван", "Иванович", 1950, "iii@mail.ru"),
                new User("Петров","Петр", "Иванович", 1985, "ppi@mail.ru"),
                new User("Сидоров","Андрей", "Петрович", 1970, "sap@mail.ru"),
                new User("Пельмень","Иван", "Ванович", 1998, "piv@mail.ru"),
                new User("Крутень","Ирина", "Петровна", 1996, "kipp@mail.ru"),
                new User("Сушкин","Владимир", "Иванович", 2001, "svi@mail.ru"),
                new User("Пушкин","Сергей", "Сергеевич", 2008, "pss@mail.ru"),
                new User("Полетов","Иван", "Абрамович", 1984, "pia@mail.ru"),
                new User("Великая","Софья", "Константиновна", 1999, "vsk@mail.ru"),
                new User("Третьякова","Мария", "Львовна", 2002, "tml@mail.ru")
        };
        int currentYear = 2023;

        for (int i = 0; i < users.length; i++)
            if ( currentYear  - users[i].getYearBirth() >= 40) {
                users[i].printInfo();
            }


        System.out.println("\nЗадача № 2");
        Box box1 = new Box(10, 15, 20, "Белый", true);
        box1.info();
        box1.open();
        box1.close();
        box1.setColor("Синий");
        box1.info();
        box1.inPut();
        box1.open();
        box1.inPut();
        box1.info();

    }
}
