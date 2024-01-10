package ru.otus.basic.hws.hw15;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        int min = -1;
        int max = 10;
        int sum;
        int minAverageAge = 33;

        List<Integer> listInt = new ArrayList<>();

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иванов Иван Иванович", 35));
        employees.add(new Employee("Петров Семен Маркович", 35));
        employees.add(new Employee("Сидорова Мирия Антоновна", 55));
        employees.add(new Employee("Крючкова Надежда Васильевна", 28));

        try {
            //-----------------------------------------часть 2 ------------------------------
            System.out.println("Часть 2");
            for (Employee listEmpl : employees) {
                System.out.println(listEmpl.getName() + " - " + listEmpl.getAge() + "; ");
            }

            System.out.println("Задание 1 " + getNameEmployee(employees));
            System.out.print("Задание 2 ");
            for (Employee listEmpl : getAgeValue(30, employees)) {
                System.out.print(listEmpl.getName() + " - " + listEmpl.getAge() + " / ");
            }

            System.out.println();
            System.out.print("Задание 3 ");
            if (averageAgeCompare(minAverageAge, employees)) {
                System.out.println("Cредний возраст сотрудников превышает " + minAverageAge + " лет (года).");
            } else {
                System.out.println("Cредний возраст сотрудников не превышает " + minAverageAge + " лет.");
            }
            System.out.print("Задание 4 " + "Самый молодой сотрудник(-и): ");
            for (Employee listEmpl : youngestEmployee(employees)) {
                System.out.println(listEmpl.getName() + " - " + listEmpl.getAge());
            }

            System.out.println();

            //----------------------------------------- часть  1 ----------------------------
            System.out.println("\nЧасть 1");
            listInt = arrayListPeriod(min, max);
            System.out.println(listInt);

            sum = sumElements(listInt);
            System.out.println("Сумма элементов больше 5 = " + sum);

            if (increaseElementList(2, listInt)) {
                System.out.println(listInt);
            }

            if (initList(11, listInt)) {
                System.out.println(listInt);
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    //---------------------------------------------- часть 2 --------------------------------------------------

    //    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
    public static List<Employee> youngestEmployee(List<Employee> employees) {
        List<Employee> young = new ArrayList<>();
        int minAge = employees.get(0).getAge();
        young.add(employees.get(0));

        for (int i = 1; i < employees.size(); i++) {

            if (employees.get(i).getAge() < minAge) {
                young.clear();
            }
            if (employees.get(i).getAge() <= minAge) {
                young.add(employees.get(i));
                minAge = employees.get(i).getAge();
            }
        }
        return young;
    }

    //    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий
    //    что средний возраст сотрудников превышает указанный аргумент;
    public static boolean averageAgeCompare(int minAverageAge, List<Employee> employees) {
        int averageAge = 0;
        for (Employee employee : employees) {
            averageAge += employee.getAge();
        }
        averageAge = averageAge / employees.size();
        return (averageAge > minAverageAge);
    }

    // Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    public static List<String> getNameEmployee(List<Employee> employees) {
        List<String> listName = new ArrayList<>();
        for (Employee employee : employees) {
            listName.add(employee.getName());
        }
        return listName;
    }

    //  Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и
    //  возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
    public static List<Employee> getAgeValue(int value, List<Employee> employees) {
        ArrayList<Employee> listName = new ArrayList<>();

        for (Employee employee : employees) {
            if (value <= employee.getAge()) {
                listName.add(employee);
            }
        }
        return listName;
    }
//---------------------------------------------- часть 1 --------------------------------------------------

    // Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором
    // последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
    private static List<Integer> arrayListPeriod(int min, int max) {
        List<Integer> listInt = new ArrayList<>();

        if (min > max) {
            throw new RuntimeException("Указаны не корректные входные данные.");
        }

        for (int i = min; i <= max; i++) {
            listInt.add(i);
        }
        return listInt;
    }

    //    Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы,
    //    значение которых больше 5, и возвращающий сумму;
    public static int sumElements(List<Integer> array) {
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

    public static boolean initList(int value, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            System.out.println("Список пустой");
            return false;
        }

        for (int i = 0; i < size; i++) {
            list.set(i, value);
        }
        return true;
    }

    //    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий
    //    каждый элемент списка на указанное число;
    public static boolean increaseElementList(int value, List<Integer> list) {

         //  list.replaceAll(integer -> integer + value);
        // не совсем понимаю, как это работает, поэтому оставила то, что понимаю...


        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + value);
        }
        return true;
    }


}