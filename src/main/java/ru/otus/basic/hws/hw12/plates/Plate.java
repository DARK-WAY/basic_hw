package ru.otus.basic.hws.hw12.plates;

public class Plate {
    private final int foodMax;
    private int foodCurrent;

    public Plate(int foodMax) {
        this.foodMax = foodMax;
        this.foodCurrent = foodMax;
    }

    public int getFoodCurrent() {
        return foodCurrent;
    }

    //В тарелке должен быть метод, позволяющий добавить еду в тарелку.
    // После добавлений в тарелке не может оказаться еды больше максимума
    public void add(int food) {
        int foodCalc = foodCurrent + food;
        if (food == 0) {
            System.out.println("Печалька. Еды не дали.");
            return;
        }
        if (foodCalc > foodMax) {
            System.out.println("Еды не влезло. Замените на тазик.");
            return;
        }
        foodCurrent += food;
        System.out.println("Еда увеличилась на " + food + " единиц. Теперь ее стало = " + foodCurrent);
    }

    //В тарелке должен быть boolean метод уменьшения количества еды, при этом после такого уменьшения, в
    //тарелке не может оказаться отрицательное колчислество еды ( если удалось уменьшить еды так,
    // чтобы в тарелке осталось >= 0 кусков еды,то возвращаем true, в противном случае - false).
    public boolean reducing (int food) {
        int foodCalc = foodCurrent - food;
        if (food == 0) {
            System.out.println("Печалька. Нет порции.");
            return false;
        }
        if (foodCalc < 0) {
            System.out.println("Жалко, что нельзя в кредит покушать.");
            return false;
        }
        foodCurrent -= food;
        System.out.println("Еда уменьшилась на " + food + " единиц. Теперь ее стало = " + foodCurrent);
        return true;
    }


}



