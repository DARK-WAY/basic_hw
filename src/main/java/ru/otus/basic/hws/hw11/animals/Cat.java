package ru.otus.basic.hws.hw11.animals;

public class Cat extends Animal {
protected  String type; // "Кот"/"Кошка"/Котенок

    // конструктор
    public Cat(  String name, float[] runParameters, int endurance, String type) {
        this.name = name;                        // имя
        this.runParameters = runParameters;     //{скорость м/с, затраты}
        this.endurance = endurance;             // выносливость
        this.type = type;                       // тип
    }

    @Override
    public void info() {
        System.out.println( type+ " " +  name +  " имеет параметр выносливости = " + endurance);

    }

    @Override
    public int run(int distance) {
        if (endurance == 0 ){
            System.out.println( "Не мучайте " +  name + ". Животное отдыхает." );
            return -1;
        }
        int seconds = -1;
        seconds  = super.run(distance);
        if (seconds  == 0 ){
            System.out.println( type + " " +  name + " стоит на месте.");
            return seconds;
        }
        if (seconds  == - 1 ){
            System.out.println( "У " +  name + " появилось состояние усталости на дистанции = " + distance + " метров. Животное остановилось. " );
            return seconds;
        }

        System.out.println( type + " " +  name + " пробежал(а) дистанцию " + distance + " метров за " + seconds  + " секунд(ы)");
        return seconds;
    }

    @Override
    public int swim(int distance) {
        System.out.println( type + " " +  name + " не умеет плавать.");
        return -1;
    }
}
