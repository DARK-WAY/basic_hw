package ru.otus.basic.hws.hw13;

public class Bicycle implements Transport {
    private final String model; // модель веловипеда
    private final String firm; // фирма


    public Bicycle(String model, String firm) {
        this.model = model;
        this.firm = firm;

    }

    @Override
    public String info() {
        return model + " " + firm;
    }

    @Override
    public boolean moving(int distance, TypeLandscape landscape, Human human) {
        int enduranceCurrent = human.getEnduranceCurrent();
        int expenses = human.determineExpensesBicycle(distance);
        if (landscape == TypeLandscape.SWAMP) {
            System.out.println("На велосипеде нельзя проехать по болоту. " + human.getName() + " готовится к следующему маршруту.");
            return false;
        }

        if (distance == 0) {
            System.out.println("Не указана дистанция. " + human.getName() + " ждет указаний.");
            return false;
        }
        if (expenses > enduranceCurrent) {
            System.out.println("Слишком длинная дистанция (" + landscape.getNameRU() + ") " + distance + " км. У " + human.getName() + " не хватит сил. Он(Она) остается на месте.");
            return false;
        }
        human.reduceEndurance(expenses);
        System.out.println(human.getName() + " проехал на велосипеде дистанцию (" + landscape.getNameRU() + ") " + distance + " км. Потратил(а) " + expenses + " единиц");
        return true;

    }
}
