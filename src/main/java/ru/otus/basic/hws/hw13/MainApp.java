package ru.otus.basic.hws.hw13;

public class MainApp {
    public static void main(String[] args) {
        Cross[] distance = {
                new Cross(25, TypeLandscape.PLAIN),
                new Cross(15, TypeLandscape.FOREST),
                new Cross(3, TypeLandscape.SWAMP)
        };
        Human[] travelers = {
                new Human("Морис", 150, 3, 1),
                new Human("Анна", 100, 5, 3),
                new Human("Катрин", 120, 2, 2),
                new Human("Джек", 100, 5, 3),
                new Human("Робин", 150, 3, 2)
        };

        Transport bike = new Bicycle("R1", "Stella");
        Transport rover = new Rover("Тактик", "Азимут",45, 2);
        Transport horse = new Horse("Ласточка",250,5);
        Transport car = new Car("Rommster", "Skoda", 30f, 0.01f);

        // пусть Анна сядет  на велосипед
        travelers[1].setCurrentTransport(bike);
        // Джэек на вездеход
        travelers[3].setCurrentTransport(rover);
        // Робин сядет на лошадь
        travelers[4].setCurrentTransport(horse);
        // Катрин поедет на машине
        travelers[2].setCurrentTransport(car);


        for (Human traveler : travelers) {
            System.out.println();
            System.out.println(traveler.info());
            for (Cross cross : distance) {
                cross.goRoute(traveler);
            }
        }

        System.out.println();
        travelers[4].setCurrentTransport(null);
        System.out.println(travelers[4].info());
        distance[1].goRoute(travelers[4]);



    }
}
