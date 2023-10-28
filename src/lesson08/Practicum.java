package lesson08;

import java.util.ArrayList;
import java.util.Arrays;

public class Practicum {

    /**
     * Найти в листе list число num, удалить его и вывести новый лист на экран.
     * Если число не найдено, вывести на экран соответствующее сообщение.
     * @param list лист
     * @param num число, которое необходимо найти
     */
    public static void findRemove(ArrayList<Integer> list, int num) {
        // Здесь должен быть код программы
    }

    /**
     * Вывести на экран true, если лист является симметричным. Иначе - false.
     * @param list список
     */
    public static void symmetric(ArrayList<Integer> list) {
        // Здесь должен быть код программы
    }

    /**
     * Вывести на экран, сколько различных чисел содержится в листе.
     * @param list лист
     */
    public static void diffNums(ArrayList<Integer> list) {
        // Здесь должен быть код программы
    }

    /**
     * Создать лист, который содержит все элементы первоначального листа, но сначала идут числа меньше среднего, затем больше.
     * Вывести его на экран.
     * @param list первоначальный лист
     */
    public static void average(ArrayList<Integer> list) {
        // Здесь должен быть код программы
    }

    /**
     * Cоздать лист, в котором содержатся все числа первоначального листа,
     * для которых делителем является хотя бы одно из чисел первоначального листа.
     * Вывести новый лист на экран.
     * Все числа разные.
     * @param list первоначальный лист
     */
    public static void divisor(ArrayList<Integer> list) {
        // Здесь должен быть код программы
    }

    public static void main(String[] args) {

        findRemove(new ArrayList<>(Arrays.asList(1, 5, 7, 2)), 2);  // [1, 5, 7]
        findRemove(new ArrayList<>(Arrays.asList(3, 7, 2, 1)), 6);  // Число 6 не найдено
        findRemove(new ArrayList<>(Arrays.asList(1, 8, 5, 3)), 8);  // [1, 5, 3]

        System.out.println("----------");

        symmetric(new ArrayList<>(Arrays.asList(1, 5, 7, 8)));  // false
        symmetric(new ArrayList<>(Arrays.asList(2, 7, 9, 4)));  // false
        symmetric(new ArrayList<>(Arrays.asList(1, 2, 2, 1)));  // true

        System.out.println("----------");

        diffNums(new ArrayList<>(Arrays.asList(5, 4, 4, 1)));   // 3
        diffNums(new ArrayList<>(Arrays.asList(6, 8, 3, 1)));   // 4
        diffNums(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));   // 1

        System.out.println("----------");

        average(new ArrayList<>(Arrays.asList(6, 4, 1, 8, 9, 3)));  // [4, 1, 3, 6, 8, 9]
        average(new ArrayList<>(Arrays.asList(9, 3, 7, 1, 6, 2)));  // [3, 1, 2, 9, 7, 6]
        average(new ArrayList<>(Arrays.asList(1, 5, 3, 8, 3, 2)));  // [1, 3, 3, 2, 5, 8]

        System.out.println("----------");

        divisor(new ArrayList<>(Arrays.asList(2, 5, 9, 8)));        // [8]
        divisor(new ArrayList<>(Arrays.asList(7, 19, 13, 8, 4)));   // [8]
        divisor(new ArrayList<>(Arrays.asList(9, 71, 5, 6, 21)));   // []

    }

}