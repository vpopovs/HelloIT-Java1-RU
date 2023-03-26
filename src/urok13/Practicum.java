package urok13;

public class Practicum {
    /**
     * Обработать исключение (ArithmeticException), которое возникает при делении на 0
     * и вывести сообщение "Делить на 0 нельзя".
     * @param a делимое
     * @param b делитель
     */
    public static void division(int a, int b) {
        System.out.println(a/b);
    }

    /**
     * Обработать исключение (ArrayIndexOutOfBoundsException), которое возникает при попытке обратиться к элементу массива,
     * которого не существует. Вывести сообщение "Элемента с индексом index не существует".
     * @param array массив
     * @param index индекс элемента
     */
    public static void elementIndex(int[] array, int index) {
        System.out.println(array[index]);
    }

    /**
     * Написать метод, который проверяет возраст пользователя перед входом на сайт.
     * Если возраст меньше 18, выбросить исключение(throw new Exception()),
     * если больше - вывести сообщение "Вход выполнен".
     * В main методе обработать исключение и вывести сообщение "Вход запрещен".
     * @param age возраст
     */
    public static void access(int age) {
    }

    public static void main(String[] args) {
        division(5, 0);
        elementIndex(new int[]{1, 3, 6}, 5);
        access(17);
    }
}
