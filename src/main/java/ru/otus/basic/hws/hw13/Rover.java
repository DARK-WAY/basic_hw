package ru.otus.basic.hws.hw13;

public class Rover implements Transport {

    private final String model; // модель веловипеда
    private final String firm; // фирма

    private final int fuelMax; // максимальный объем топлива в бака
    private int fuelCurrent; // остаток топлива
    private final int fuelConsumption; // Расход топлива на 1 км


    public Rover(String model, String firm, int fuelMax, int fuelConsumption) {
        this.model = model;
        this.firm = firm;
        this.fuelMax = fuelMax;
        this.fuelCurrent = fuelMax;
        this.fuelConsumption = fuelConsumption;
    }

    public int determineExpenses(int distance) {
        return distance * fuelConsumption;
    }
    public void reduceFuel(int expenses) {
        fuelCurrent -= expenses;
        if (fuelCurrent < 0) {
            fuelCurrent = 0;
        }
    }
    @Override
    public String info() {
        return model + " " + firm  ;
    }

    @Override
    public boolean moving(int distance, TypeLandscape landscape, Human human) {

        int expenses = determineExpenses(distance);
        if (distance == 0) {
            System.out.println("Не указана дистанция. " + human.getName() + " ждет указаний.");
            return false;
        }
        if (expenses > fuelCurrent) {
            System.out.println("Слишком длинная дистанция (" + landscape.getNameRU() + ") " +  distance + " км. У вездеход не хватит топлива. " + human.getName() + " остается на месте.");
            return false;
        }
        reduceFuel(expenses);
        System.out.println(human.getName() + " проехал на ввездеходе дистанцию (" + landscape.getNameRU() + ") " +  distance + " км. Вездеход израсходовал " + expenses + " л топлива");
        return true;

    }
}
