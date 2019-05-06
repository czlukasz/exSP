package czarnotalukasz.strumienieJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TworzenieStrumieni {
    public static void main(String[] args){
//Strumień na podstawie kolekcji:
        Stream<Integer> stream1 = new LinkedList<Integer>().stream();
//Strumień na podstawie tablicy:
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{1,3,5,7,9,11,13,15});
//Strumień na podstawie łańcucha znaków rozdzielanego przez wyrażenie regularne:
        Stream<String> stream3 = Pattern.compile(".").splitAsStream("some longer sentence");
//Strumień typów prostych:
        DoubleStream doubles = DoubleStream.of(1, 2, 3);
//IntStream ints = IntStream.range(0, 123);
        LongStream longs = LongStream.generate(() -> 1L);
//Strumień danych losowych:
        DoubleStream randomDoubles = new Random().doubles();
        IntStream randomInts = new Random().ints();
        LongStream randomLongs = new Random().longs();
//Pusty strumień:
        Stream.empty();
//Strumień danych z pliku:
        try (Stream<String> lines = new BufferedReader(new FileReader("file.txt")).lines()) {
            // do something
        } catch (FileNotFoundException ex) {}
        stream2.filter(g -> g > 2).map(g -> g.doubleValue()).limit(5).forEach(System.out::println);
    }
}
