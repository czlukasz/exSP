package czarnotalukasz.util;

import java.io.PrintStream;

public class Print {
    // wyświetlanie ze znakiem nowego wiersza
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // wyświetlanie bez znaku nowego wiersza
    public static void printbn(Object obj) {
        System.out.print(obj);
    }

    // tylko nowy wiersz
    public  static void print() {
        System.out.println();
    }

    //nowa metoda printf()
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
