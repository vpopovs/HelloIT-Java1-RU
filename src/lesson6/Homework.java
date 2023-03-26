package lesson6;

public class Homework {

    /**
     * Дано две строки. Вывести на экран новую строку, которая имеет форму длинная строка + короткая строка + длинная строка.
     * Строки разной длины.
     * @param a первая строка
     * @param b вторая строка
     */
    public static void comboString(String a, String b) {

    }

    /**
     * Дана строка. Вывести на экран новую строку, в которой последние две буквы первоначальной строки стоят в начале.
     * Первоначальная строка состоит минимум из 2 символов.
     * @param str первоначальная строка
     */
    public static void toStart2(String str) {

    }

    /**
     * Дана строка. Вывести на экран новую строку, которая является вариантом первоначальной строки, но без первой и последней буквы.
     * Длина первоначальной строки может быть 0.
     * @param str первоначальная строка
     */
    public static void withoutStartEnd(String str) {

    }

    /**
     * Дана строка. Вывести на экран true, если слово car и bus встречаются в строке одинаковое количество раз. Иначе - false.
     * @param str строка
     */
    public static void carBus(String str) {

    }

    /**
     * Дана первоначальная строка str и число n.
     * Вывести на экран строку, которая состоит из n последних символов строки str, которые повторяются n раз.
     * @param str первоначальная строка.
     * @param n количество последних символос строки, которые необходимо повторить столько же раз
     */
    public static void repeatEnd(String str, int n) {

    }

    public static void main(String[] args) {

        comboString("aaaaa", "bbb");    // aaaaabbbaaaaa
        comboString("Hi", "hello");     // helloHihello
        comboString("KKKKK", "L");      // KKKKKLKKKKK

        System.out.println("----------");

        toStart2("world");  // ldwor
        toStart2("test");   // stte
        toStart2("go");     // go

        System.out.println("----------");

        withoutStartEnd("system");  // yste
        withoutStartEnd("person");  // erso
        withoutStartEnd("");        //

        System.out.println("----------");

        carBus("carbuscar"); // false
        carBus("car4589bus");   // true
        carBus("djwejd123");    // true

        System.out.println("----------");

        repeatEnd("memory", 3); // oryoryory
        repeatEnd("minute", 2); // tete
        repeatEnd("sound", 1);  // d

    }

}
