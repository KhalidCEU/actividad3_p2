package dominio;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.List;

public class Lambda {

    // Integral de e ^ (x^2) - no pedido por el ejercicio pero puesto por comparacion
    public static double integralEXCuadrado(double limInf, double limSup, double h) {
        double suma = 0;
        for (double x = limInf; x <= limSup; x += h) {
            suma += Math.exp(x * x) * h;
        }
        return suma;
    }

    /**
     * Calcula una aproximación de la integral de una función lambda
     *
     * @param a El limite inferior de la integral
     * @param b El limite superior de la integral
     * @param h El ancho de cada paso (/ancho del rectangulo)
     * @param funcion La función lambda de la que queremos calcular la integral
     * @return el resultado de la integral
     */
    public static double integral(double a, double b, double h,
        Function<Double, Double> funcion) {
        double suma = 0;

        for(double x = a; x <= b; x += h) {
            suma += funcion.apply(x) * h;
            // la altura del rectangulo es el valor de la func. en x
            // el area del rectangulo es ese valor multipl. por h
        }

        return suma;
    }

    // Ejercicio 15
    public static int sumaHastaN(int n, Function<Integer, Integer> func) {

        int suma = IntStream.range(0, n)
            .map(x -> func.apply(x))
            .sum();

        return suma;
    }

    public static int factorial(int n) {
        int factorial = IntStream.rangeClosed(1, n)
            .reduce(1, (a, b) -> a * b);

        return factorial;
    }

    public static int potenciaN(int n, int exponente) {
        int potenciaN = IntStream.range(0, exponente)
            .reduce(1, (acc, i) -> acc * n);

        return potenciaN;
    }

    public static int sumaElementosLista(int maxNb) {
        IntStream lista = IntStream.rangeClosed(0, maxNb);

        int sumaElementosLista = lista.sum();

        return sumaElementosLista;
    }

    public static double mediaElementosLista(int maxNb) {
        IntStream lista = IntStream.rangeClosed(0, maxNb);

        double mediaElementosLista = lista.average().orElse(0);

        return mediaElementosLista;
    }

    public static double desviacionTipica(int maxNb) {
        IntStream lista = IntStream.rangeClosed(0, maxNb);
        double media = mediaElementosLista(maxNb);

        double sumaCuadrados = lista.mapToDouble(x -> Math.pow(x - media, 2)).sum();
        double desviacionTipica = Math.sqrt(sumaCuadrados / (maxNb + 1));

        return desviacionTipica;
    }

    public static int sumaParesHastaN(int maxNb) {
        IntStream lista = IntStream.rangeClosed(0, maxNb);

        int sumaParesHastaN = lista.filter(x -> x % 2 == 0).sum();
        return sumaParesHastaN;
    }

    public static int sumaParesLista(List<Integer> listaNumeros) {
        int sumaPares = listaNumeros.stream()
            .filter(x -> x % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

        return sumaPares;
    }

    public static String obtenerListaPar(List<Integer> listaNumeros) {
        String listaPares = listaNumeros.stream()
            .filter(x -> x % 2 == 0)
            .map(String::valueOf) // convierto obj. Integer a obj. string
            .reduce((a, b) -> a + ", " + b)
            .orElse("");

        return listaPares;
    }

    public static String obtenerParesHastaN(int maxNb) {
        String lista = IntStream.rangeClosed(1, maxNb)
            .filter(x -> x % 2 == 0)
            .mapToObj(String::valueOf) // convierto ints (primitivos del stream) a obj. string
            .reduce((a, b) -> a + ", " + b)
            .orElse("");

        return lista;
    }

}

