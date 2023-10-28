package ru.otus.hws.hw7;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("\nЗадача № 1");
        int[][] a = {{1, 2, 6}, {-10, 56, 4, 3}};
        printArrayInt(a);
        System.out.println("Сумма элементов массива > 0 = " + sumOfPositiveElements(a));


        System.out.println("\nЗадача № 2");
        squareStarPrint(5);


        System.out.println("\nЗадача № 3");
        int size = 7;
        char[][] array = new char[size][size];
        initArrayChar('*', array);
        setSquareDiagonal(array, '0');
        printArrayChar(array);

        System.out.println("\nЗадача № 4");
        int maxElement = 0;
        maxElement = findMax(a);
        System.out.println("Значение максимального элемента = " + maxElement);

        System.out.println("\nЗадача № 5");
        int sumSecondLine = 0;
        printArrayInt(a);
        sumSecondLine = sumSecond(a);
        if (sumSecondLine > 0) {
            System.out.println("Сумма второй строки = " + sumSecondLine);
        } else System.out.println("Вторая строка  не существует");

        int[][] b = {{1, 2, 6}, {}};
        printArrayInt(b);
        sumSecondLine = sumSecond(b);
        if (sumSecondLine > 0) {
            System.out.println("Сумма второй строки = " + sumSecondLine);
        } else System.out.println("Вторая строка  не существует");
    }

    public static int sumSecond(int[][] array) {
        // 5 Реализуйте метод, который считает сумму элементов второй строки или столбца двумерного массива (по
        //    вашему выбору), если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1
        int sum = 0;
        if (array[1].length == 0) {
            sum = -1;
            return sum;
        }
        // посчитаем сумму 2 строки , а по индексу 1 .
        for (int j = 0; j < array[1].length; j++) {
            sum += array[1][j];
        }
        return sum;
    }

    public static int findMax(int[][] array) {
        // 4 Реализовать метод findMax(int[][] array), который должен найти и вернуть максимальный элемент массива;
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }


    public static void setSquareDiagonal(char[][] array, char ch) {
        // 3 Реализовать метод, принимающий в качестве аргумента квадратный двумерный целочисленный массив, и
        //зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе).
        //Проверять количество строк и столбцов не требуется, условие “квадратности” нужно чтобы упростить вам
        //работу с диагоналями

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i == array[i].length - 1 - j) {
                    array[i][j] = ch;
                }
            }
        }
    }

    public static void initArrayChar(char ch, char[][] array) {
        //метод, заполняющий весь массив символами
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ch;
            }
        }
    }

    public static void squareStarPrint(int size) {
        //2 Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
        //символов * со сторонами соответствующей длины;
        char[][] array = new char[size][size];
        initArrayChar('*', array);
        printArrayChar(array);
    }

    public static int sumOfPositiveElements(int[][] array) {
        // 1 Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный
        //массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void printArrayInt(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void printArrayChar(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
