package czarnotalukasz.cwiczeniaRozne;

import java.io.*;

public class WczytywanieDanych {
    public static void wczytajDaneIWypisz() throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wpisz liczbę później imię");
        double wiek = Double.parseDouble(rd.readLine());
        String imie = rd.readLine();
        System.out.println("Twoje imie to: " + imie);
        System.out.println("za pięć lat bedziesz miec " + (5 + wiek));
    }
    public static void zbudujString() throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder stb;
        StringBuffer stf;
        System.out.println("podaj trzy linijki tekstu");
        str = rd.readLine();
        stb = new StringBuilder(rd.readLine());
        stf = new StringBuffer(rd.readLine());
        System.out.println(str);
        stb.insert(0, '*');
        System.out.println(stb);
        stf.append("*********");
        System.out.println(stf.toString());

    }

    public static void main(String... args) throws Exception{
        //wczytajDaneIWypisz();
        zbudujString();
    }
}
