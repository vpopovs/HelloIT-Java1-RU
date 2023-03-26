package lesson11;

import java.util.ArrayList;

public class Practicum {

    /*
    Дан файл с принцессами princesses.txt (имя, жизненный статус, место заточения, доп.информация).
    Задание состоит в том, чтобы отсортировать принцесс по жизненному статусу
    и записать в новый файл только тех, которых есть смысл спасать.
     */

    /**
     * Прочитать файл и сохранить данные каждой принцессы в лист.
     * @return лист с принцессами
     */
    public static ArrayList<String[]> read() {
        return null;
    }

    /**
     * Исключить принцесс с неподходящим статусом: "EATEN", "SAVED", "SLAYED THE DRAGON HERSELF".
     * Их нет смысла спасать.
     * @param princesses лист с принцессами
     * @return отфильтрованный лист с принцессами
     */
    public static ArrayList<String[]> filterByStatus(ArrayList<String[]> princesses) {
        return null;
    }

    /**
     * Отсортировать принцесс по статусу FIGHTS FOR LIFE > INJURED > IN PANIC > BORED.
     * FIGHTS FOR LIFE идет перед INJURED и тд.
     * @param filteredPrincesses отфильтрованный лист с принцессами
     * @return отсортированный лист с принцессами
     */
    public static ArrayList<String[]> sortByStatus(ArrayList<String[]> filteredPrincesses) {
        return null;
    }

    /**
     * Записать принцесс в новый файл в формате:
     *  Имя
     *  Статус
     *  Место заточения
     *  Доп информация
     *  <Пустая строка>
     */
    public static void write(String fileToWriteName) {

    }

    public static void main(String[] args) throws Exception {
        write("result.txt");
    }

}