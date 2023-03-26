package lesson4;

public class Homework {

    /**
     * Даны три числа numOne, numTwo, numThree. Выведите их на экран в порядке возрастания.
     * Все три числа разные.
     * @param numOne первое число
     * @param numTwo второе число
     * @param numThree третье число
     */
    public static void ascendingOrder(int numOne, int numTwo, int numThree) {
    }

    /**
     * В переменной minute лежит минута часа (0-59). Вывести на экран, в какой четверти часа находится минута.
     * @param minute минута часа
     */
    public static void quarterOfAnHour(int minute) {

    }

    /**
     * Проверить и вывести на экран, существует ли треугольник с указанными сторонами.
     * @param a первая сторона треугольника
     * @param b вторая сторона треугольника
     * @param c третья сторона треуголника
     */
    public static void triangle(int a, int b, int c) {

    }

    /**
     * Даны радиус круга и длина стороны квадрата.
     * Сообщить на экране, поместится ли круг в квадрате.
     * @param r радиус круга
     * @param a длина стороны квадрата
     */
    public static void circleInSquare(double r, double a) {

    }

    public static void main(String[] args) {
        ascendingOrder(5, 1, 7);    // 1 5 7
        ascendingOrder(-2, -7, 12); // -7 -2 12
        ascendingOrder(3, 6, -6);   // -6 3 6

        System.out.println("----------");

        quarterOfAnHour(56);    // 4
        quarterOfAnHour(14);    // 1
        quarterOfAnHour(32);    // 3

        System.out.println("----------");

        triangle(3, 5, 7);  // Существует
        triangle(6, 8, 1);  // Не существует
        triangle(6, 6, 12); // Не существует

        System.out.println("----------");

        circleInSquare(5.3, 12);    // Поместится
        circleInSquare(7.1, 3.3);   // Не поместится
        circleInSquare(4.4, 4.4);   // Не поместится
    }
}