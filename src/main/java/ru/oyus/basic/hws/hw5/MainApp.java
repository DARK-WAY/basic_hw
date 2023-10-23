package ru.oyus.basic.hws.hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // 1
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();
        System.out.println("Сколько раз необходимо напечать строку: ");
        int ncount = scanner.nextInt();
        printLine(inputString, ncount);

        //2
        int arraylength = (int) (Math.random() * 10 + 1);
        int[] array = new int[arraylength];
        for (int i = 0; i < arraylength; i++) {
            array[i] = random.nextInt(10);
        }
        sumInt(array);

        //3
        setArrayInt(12, array);

        //4
        addArrayInt(8, array);

        //5
        compareInt(array);

        //********************* звездочки ******************
        //6
        int[] a = {1, 25, 3, 7, 65};
        int[] b = {0, 5, 7};
        int[] c = {9, 0, 0, -2, -35, 6, 8, 10};
        arraySum(a, b, c);
        //7 //Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
        int[] point1 = {1, 1, 1, 1, 1, 5};
        int[] point2 = {5, 3, 4, -2};
        int[] point3 = {7, 2, 2, 2};
        int[] point4 = {1, 2, 5, 3};
        int[] point5 = {1, 2, 4, 4, 3};
        getPoint(point1);
        getPoint(point2);
        getPoint(point3);
        getPoint(point4);
        getPoint(point5);

        // 8
        int[] arraySort = {5, 3, 1, 5, 8, 9, 2};
        System.out.println("В системе задан массив чисел: " + Arrays.toString(arraySort));
        System.out.println("Введите 1 - если хотите отсортировать  массив по возрастанию и 2 -  если по убыванию. ");
        int dir = scanner.nextInt();
        if (dir == 2 || dir == 1) {
            sortOrder(arraySort, dir);
        } else {
            System.out.println("Не корректно введен тип сортировки ");
        }

        //  9  Реализуйте метод, “переворачивающий” входящий массив
        //    Пример: { 1 10 3 5 } => { 5 3 10 1 }
        int[] arrOver = {1, 10, 3, 5 };
        System.out.print( Arrays.toString(arrOver) + " -> ");
        flipOver(arrOver);


    }


    public static void printLine(String line, int n) {
        //    1. Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в
        //    консоль строку указанное количество раз;
        for (int i = 0; i < n; i++) {
            System.out.println(line);
        }
    }

    public static void sumInt(int[] array) {
        //2/Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все
        //элементы, значение которых больше 5, и печатающий полученную сумму в консоль;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма = " + sum);
    }

    public static void setArrayInt(int a, int[] array) {
        //3/ Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
        //массив, метод должен заполнить каждую ячейку массива указанным числом;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void addArrayInt(int a, int[] array) {
//     4/ Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
//        массив, увеличивающий каждый элемент массива на указанное число;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + a;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void compareInt(int[] array) {
//     5/ Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в
//        консоль информацию о том, сумма элементов какой из половин массива больше;
        int sumLeft = 0, sumRigth = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                sumLeft += array[i];
                continue;
            }
            sumRigth += array[i];
        }
        if (sumLeft > sumRigth) {
            System.out.println("Сумма левой половины (SL) больше правой (SR): (SL) =" + sumLeft + ", (SR)= " + sumRigth);
        } else if (sumLeft < sumRigth) {
            System.out.println("Сумма правой половины (SL) больше правой (SR) : (SL)=" + sumLeft + ", (SR)= " + sumRigth);
        } else {
            System.out.println("Сумма правой половины (SL) = сумме правой  (SR): (SL) = " + sumLeft + ", (SR)= " + sumRigth);
        }

    }

    //********************* звездочки ******************
    public static void arraySum(int[] a, int[] b, int[] c) {

//        Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
//        массив равный сумме входящих;
//        Пример: { 1, 2, 3 }  + { 2, 2 } + { 1, 1, 1, 1, 1 } = { 4, 5, 4, 1, 1 }
        int aLen = a.length, bLen = b.length, cLen = c.length, maxI = 0;

        //определяем длиун массивов и ищем самый длинный
        maxI = aLen;
        if (maxI < bLen) {
            maxI = bLen;
        }
        if (maxI < cLen) {
            maxI = cLen;
        }
        int[] array = new int[maxI];
        // организовываем цикл по самому большому массиву
        for (int i = 0; i < array.length; i++) {
            if (aLen > i) {
                array[i] += a[i];
            }
            if (bLen > i) {
                array[i] += b[i];
            }
            if (cLen > i) {
                array[i] += c[i];
            }
        }
        System.out.println("Сложили следующие массивы");
        System.out.println(Arrays.toString(a) + " + ");
        System.out.println(Arrays.toString(b) + " + ");
        System.out.println(Arrays.toString(c) + "  = ");
        System.out.println(Arrays.toString(array));


    }

    public static void getPoint(int[] array) {
        // 7/ Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
        //равны. “Точка находится между элементами”;
        //Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
        int sumLeft = 0, sumRigth = 0, point = 0;
        int iL = 0, iR = 0;
        System.out.print("Ищем точку " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                sumLeft = array[i];
                iL = i;
                sumRigth = array[array.length - 1];
                iR = array.length - 1;
                //System.out.println("Значения iL= " + iL  + ", sumLeft = " + sumLeft + ", iR= " + iR + ", sumRigth = " + sumRigth );
            } else {
                if (sumLeft < sumRigth) {
                    sumLeft += array[i];
                    iL = i;
                } else if (sumLeft > sumRigth) {
                    sumRigth += array[array.length - 1 - i];
                    iR = array.length - 1 - i;
                } else {

                    if ((iR - iL) == 2) { // осталось одно значение между индексами
                        sumLeft += array[i];
                        iL = i;
                    } else if ((iR - iL) > 2) { // есть более одного значения
                        sumLeft += array[i];
                        sumRigth += array[iR - 1];
                        iL = i;
                        iR += -1;
                    }
                }
                //проверяем, может все уже элементы пробежали?
                //System.out.println("Значения iL= " + iL  + ", sumLeft = " + sumLeft + ", iR= " + iR + ", sumRigth = " + sumRigth );
                if ((iR - iL) == 1) {
                    point = iL;
                    break;
                }
            }

        }
        // сумма равна или нет
        if (sumLeft == sumRigth) {
            // у нас есть "точка"
            System.out.print(" Есть <точка>  : ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i == point) {
                    System.out.print("|");
                }
            }

        } else {
            System.out.print(" Нет <точки>  ");
        }
        System.out.println();

    }

    public static void sortOrder(int[] array, int dir) {
//    8/    Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
//        возрастания (по выбору пользователя)
//     {5, 3, 1, 5, 8, 9, 2};
        int exch = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if ((array[i] > array[i + 1] && dir == 1) || (array[i] < array[i + 1] && dir == 2)) {
                    exch = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = exch;
                }
            }
        }
        System.out.println("Результат сортировки массива: " + Arrays.toString(array));
    }

    public static void flipOver(int[] array) {
//  9  Реализуйте метод, “переворачивающий” входящий массив
//    Пример: { 1 2 3 4 } => { 4 3 2 1 }
        int exch = 0;
        for (int i = 0; i < array.length / 2; i++) {
            exch = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = exch;
        }
        System.out.println(Arrays.toString(array));
    }
}
