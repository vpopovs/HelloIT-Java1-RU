package urok5;

public class Practicum {

    /**
     * Вывести на экран числа от 1 до 6, используя for и while операторы.
     */
    public static void oneToSix() {
        for (int i = 1; i <= 6; i++) {
            System.out.println(i);
        }

        int i = 1;
        while (i <= 6) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * Вывести на экран таблицу умножения на 5.
     */
    public static void multiplyByFive() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + 5 * i);
        }
    }

    /**
     * Вывести на экран сумму чисел от 1 до 5.
     */
    public static void sumOneToFive() {
        int sum = 0;

        for (int i = 1; i <= 5; i ++) {
            sum += i;
        }

        System.out.println("sum: " + sum);
    }

    /**
     * Вывести на экран вот такую последовательность: 8 15 22 29 36 43 50 57 64 71 78 85 92, используя for и while операторы.
     */
    public static void row() {
        for (int num = 8; num <= 92; num += 7) {
            System.out.println(num);
        }

        int num = 8;

        while (num <= 92) {
            System.out.println(num);
            num += 7;
        }
    }

    /**
     * Вывести на экран квадраты четных чисел от 10 до 20.
     */
    public static void square() {
        for (int i = 10; i <= 20; i+=2) {
            System.out.println(i * i);
        }
    }

    public static void main(String[] args) {

//        oneToSix(); // 1 2 3 4 5 6

        System.out.println("----------");

        multiplyByFive();
        /*
         * 1 * 5 = 5
         * 2 * 5 = 10
         * 3 * 5 = 15
         * 4 * 5 = 20
         * 5 * 5 = 25
         * 6 * 5 = 30
         * 7 * 5 = 35
         * 8 * 5 = 40
         * 9 * 5 = 45
         * 10 * 5 = 50
         */

        System.out.println("----------");

        sumOneToFive(); // 15

        System.out.println("----------");

        row();  // 8 15 22 29 36 43 50 57 64 71 78 85 92

        System.out.println("----------");

        square(); // 100 144 196 256 324 400
    }
}