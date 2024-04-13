package lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework {

    /**
     * Вывести на экран сумму элементов листа с нечетными индексами.
     * @param list лист
     */
    public static void oddIndexSum(ArrayList<Integer> list) {
        // Здесь должен быть код программы
    }

    /**
     * Поменять первую и вторую половину листа местами.
     * Количество элементов в листе четное.
     * @param list лист
     */
    public static void changeOrder(ArrayList<Integer> list) {
        // Здесь должен быть код программы
    }

    /**
     * Вывести элементы листа в следующем порядке: первый, последний, второй, предпоследний и т.д.
     * Количество элементов в листе четное.
     * @param list лист
     */
    public static void shuffle(ArrayList<Integer> list) {
        // Здесь должен быть код программы
    }

    /**
     * Найти и вывести на экран cумму всех элементов листа, исключив из них максимальное и минимальное число.
     * @param list лист
     */
    public static void sumWithoutMaxMin(ArrayList<Integer> list) {
        // Здесь должен быть код программы
    }

    /**
     * Вывести на экран true, если числа в листе стоят по возрастанию, иначе - false.
     * @param list лист
     */
    public static void ascOrder(ArrayList<Integer> list) {
        // Здесь должен быть код программы
    }

    public static void main(String[] args) {

        oddIndexSum(new ArrayList<>(Arrays.asList(1, 6, 8, 4, 44))); // 10
        oddIndexSum(new ArrayList<>(Arrays.asList(9, 9, 5, 0)));     // 9
        oddIndexSum(new ArrayList<>(Arrays.asList(1, 55, 4, 2)));    // 57

        System.out.println("----------");

        changeOrder(new ArrayList<>(Arrays.asList(6, 8, 3, 1, 7, 5)));  // [1, 7, 5, 6, 8, 3]
        changeOrder(new ArrayList<>(Arrays.asList(1, 2, 5, 7)));        // [5, 7, 1, 2]
        changeOrder(new ArrayList<>(Arrays.asList(4, 4, 4, 4)));        // [4, 4, 4, 4]

        System.out.println("----------");

        shuffle(new ArrayList<>(Arrays.asList(5, 4, 2, 7)));        // 5 7 4 2
        shuffle(new ArrayList<>(Arrays.asList(1, 2)));              // 1 2
        shuffle(new ArrayList<>(Arrays.asList(5, 7, 3, 7, 0, 0)));  // 5 0 7 0 3 7

        System.out.println("----------");

        sumWithoutMaxMin(new ArrayList<>(Arrays.asList(5, 8, 3, 2)));       // 8
        sumWithoutMaxMin(new ArrayList<>(Arrays.asList(1, 5, 8, 34, 2)));   // 15
        sumWithoutMaxMin(new ArrayList<>(Arrays.asList(90, 0, 100 , 3)));   // 93

        System.out.println("----------");

        ascOrder(new ArrayList<>(Arrays.asList(1, 5, 8, 9)));   // true
        ascOrder(new ArrayList<>(Arrays.asList(6, 6, 10, 15))); // false
        ascOrder(new ArrayList<>(Arrays.asList(1, 6, -2, 6)));  // false

    }

}
