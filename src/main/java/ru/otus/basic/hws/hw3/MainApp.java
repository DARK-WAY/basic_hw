package ru.otus.basic.hws.hw3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //При запуске приложения, запросите у пользователя число от 1 до 5,
        //после ввода которого выполните метод,соответствующий указанному номеру
        //(если методу требуются аргументы, то сгенерируйте их через Math.random());
        Scanner scanner = new Scanner(System.in);

        //пусть пользователь введет число от 1 до 5
        System.out.print("Введите число от 1 до 5: ");
        // ожидаем ввода
        int result = scanner.nextInt();

        if (result == 1) {                     // 1 задача
            greetings();

        } else if (result == 2) {              // 2 задача
            int a, b, c;
            a = (int) (Math.random() * 100);
            b = (int) (Math.random() * 100);
            c = (int) (Math.random() * 100);
            //System.out.println("a = " + a + ", b = " + b + ", c = " + c);
            checkSig(a, b, c);

        } else if (result == 3) {              // 3 задача
            selectColor();

        } else if (result == 4) {              // 4 задача
            compareNumbers();

        } else if (result == 5) {              // 5 задача
            int initValue = (int) (Math.random() * 10);
            int delta = (int) (Math.random() * 10);
            boolean increment = false;
            if (0 > (int) (Math.random() * 10) - 5) {
                increment = true;
            }
            //System.out.println("initValue = " + initValue + ", delta= " + delta + ", increment = " + increment);
            addOrSubtractAndPrint(initValue, delta, increment); // 5 задача
        }
    }

    public static void greetings() {
        //при вызове печатает в столбец 4 слова: Hello, World, from, Java;
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");

    }

    public static void checkSig(int a, int b, int c) {
        //принимает в качестве аргументов 3 int переменные a, b и c. Метод должен посчитать
        //их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
        //в противном случае -“Сумма отрицательная”;

        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        //задайте int переменную data с любым начальным значением.
        //Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
        //если от 10 до 20 включительно, то “Желтый”,
        //если больше 20 - “Зеленый”;

        int data = 20;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        //объявите две int переменные a и b с любыми начальными значениями.
        // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
        // в противном случае “a < b”;
        int a = 100;
        int b = 33;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        //Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
        // Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
        // в противном случае - вычесть;
        if (increment) {
            initValue += delta;
            System.out.println(initValue);
        } else {
            initValue -= delta;
        }


    }

}
