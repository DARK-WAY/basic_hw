package ru.otus.basic.hws.hw11;

import ru.otus.basic.hws.hw11.animals.Cat;
import ru.otus.basic.hws.hw11.animals.Dog;
import ru.otus.basic.hws.hw11.animals.Horse;

public class MainApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Несси", new float[]{8, 1}, 300, "Кошка");
        Cat kitty = new Cat("Пушок", new float[]{2, 1}, 100, "Котенок");
        Dog doggy = new Dog("Тотошка", new float[]{10, 1}, new float[]{1, 2}, 350, "Песик");
        Horse foal = new Horse("Хвостик", new float[]{12, 1}, new float[]{2, 4}, 400, "Жеребёнок");


        cat.info();
        cat.run(200);
        cat.info();
        cat.run(200);
        cat.info();
        cat.swim(20);


        System.out.println();

        kitty.info();
        kitty.run(50);
        kitty.info();
        kitty.run(0);
        kitty.swim(10);

        System.out.println();

        doggy.info();
        doggy.run(300);
        doggy.info();
        doggy.swim(150);
        doggy.info();

        System.out.println();

        foal.info();
        foal.run(300);
        foal.info();
        foal.swim(25);
        foal.info();
        foal.swim(10);
        foal.info();

    }
}
