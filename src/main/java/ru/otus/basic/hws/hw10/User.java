package ru.otus.basic.hws.hw10;


//Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
//Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
//В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
//ФИО: фамилия имя отчество
//Год рождения: год рождения
//e-mail: email

public class User {
    private String lastName, firstName, middleName;
    private int yearBirth;
    private String email;

    // Конструктор
        public User(String lastName, String firstName, String middleName, int yearBirth, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.yearBirth = yearBirth;
        this.email = email;
    }

    // Методы
    //getters

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public String getEmail() {
        return email;
    }

    public void printInfo() {
        // метод, выводящий в консоль информацию о пользователе в виде
        //ФИО: фамилия имя отчество
        //Год рождения: год рождения
        //e-mail: email
        System.out.println("ФИО: " + this.lastName + " " + this.firstName + " " + this.middleName);
        System.out.println("Год рождения: " + this.yearBirth);
        System.out.println("e-mail: " + this.email);
    }
}
