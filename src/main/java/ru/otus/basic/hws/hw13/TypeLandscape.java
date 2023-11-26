package ru.otus.basic.hws.hw13;

public enum TypeLandscape {
    FOREST( "Густой лес"),
    PLAIN("Равнина"),
    SWAMP("Болото");
    private String nameRU;

    TypeLandscape(String nameRU) {
        this.nameRU = nameRU;
    }

    public String getNameRU() {
        return nameRU;
    }
}
