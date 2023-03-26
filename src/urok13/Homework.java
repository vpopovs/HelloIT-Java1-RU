package urok13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {
    /**
     * Обработать исключение (NullPointerException), которое возникает, когда мы пытаемся
     * совершить какие-либо действия со строкой, которой не существует (null).
     * Вывести сообщение "Слово не существует".
     * @param word cлово
     */
    public static void existence(String word) {
        System.out.println(word.substring(0, word.length() / 2));
    }

    /**
     * Обработать исключение (StringIndexOutOfBoundsException), которое возникает при попытке обратиться к символу строки,
     * которого не существует. Вывести сообщение "Символа с индексом index не существует."
     * @param word слово
     * @param index индекс символа
     */
    public static void letterIndex(String word, int index) {
        System.out.println(word.charAt(index));
    }

    /**
     * Написать метод, который ищет человека в базе данных people по имени personName.
     * Если человека с таким именем нет, выбросить исключение (throw new Exception()),
     * если есть - вывести в консоль индекс человека.
     * В main методе обработать исключение и вывести сообщение "Такого человека не существует".
     * @param people база людей (имена)
     * @param personName имя человека, которого необходимо найти
     */
    public static void findInDB(List<String> people, String personName) {

    }

    public static void main(String[] args) {
        existence(null);
        letterIndex("Hello", 10);
        findInDB(new ArrayList<>(Arrays.asList("Bob", "John", "Andy")), "Alan");
    }
}
