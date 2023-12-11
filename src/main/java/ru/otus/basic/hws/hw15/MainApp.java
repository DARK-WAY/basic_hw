package ru.otus.basic.hws.hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MainApp {
    public static void main(String[] args) {
        int min = -1;
        int max = 10;
        int sum;
        int minAverageAge = 33;

        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<Integer> yongInndex = new ArrayList<>();

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Иванов Иван Иванович", 35));
        employees.add(new Employee("Петров Семен Маркович", 30));
        employees.add(new Employee("Сидорова Мирия Антоновна", 55));
        employees.add(new Employee("Крючкова Надежда Васильевна", 28));


        try {
            //-----------------------------------------часть 2 ------------------------------

            System.out.println(getNameEmployee(employees));
            System.out.println(getAgeValue(30, employees));
            if (averageAgeСompare(minAverageAge, employees)) {
                System.out.println("Cредний возраст сотрудников превышает " + minAverageAge + " лет (года).");
            } else {
                System.out.println("Cредний возраст сотрудников не превышает " + minAverageAge + " лет.");
            }
            yongInndex = youngestEmployee(employees);
            for (Integer i : yongInndex) {
                System.out.print("Самый молодой сотрудник(-и) = " + employees.get(i).getName() + ", возраст = " + employees.get(i).getAge() + ". ");
            }
            System.out.println();
            //----------------------------------------- часть  1 ----------------------------
            listInt = arrayListPeriod(min, max);
            System.out.println(listInt);

            sum = sumElements(listInt);


            if (increaseElementList(3, listInt)) {
                System.out.println(listInt);
            }

            if (initList(10, listInt)) {
                System.out.println(listInt);
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    //---------------------------------------------- часть 2 --------------------------------------------------

    //    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
    public static ArrayList youngestEmployee(ArrayList<Employee> employees) {
        ArrayList<Integer> young = new ArrayList<>();
        int minAge = 1000;


        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getAge() < minAge) {
                young.clear();
            }
            if (employees.get(i).getAge() <= minAge) {
                young.add(i);
                minAge = employees.get(i).getAge();
            }
        }
        return young;
    }

    //    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий
    //    что средний возраст сотрудников превышает указанный аргумент;
    public static boolean averageAgeСompare(int minAverageAge, ArrayList<Employee> employees) {
        int averageAge = 0;
        for (int i = 0; i < employees.size(); i++) {
            averageAge += employees.get(i).getAge();
        }
        averageAge = averageAge / employees.size();
        if (averageAge > minAverageAge) {
            return true;
        }
        return false;
    }

    // Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    public static ArrayList getNameEmployee(ArrayList<Employee> employees) {
        ArrayList<String> listName = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            listName.add(employees.get(i).getName());
        }
        return listName;
    }

    //  Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и
    //  возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
    public static ArrayList getAgeValue(int value, ArrayList<Employee> employees) {
        ArrayList<String> listName = new ArrayList<>();

        for (int i = 0; i < employees.size(); i++) {
            if (value <= employees.get(i).getAge()) {
                listName.add(employees.get(i).getName() + " - " + employees.get(i).getAge());
            }
        }
        return listName;
    }
//---------------------------------------------- часть 1 --------------------------------------------------

    // Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором
    // последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
    private static ArrayList arrayListPeriod(int min, int max) {
        ArrayList<Integer> listInt = new ArrayList<>();

        if (min > max) {
            throw new RuntimeException("Указаны не корректные входные данные.");
        }

        for (int i = min; i < max; i++) {
            listInt.add(i);
        }
        return listInt;
    }

    //    Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы,
    //    значение которых больше 5, и возвращающий сумму;
    public static int sumElements(ArrayList<Integer> array) {
        int sum = 0;
        for (Integer a : array) {
            if (a > 5) {
                sum += a;
            }
        }
        return sum;
    }
//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен
//    переписать каждую заполненную ячейку списка указанным числом;

    public static boolean initList(int value, ArrayList<Integer> list) {
        int size = list.size();
        if (size == 0) {
            System.out.println("Список пустой");
            return false;
        }
        list.removeAll(list);
        for (int i = 0; i < size; i++) {
            list.add(i, value);
        }
        return true;
    }

    //    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий
    //    каждый элемент списка на указанное число;
    public static boolean increaseElementList(int value, ArrayList<Integer> list) {
        int size = list.size();
        if (size == 0) {
            System.out.println("Список пустой");
            return false;
        }
        for (int i = 0; i < size; i++) {
            list.set(i, list.get(i) + value);
        }
        return true;
    }


}