package ru.otus.basic.hws.hw11.animals;

public class Dog extends Animal {
    protected  String type; //  Собака, Песик, Щенок...

    // конструктор
    public Dog(  String name, float[] runParameters, float[] swimParameters, int endurance, String type) {
        this.name = name;                    // имя
        this.runParameters = runParameters;  // {скорость м/с, затраты}
        this.swimParameters = swimParameters; //{скорость м/с, затраты}
        this.endurance = endurance;           // выносливость
        this.type = type;                     // тип
    }

    @Override
    public void info() {
        System.out.println( type+ " " +  name +  " имеет параметр выносливости = " + endurance);

    }

    @Override
    public int run(int distance) {
        if ( endurance == 0 ){
            System.out.println( type + " " +  name + " устало и отказывается бегать.");
            return -1;
        }
        int seconds = -1;
        seconds  = super.run(distance);
        if (seconds  == 0 ){
            System.out.println( type + " " +  name + " не сдвинулось  с места.");
            return seconds;
        }
        if (seconds  == - 1 ){
            System.out.println(   name + " не смог(ла) пробежать дистанцию = " + distance + " метров. " + type + " отдыхает на берегу." );
            return seconds;
        }

        System.out.println( type + " " +  name + " пробежал(а) дистанцию " + distance + " метров за " + seconds  + " секунд(ы)");
        return seconds;
    }

    @Override
    public int swim(int distance) {
        if ( endurance == 0 ){
            System.out.println( type + " " +  name + " устало и отказывается плавать.");
            return -1;
        }
        int seconds = -1;
        seconds  = super.swim(distance);
        if (seconds  == 0 ){
            System.out.println( type + " " +  name + " буксует.");
            return seconds;
        }
        if (seconds  == - 1 ){
            System.out.println(   name + " не смог(ла) проплыть дистанцию = " + distance + " метров. Животное выбилось из сил. " );
            return seconds;
        }

        System.out.println( type + " " +  name + " проплыл(а) дистанцию " + distance + " метров за " + seconds  + " секунд(ы)");
        return seconds;
    }
}
