package lesson11;

import java.util.ArrayList;

public class Practicum {

    /*
    Дан файл с принцессами princesses.txt (имя, жизненный статус, место заточения, доп.информация).
    Задание состоит в том, чтобы отсортировать принцесс по жизненному статусу
    и записать в новый файл только тех, которых есть смысл спасать.

    Методы заданы с правильными аргументами и возвратным типом.
     */

    /**
     * Прочитать файл и сохранить данные каждой принцессы в лист.
     * @return лист с принцессами
     */
    public static ArrayList<String[]> read() {
        // Здесь должен быть код программы
        return null;
    }

    /**
     * Исключить принцесс с неподходящим статусом: "EATEN", "SAVED", "SLAYED THE DRAGON HERSELF".
     * Их нет смысла спасать.
     * @param princesses лист с принцессами
     * @return отфильтрованный лист с принцессами
     */
    public static ArrayList<String[]> filterByStatus(ArrayList<String[]> princesses) {
        // Здесь должен быть код программы
        return null;
    }

    /**
     * Отсортировать принцесс по статусу FIGHTS FOR LIFE > INJURED > IN PANIC > BORED.
     * FIGHTS FOR LIFE идет перед INJURED и тд.
     * @param filteredPrincesses отфильтрованный лист с принцессами
     * @return отсортированный лист с принцессами
     */
    public static ArrayList<String[]> sortByStatus(ArrayList<String[]> filteredPrincesses) {
        // Здесь должен быть код программы
        return null;
    }

    /**
     * Записать принцесс в новый файл в формате:
     * Имя1    Статус1    Место заточения1    Доп информация1    \n
     * Имя2    Статус2    Место заточения2    Доп информация2    \n
     * ...
     * ИмяN    СтатусN    Место заточенияN    Доп информацияN    \n
     */
    public static void write(String fileToWriteName) {
        // Здесь должен быть код программы
    }

    public static void main(String[] args) throws Exception {
        write("result.txt");
    }

}