package ru.otus.basic.hws.hw14;


public class MainApp {

    public static void main(String[] args) {
        int sum;

        String[][][] arrays =
                {
                        {
                                {"11", "12", "13", "14"},
                                {"21", "22", "23", "24"},
                                {"31", "32", "33", "34"},
                                {"41", "42", "43", "44"}
                        },
                        {
                                {"Зима", "12", "13", "14"},
                                {"21", "22", "23", "24"},
                                {"31", "32", "33", "34"},
                                {"41", "42", "43", "44"}
                        },
                        {
                                {"11", "12", "13"/*, "14"*/},
                                {"21", "22", "23", "24"},
                                {"31", "32", "33", "34"},
                                {"41", "42", "43", "44"}
                        },
                        {
                                {"Зима", "12", "13", "14"},
                                {"21", "22", "23", "24"},
                                {"31", "32", "33", "34"}
                        }

                };


        for (int i = 0; i < arrays.length; i++) {


            try {
                System.out.print("Вычисляем сумму элементов массива arrays[" + i + "].");
                sum = sumArray(arrays[i]);
                System.out.println("Сумма = " + sum);


            } catch (
                    AppArrayDataException ex) {
                System.out.println(ex.getMessage());

            } catch (
                    AppArraySizeException ex) {
                ex.getMessagePrint(ex);
            }
        }
    }

    private static int sumArray(String arrayS[][]) throws AppArraySizeException, AppArrayDataException {
        int sumElements = 0;
        if (arrayS.length != 4) throw new AppArraySizeException("Размер массива не равен 4х4 по строкам");

        for (int i = 0; i < arrayS.length; i++) {

            if (arrayS[i].length != 4) {
                throw new AppArraySizeException("Размер массива не равен 4х4 по столбцам ");
            }

            for (int j = 0; j < arrayS[i].length; j++) {
                try {
                    sumElements += Integer.parseInt(arrayS[i][j]);
                } catch (NumberFormatException ex) {
                    throw new AppArrayDataException("Значение элемента массива [" + i + "][" + j + "]=" +
                            arrayS[i][j] + " не корректное. Сумму элементов массива вычислить нельзя.");
                }
            }
        }

        return sumElements;
    }
}
