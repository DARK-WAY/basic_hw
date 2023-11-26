package ru.otus.basic.hws.hw13;

public interface Transport { // маршрут
    boolean moving( int distance, TypeLandscape landscap, Human traveler );
    public String info();

}
