package lesson5;

public class Homework {

    /**
     * Вывести на экран числа от 6 до 1, используя for и while операторы.
     */
    public static void sixToOne() {
        for (int i = 6; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        int i = 6;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    /**
     * Вывести на экран нечетные числа, начиная с 1, используя for и while операторы.
     * Не выводить числа, идущие после числа 15.
     */
    public static void oddNumbers() {
        for (int i = 1; i <= 15; i+=2) {
            System.out.println(i);
        }
        System.out.println();

        int i = 1;
        while (i <= 15) {
            System.out.println(i);
            i+=2;
        }
    }

    /**
     * Вывести на экран четные числа от 2 до 20, используя for и while операторы.
     * Пропустите число 14.
     */
    public static void evenNumbers() {
        for (int i = 2; i <= 20; i+=2) {
            if (i == 14) {
                continue;
            }
            System.out.println(i);
        }

        int i = 2;

        while (i <= 20) {
            if (i == 14) {
                i+=2;
                continue;
            }
            System.out.println(i);
            i+=2;
        }
    }

    /**
     * Вывести на экран такую последовательность чисел: 1 2 4 8 16 32 64 128 256 512.
     */
    public static void row() {
        for (int i = 1; i <= 512; i*=2) {
            System.out.println(i);
        }
    }

    /**
     * Найти сумму чисел в интервале от 1 до 30, которые делятся на 5 или на 7.
     */
    public static void sum() {
        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        sixToOne(); // 6 5 4 3 2 1

        System.out.println("----------");

        oddNumbers(); // 1 3 5 7 9 11 13 15

        System.out.println("----------");

        evenNumbers();  // 2 4 6 8 10 12 16 18 20

        System.out.println("----------");

        row();  // 1 2 4 8 16 32 64 128 256 512

        System.out.println("----------");

        sum(); // 175
    }
}