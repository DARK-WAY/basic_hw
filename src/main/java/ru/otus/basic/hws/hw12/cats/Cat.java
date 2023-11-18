package ru.otus.basic.hws.hw12.cats;

import ru.otus.basic.hws.hw12.plates.Plates;

//Считаем, что если коту мало еды в тарелке, то он ее просто не трогает.
// ( кол-во еды в тарелке < аппетита )
public class Cat {
    private final String name; // имя
    private final int appetite; // аппетит -  сколько ед еды котик есть за 1 раз.
    private boolean full = false; // сытость true - котик сыт

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void toEat(Plates plate) {
        if (full) {
            System.out.println(name + " сыт(-а)  и не хочет кушать");
            return;
        }
        int FoodCurrent = plate.getFoodCurrent();
        if (FoodCurrent == 0) {
            System.out.println("Тарека пуста. " + name + " остался(-ась) голодным(-ой).");
            return;
        }

        if (FoodCurrent < appetite) {
            System.out.println(name + " остался(-ась) голодным(-ой). В тарелке мало еды.");
            return;
        }
        full = true;
        System.out.println(name + " покушал(-а). Животинка сыта).");
        plate.reducing(appetite);


    }
}
