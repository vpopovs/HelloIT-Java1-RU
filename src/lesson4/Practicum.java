package lesson4;

public class Practicum {

    /**
     * Создать программу, проверяющую и сообщающую на экран,
     * является ли целое число number чётным либо нечётным.
     * @param number число, которое проверяется на четность
     */
    public static void parity(int number) {

    }

    /**
     * Определить какое из трех чисел - наибольшее, и вывести его на экран.
     * Все три числа разные.
     * @param numberOne первое число
     * @param numberTwo второе число
     * @param numberThree третье число
     */
    public static void maxNumber(int numberOne, int numberTwo, int numberThree) {

    }

    /**
     * Создать программу, которая выводит на экран ближайшее к 10 число (numberOne или numberTwo).
     * Например, среди чисел 8 и 11 ближайшее к десяти - 11.
     * Числа могут находиться одинаково близко к 10.
     * @param numberOne первое число
     * @param numberTwo второе число
     */
    public static void nearestNumber(int numberOne, int numberTwo) {

    }

    /**
     * Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
     * целое число в интервал (25;100) и сообщать результат на экран.
     */
    public static void randomNumber() {

    }

    public static void main(String[] args) {

        parity(5);  // Нечетное
        parity(6);  // Четное
        parity(57); // Нечетное

        System.out.println("----------");

        maxNumber(5, 7, 3);     // 7
        maxNumber(6, 11, 12);   // 12
        maxNumber(0, -5, 6);    // 6

        System.out.println("----------");

        nearestNumber(6, 12);   // 12
        nearestNumber(11, 11);  // Числа одинаково близко к 10
        nearestNumber(3, -5);   // 3

        System.out.println("----------");

        randomNumber();
        randomNumber();
        randomNumber();
    }
}