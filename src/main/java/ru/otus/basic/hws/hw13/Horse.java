package ru.otus.basic.hws.hw13;

public class Horse implements Transport {
    private final String name; // имя  лошади
    private final int enduranceMax; // Завпас выносливости
    private int enduranceCurrent; // остаток сил, которые можно потратить
    private final int expensesMoving; // затраты сил при передвижении

    public Horse(String name, int enduranceMax, int expensesMoving) {
        this.name = name;
        this.enduranceMax = enduranceMax;
        this.enduranceCurrent = enduranceMax;
        this.expensesMoving = expensesMoving;
    }
    // определяем затраты на дистнацию
    public int determineExpenses(int distance) {
        return distance * expensesMoving;
    }

    // уменьшаем текущие затраты
    public void reduceEndurance(int expenses) {
        enduranceCurrent -= expenses;
        if (enduranceCurrent < 0) {
            enduranceCurrent = 0;
        }
    }
    @Override
    public String info() {
        return "Лошадь по кличке <"  + name + "> ";
    }

    @Override
    public boolean moving(int distance, TypeLandscape landscape, Human human) {

        int expenses = determineExpenses(distance);
        if (distance == 0) {
            System.out.println("Не указана дистанция. " + human.getName() + " ждет указаний.");
            return false;
        }
        if (landscape == TypeLandscape.SWAMP) {
            System.out.println("На лошади нельзя проехать по болоту. " + human.getName() + " готовится к следующему маршруту.");
            return false;
        }
        if (expenses > enduranceCurrent) {
            System.out.println("Слишком длинная дистанция (" + landscape.getNameRU() + ") " +  distance + " км. У лошщади не хватит сил. " + human.getName() + " остается на месте.");
            return false;
        }
        reduceEndurance(expenses);
        System.out.println(human.getName() + " проехал на лошади дистанцию (" + landscape.getNameRU() + ") " +  distance + " км. Лошадь израсходовала " + expenses + " ед выносливости.");
        return true;

    }

}
