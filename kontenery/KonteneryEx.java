package czarnotalukasz.kontenery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class KonteneryEx {
    public static void wypiszImiona() throws IOException {
        System.out.println("Podaj imiona, zakończ \"-\"");
        Set<String> zbior = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imie;
        while(true) {
            imie = reader.readLine();
            if (imie.equals("-")) {
                break;
            } else {
                zbior.add(imie);
            }
        }
        Stream streamIm = zbior.stream();
        streamIm.forEach(System.out::println);
    }
    public static void wypiszPare() {
        System.out.println("podaj pary imion");
        Map<String, String> pary = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String key, value;
        while (true) {
            key = scan.next();
            if (key.equals("-")) {
                break;
            } else {
                value = scan.next();
                pary.put(key, value);
            }
        }
        System.out.println("Podaj imie, a ja podam Ci parę");
        String imie = scan.next();
        System.out.println(pary.get(imie));
    }
    public static void main(String[] args) throws IOException {
        wypiszImiona();
        wypiszPare();
    }
}
