package ru.otus.basic.hws.hw14;

public class AppArraySizeException  extends RuntimeException {
    private String message;
    public AppArraySizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void getMessagePrint(AppArraySizeException ex) {
        System.out.println(ex.message);
    }
}
