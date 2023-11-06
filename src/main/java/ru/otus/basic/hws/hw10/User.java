package ru.otus.basic.hws.hw10;


//Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
//Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
//В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
//ФИО: фамилия имя отчество
//Год рождения: год рождения
//e-mail: email

public class User {
    private String last, name, firstName;
    private int yearBirth;
    private String email;

    // Конструктор
        public User(String last, String name, String firstName, int yearBirth, String email) {
        this.last = last;
        this.name = name;
        this.firstName = firstName;
        this.yearBirth = yearBirth;
        this.email = email;
    }

    // Методы
    //getters
    public String getLast() {
        return last;
    }

    public String getName() {
        return name;
    }

    public int getYearBirth() {
        return yearBirth;
    }
    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }
    public void printInfo() {
        // метод, выводящий в консоль информацию о пользователе в виде
        //ФИО: фамилия имя отчество
        //Год рождения: год рождения
        //e-mail: email
        System.out.println("ФИО: " + this.last + " " + this.name + " " + this.firstName);
        System.out.println("Год рождения: " + this.yearBirth);
        System.out.println("e-mail: " + this.email);
    }
}
