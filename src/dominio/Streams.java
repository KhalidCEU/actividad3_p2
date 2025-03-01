package dominio;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

// Ejercicio 14 (streams)

public class Streams {
    public static void generaStreamOf() {
        System.out.println("Stream (of) : ");

        IntStream numeros = IntStream.of(0, 10, 20);
        numeros.forEach(System.out::println);
    }

    public static void generaStreamRange() {
        System.out.println("Stream (range) : ");

        IntStream numeros = IntStream.range(0, 3);
        numeros.forEach(System.out::println);
    }

    public static void generaStreamIterate() {
        System.out.println("Stream (iterate) : ");

        IntStream numeros = IntStream.iterate(40, (x -> x + 1));
        numeros.limit(3).forEach(System.out::println);
    }

    public static void generaStreamRandomDoubles() {
        System.out.println("Stream (numeros double random) : ");
        Random random = new Random();

        DoubleStream numeros = random.doubles(1, 100);
        numeros.limit(4).forEach(System.out::println);
    }

}
