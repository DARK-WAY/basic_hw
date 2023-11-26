package ru.otus.basic.hws.hw13;

public class Car implements Transport {

    private final String model; // модель веловипеда
    private final String firm; // фирма

    private final float fuelMax; // максимальный объем топлива в бака
    private float fuelCurrent; // остаток топлива
    private final float fuelConsumption; // Расход топлива на 1 км

    public Car(String model, String firm, float fuelMax, float fuelConsumption) {
        this.model = model;
        this.firm = firm;
        this.fuelMax = fuelMax;
        this.fuelCurrent = fuelMax;
        this.fuelConsumption = fuelConsumption;
    }

    public float determineExpenses(int distance) {
        return distance * fuelConsumption;
    }

    public void reduceFuel(float expenses) {
        fuelCurrent -= expenses;
        if (fuelCurrent < 0) {
            fuelCurrent = 0;
        }
    }

    @Override
    public String info() {
        return model + " " + firm;
    }

    @Override
    public boolean moving(int distance, TypeLandscape landscape, Human human) {
        if (landscape == TypeLandscape.SWAMP) {
            System.out.println("На машине нельзя проехать по болоту. " + human.getName() + " готовится к следующему маршруту.");
            return false;
        }
        if (landscape == TypeLandscape.FOREST) {
            System.out.println("На машине нельзя проехать по густому лесу. " + human.getName() + " готовится к следующему маршруту.");
            return false;
        }
        float expenses = determineExpenses(distance);
        if (distance == 0) {
            System.out.println("Не указана дистанция. " + human.getName() + " ждет указаний.");
            return false;
        }
        if (expenses > fuelCurrent) {
            System.out.println("Слишком длинная дистанция (" + landscape.getNameRU() + ") " + distance + " км. У машины не хватит топлива. " + human.getName() + " остается на месте.");
            return false;
        }
        reduceFuel(expenses);
        System.out.println(human.getName() + " проехал(а) на машине дистанцию (" + landscape.getNameRU() + ") " + distance + " км. Машина израсходовала " + expenses + " л топлива");
        return true;

    }


}
