package ru.otus.basic.hws.hw13;

public class Cross {
    private int distance;
    private final TypeLandscape landscape;
    // private TypeTransport transport;

    public Cross(int distance, TypeLandscape landscape) {
        this.distance = distance;
        this.landscape = landscape;
    }

    public int getDistance() {
        return distance;
    }

    public TypeLandscape getLandscape() {
        return landscape;
    }

    public boolean goRoute(Human traveler) {
        Transport transport = traveler.getCurrentTransport();
        if (transport == null) {
            return traveler.moving(distance, landscape);
        }
        return transport.moving(distance, landscape, traveler);
    }
}
