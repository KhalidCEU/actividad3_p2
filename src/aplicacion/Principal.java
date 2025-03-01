package aplicacion;

import java.util.List;

import dominio.*;

public class Principal {

    public static void main(String[] args) {
        System.out.println("\n -- Lambdas --");

        System.out.println("Integral e^(x^2): " + Lambda.integralEXCuadrado(0, 1, 0.1));
        System.out.println("Integral: " + Lambda.integral(0, 1, 0.1, x -> Math.exp(x*x)));
        System.out.println("Suma hasta n: " + Lambda.sumaHastaN(10, x -> x + 1));
        System.out.println("Factorial de n: " + Lambda.factorial(5));
        System.out.println("Potencia Nesima de n: " + Lambda.potenciaN(2, 3));
        System.out.println("Suma elementos lista: " + Lambda.sumaElementosLista(10));
        System.out.println("Media elementos lista: " + Lambda.mediaElementosLista(10));
        System.out.println("Desviacion tipica: " + Lambda.desviacionTipica(10));
        System.out.println("Suma pares hasta n: " + Lambda.sumaParesHastaN(10));
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 9, 10);
        System.out.println("Suma pares lista: " + Lambda.sumaParesLista(listaNumeros));
        System.out.println("Obtener lista par: " + Lambda.obtenerListaPar(listaNumeros));
        System.out.println("Obtener pares hasta n: " + Lambda.obtenerParesHastaN(10));

        System.out.println("\n\n -- Streams --");
        Streams.generaStreamOf();
        Streams.generaStreamRange();
        Streams.generaStreamIterate();
        Streams.generaStreamRandomDoubles();
    }

}
