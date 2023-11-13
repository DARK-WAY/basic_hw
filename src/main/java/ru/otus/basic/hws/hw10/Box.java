package ru.otus.basic.hws.hw10;

public class Box {
    //    Попробуйте реализовать класс по его описания:
//    объекты класса Коробка должны иметь размеры и цвет.
//    Коробку можно открывать и закрывать.
//    Коробку можно перекрашивать.
//    Изменить размер коробки после создания нельзя.
//    У коробки должен быть метод, печатающий информацию о ней в консоль.
//    В коробку можно складывать предмет (если в ней нет предмета),
//    или выкидывать его оттуда (только если предмет в ней есть),
//    только при условии что коробка открыта (предметом читаем просто строку).
//    Выполнение методов должно сопровождаться выводом сообщений в консоль.
    final int width;
    final int height;
    final int depth;
    private String color;
    private boolean isOpened;
    private boolean empty = true;

    // Конструктор
    public Box(int width, int height, int depth, String color, boolean isOpened) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpened = isOpened;
    }

    //setter-ы
    //    Коробку можно перекрашивать.
    public void setColor(String color) {
        this.color = color;
        System.out.println("Цвет коробки : " + this.color);
    }

    //методы
//    У коробки должен быть метод, печатающий информацию о ней в консоль.
    public void info() {
        String isOpenedNow = "Закрыта";
        if (this.isOpened) {
            isOpenedNow = "Открыта";
        }

        if (this.empty){
            isOpenedNow += ", пустая .";
        }
        else {
            isOpenedNow += ", заполнена.";
        }

        System.out.println("Коробка: ширина= " + this.width + ", высота= " + this.height + ", глубина= " +
                this.depth + ", цвет коробки = " + this.color + ", состояние = " + isOpenedNow );
    }

    //    Коробку можно открывать и закрывать.
    public void open() {
        if (isOpened) {
            System.out.println("Коробка уже открыта");
        } else {
            System.out.println("Коробка открыта");
            isOpened = true;
        }
    }

    public void close() {
        if (!isOpened) {
            System.out.println("Коробка уже закрыта");
        } else {
            System.out.println("Коробка закрыта");
            isOpened = false;
        }
    }

    //    В коробку можно складывать предмет (если в ней нет предмета),
//    или выкидывать его оттуда (только если предмет в ней есть),
//    только при условии что коробка открыта (предметом читаем просто строку).
    public void inPut() {
        if (this.empty && this.isOpened) {
            this.empty = false;
            System.out.println("Коробка заполнена.");
        } else {
            if (!this.empty) System.out.print("Коробка уже заполнена.");
            if (!this.isOpened) System.out.println("Коробка закрыта. Откройте ее.");
        }

    }
}
