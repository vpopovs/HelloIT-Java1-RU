package urok7;

public class Practicum {

    /**
     * Вывести на экран, сколько раз в массиве встречаются четные числа.
     * @param array массив
     */
    public static void countEvens(int[] array) {

    }

    /**
     * Вывести на экран true, если массив не содержит двоек или не содержит пятерок, в другом случае - false.
     * @param array массив
     */
    public static void no25(int[] array) {

    }

    /**
     * Вывести на экран разницу между самым большим и самым маленьким числом массива.
     * @param array массив.
     */
    public static void largestSmallestDiff(int[] array) {

    }

    /**
     * Вывести на экран true, если массив содержит единицу рядом с единицей или двойку рядом с двойкой, но не оба случая.
     * @param array массив
     */
    public static void either12(int[] array) {

    }

    /**
     * Вывести на экран такие же числа, как в массиве, но сначала вывести все четные, а затем нечетные.
     * @param array массив
     */
    public static void evenOdd(int[] array) {

    }

    public static void main(String[] args) {

        countEvens(new int[]{1, 5, 22, 4});     // 2
        countEvens(new int[]{6, 8, 3, 3, 1});   // 2
        countEvens(new int[]{1});               // 0

        System.out.println("----------");

        no25(new int[]{2, 7, 9});       // true
        no25(new int[]{8, 2, 6, 3, 5}); // false
        no25(new int[]{4, 8, 5});       // true

        System.out.println("----------");

        largestSmallestDiff(new int[]{5, 8, 2, -5});    // 13
        largestSmallestDiff(new int[]{1, 7, 3, -1});    // 8
        largestSmallestDiff(new int[]{4, 3, 5, 5});     // 2

        System.out.println("----------");

        either12(new int[]{1, 1, 6});   // true
        either12(new int[]{6, 2, 2});   // true
        either12(new int[]{1, 1, 2, 2});// false

        System.out.println("----------");

        evenOdd(new int[]{2, 3, 5, 4});     // 2 4 3 5
        evenOdd(new int[]{1, 1, 7, 8, 3});  // 8 1 1 7 3
        evenOdd(new int[]{7, 6, 3, 1});     // 6 7 3 1

    }

}