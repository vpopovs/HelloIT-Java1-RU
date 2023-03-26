package lesson7;


public class Homework {

    /**
     * Вывести на экран true, если где-либо в массиве две девятки стоят рядом. Иначе - false.
     * @param array массив
     */
    public static void has99(int[] array) {

    }

    /**
     * Вывести на экран сумму тех положительных чисел массива, после которых идут отрицательные.
     * @param array массив
     */
    public static void sumPositive(int[] array) {

    }

    /**
     * Cоздать массив, который является перевернутым вариантом первоначального массива и вывести его элементы на экран.
     * !см. Цикл с двумя переменными!
     * @param array первоначальный массив
     */
    public static void reverseArray(int[] array) {

    }

    /**
     * Поменять местами максимальное и минимальное число в массиве. Вывести элементы получившегося массива на экран.
     * @param array массив
     */
    public static void changeMaxMin(int[] array) {

    }

    /**
     * Создать любой двумерный массив и вывести его в консоль в виде таблички (см. презентацию).
     */
    public static void twoDimensionalArray() {

    }

    public static void main(String[] args) {

        has99(new int[]{9, 9, 5, 1});   // true
        has99(new int[]{1, 7, 9, 1});   // false
        has99(new int[]{3, 5, 5, 9, 9});// true

        System.out.println("----------");

        sumPositive(new int[]{5, 3, 1, -5, 4});     // 1
        sumPositive(new int[]{-1, 4, -2, 5, -3});   // 9
        sumPositive(new int[]{4, 7, 5, -2, 5, -2}); // 10

        System.out.println("----------");

        reverseArray(new int[]{1, 5, 8, 4});    // 4 8 5 1
        reverseArray(new int[]{1, 1, 2});       // 2 1 1
        reverseArray(new int[]{6});             // 6

        System.out.println("----------");

        changeMaxMin(new int[]{5, 8, -1, 5});   // 5 -1 8 5
        changeMaxMin(new int[]{1, 7, 9, 3});    // 9 7 1 3
        changeMaxMin(new int[]{-2, -1, 3, 5});  // 5 -1 3 -2

        System.out.println("----------");

        twoDimensionalArray();
    }
}
