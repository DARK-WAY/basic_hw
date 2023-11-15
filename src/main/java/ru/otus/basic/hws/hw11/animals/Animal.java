package ru.otus.basic.hws.hw11.animals;

public abstract class Animal {
    protected String name; // имя
    protected float[] runParameters; // массив атрибутов бега {скорость м/с, затраты}
    protected float[] swimParameters; // массив атрибутов плавания {скорость м/с, затраты}
    protected int endurance; // выносливость

    public String getName() {
        return name;
    }

    public float[] getRunParameters() {
        return runParameters;
    }

    public float[] getSwimParameters() {
        return swimParameters;
    }

    public int getEndurance() {
        return endurance;
    }

    public abstract void info();

    //Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на
    //указанное действие, и “понижать выносливость” животного.
    // distance -  Дистанция в метрах
    // возвращает время в секундах
    public int run(int distance) {
        if (endurance == 0) {
            return -1;
        }
        if (distance == 0) {
            return 0;
        }
        // Если выносливости не хватает
        int enduranceCalc = (int) Math.floor((double) distance * (double) runParameters[1]);
        if (enduranceCalc > endurance) {
            endurance = 0;
            return -1;
        }
        int seconds = (int) ((float) distance / runParameters[0]);
        endurance -= enduranceCalc;
        return seconds;
    }

    public int swim(int distance) {
        if (endurance == 0) {
            return -1;
        }
        if (distance == 0) {
            return 0;
        }
        // Если выносливости не хватает
        int enduranceCalc = (int) Math.floor((double) distance * (double) swimParameters[1]);
        if (enduranceCalc > endurance) {
            endurance = 0;
            return -1;
        }
        int seconds = (int) ((float) distance / swimParameters[0]);
        endurance -= enduranceCalc;
        return seconds;
    }

}


