package lesson9;

public class Homework {

    /**
     * Попросите пользователя ввести фразу, состоящую из слов разной длины.
     * Найти самое длинное и самое короткое слово и поменять их местами.
     * Вывести на экран получившуюся фразу.
     */
    public static void reverseWords() {
        // Здесь должен быть код программы
    }

    /**
     * Попросите пользователя ввести предложение.
     * Перевернуть введенное предложение и вывести результат экран.
     */
    public static void reversePhrase() {
        // Здесь должен быть код программы
    }

    /**
     * Попросите пользователя ввести число.
     * Найти и вывести на экран сумму всех цифр введенного числа.
     */
    public static void numSum() {
        // Здесь должен быть код программы
    }

    /**
     * Попросите пользователя ввести 5 слов в консоль.
     * Вывести на экран те слова, длина которых меньше средней.
     */
    public static void averageLength() {
        // Здесь должен быть код программы
    }

    /**
     * Написать маленькую игру, в которой пользователю необходимо угадать случайно выбранное число.
     * Если введенное число меньше или больше, сообщить об этом пользователю.
     * Если пользователь угадал число, вывести на экран соответствующее сообщение.
     */
    public static void guessNum() {
        int randomNumber = new Random().nextInt(101); // случайное число от 0 до 100
        // Здесь должен быть код программы
    }

    public static void main(String[] args) {

        reverseWords();

        System.out.println("----------");

        reversePhrase();

        System.out.println("----------");

        numSum();

        System.out.println("----------");

        averageLength();

        System.out.println("----------");

        guessNum();

        System.out.println("----------");

    }
}
