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
    private int sizeWidth;
    private int sizeHeight;
    private int sizeDepth;
    private String color;
    public boolean status;
    private boolean empty = true;

    // Конструктор
    public Box(int sizeWidth, int sizeHeight, int sizeDepth, String color, boolean status) {
        this.sizeWidth = sizeWidth;
        this.sizeHeight = sizeHeight;
        this.sizeDepth = sizeDepth;
        this.color = color;
        this.status = status;
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
        String statusNow = "Закрыта";
        if (this.status) {
            statusNow = "Открыта";
        }

        if (this.empty){
            statusNow += ", пустая .";
        }
        else {
            statusNow += ", заполнена.";
        }

        System.out.println("Коробка: ширина= " + this.sizeWidth + ", высота= " + this.sizeHeight + ", глубина= " +
                this.sizeDepth + ", цвет коробки = " + this.color + ", состояние = " + statusNow );
    }

    //    Коробку можно открывать и закрывать.
    public void open() {
        if (status) {
            System.out.println("Коробка уже открыта");
        } else {
            System.out.println("Коробка открыта");
            status = true;
        }
    }

    public void close() {
        if (!status) {
            System.out.println("Коробка уже закрыта");
        } else {
            System.out.println("Коробка закрыта");
            status = false;
        }
    }

    //    В коробку можно складывать предмет (если в ней нет предмета),
//    или выкидывать его оттуда (только если предмет в ней есть),
//    только при условии что коробка открыта (предметом читаем просто строку).
    public void inPut() {
        if (this.empty && this.status) {
            this.empty = false;
            System.out.println("Коробка заполнена.");
        } else {
            if (!this.empty) System.out.print("Коробка уже заполнена.");
            if (!this.status) System.out.println("Коробка закрыта. Откройте ее.");
        }

    }
}
