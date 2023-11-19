package ru.otus.basic.hws.hw12;

import ru.otus.basic.hws.hw12.cats.Cat;
import ru.otus.basic.hws.hw12.plates.Plate;

public class MainApp {
    public static void main(String[] args) {
        Plate plate1 = new Plate(20);
        Cat[] cat = new Cat[]{
                new Cat("Тишка", 5),
                new Cat("Несси", 7),
                new Cat("Барсик", 6),
                new Cat("Маруся", 8)
        };

        for (int i = 0; i < cat.length; i++) {
            cat[i].toEat(plate1);
        }
        System.out.println();

        plate1.add(20);
        plate1.add(10);

        System.out.println();

        for (int i = 0; i < cat.length; i++) {
            cat[i].toEat(plate1);
        }

    }
}
