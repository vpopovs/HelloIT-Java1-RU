package lesson6;

public class Practicum {

    /**
     * Дано слово с четным количеством букв. Вывести на экран первую половину слова.
     * @param word слово, половину которого необходимо найти
     */
    public static void half(String word) {
        // Здесь должен быть код программы
    }

    /**
     * Дано два слова. Соединить два слова, исключив из каждого слова первую букву. Вывести результат на экран.
     * @param a первое слово
     * @param b второе слово
     */
    public static void concatenation(String a, String b) {
        // Здесь должен быть код программы
    }

    /**
     * Дано слово. Вывести на экран новое слово, которое состоит из трех копий последних двух букв первоначального слова.
     * @param str первоначальное слово
     */
    public static void extraEnd(String str) {
        // Здесь должен быть код программы
    }

    /**
     * Дано слово. Вывести на экран новое слово, в котором удвоена каждая буква первоначального слова.
     * @param str первоначальное слово
     */
    public static void doubleChar(String str) {
        // Здесь должен быть код программы
    }

    /**
     * Дана строка. Вывести на экран, сколько раз слово hi встречается в данной строке.
     * @param str строка
     */
    public static void countHi(String str) {
        // Здесь должен быть код программы
    }

    public static void main(String[] args) {

        half("calendar");   // cale
        half("champion");   // cham
        half("umbrella");   // umbr

        System.out.println("----------");

        concatenation("thank", "you");  // hankou
        concatenation("come", "back");  // omeack
        concatenation("just", "dance"); // ustance

        System.out.println("----------");

        extraEnd("gold");   // ldldld
        extraEnd("music");  // icicic
        extraEnd("morning");// ngngng

        System.out.println("----------");

        doubleChar("house");    // hhoouussee
        doubleChar("spoon");    // ssppoooonn
        doubleChar("space");    // ssppaaccee

        System.out.println("----------");

        countHi("hiaaHi");      // 2
        countHi("hihilalaHIa"); // 3
        countHi("ololo");       // 0
    }
}
