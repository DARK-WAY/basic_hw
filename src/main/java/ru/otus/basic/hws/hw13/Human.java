package ru.otus.basic.hws.hw13;

public class Human {
    private final String name; // имя человека
    private final int enduranceMax; // выносливость
    private int enduranceCurrent; // остаток сил, которые можно потратить
    private final int expensesWalki; // затраты сил при хождении  пешком
    private final int expensesBicycle; // затраты сил при передвижении  на велосипеде
    private Transport currentTransport; // текущий транспорт


    public Human(String name, int enduranceMax, int expensesWalki, int expensesBicycle) {
        this.name = name;
        this.enduranceMax = enduranceMax;
        this.enduranceCurrent = enduranceMax;
        this.expensesWalki = expensesWalki;
        this.expensesBicycle = expensesBicycle;

    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;

    }

    public void setEnduranceCurrent(int enduranceCurrent) {
        this.enduranceCurrent = enduranceCurrent;
    }

    public int determineExpensesBicycle(int distance) {
        return distance * expensesWalki;
    }

    public int determineExpensesWalk(int distance) {
        return distance * expensesBicycle;
    }

    public void reduceEndurance(int expenses) {
        enduranceCurrent -= expenses;
        if (enduranceCurrent < 0) {
            enduranceCurrent = 0;
        }
    }

    public String info() {
        if (currentTransport == null) {
            return name + " без транспорта.";
        }
        return name + ", его(ее) транспорт: " + currentTransport.info();
    }

    // геттеры
    public String getName() {
        return name;
    }

    public int getEnduranceMax() {
        return enduranceMax;
    }

    public int getEnduranceCurrent() {
        return enduranceCurrent;
    }

    public int getExpensesWalki() {
        return expensesWalki;
    }

    public int getExpensesBicycle() {
        return expensesBicycle;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    // в классе человека передвижение пешком
    public boolean moving(int distance, TypeLandscape landscape) {
        int expenses = determineExpensesWalk(distance);
        if (distance == 0) {
            System.out.println("Не указана дистанция. " + name + " ждет указаний.");
            return false;
        }
        if (expenses > enduranceCurrent) {
            System.out.println("Слишком длинная дистанция (" + landscape.getNameRU() + ") " + distance + " км. У " + name + " не хватит сил. Он(Она) остается на месте.");
            return false;
        }
        reduceEndurance(expenses);
        System.out.println(name + " прошел пешком дистанцию (" + landscape.getNameRU() + ") " + distance + " км. Потратил (а) " + expenses + " единиц выносливости.");
        currentTransport = null;
        return true;

    }


}
