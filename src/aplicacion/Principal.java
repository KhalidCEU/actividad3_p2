package aplicacion;

import java.util.List;
import java.time.LocalDate;

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
        List<Integer> listaNumeros2 = List.of(6, 5, 4, 3, 2, 1);
        System.out.println("Producto escalar listas: " + Lambda.productoEscalar(listaNumeros, listaNumeros2));
        int nb = 10;
        System.out.println("El elemento " + nb + " de la sucesión de Fibonacci es: " + Lambda.fibonacci(nb));
        System.out.println("Integral (con stream): " + Lambda.integralConStream(0, 1, 0.1, x -> Math.exp(x*x)));


        System.out.println("\n\n -- Streams --");
        Streams.generaStreamOf();
        Streams.generaStreamRange();
        Streams.generaStreamIterate();
        Streams.generaStreamRandomDoubles();
        Streams.generaStreamRange();
        Streams.generaStreamIterate();
        Streams.generaStreamRandomDoubles();


        System.out.println("\n\n -- Persona(s) --");
        Persona juan = new Persona("Juan", LocalDate.of(2010, 10, 10));
        System.out.println("Edad de Juan: " + juan.calcularEdad());

        Personas personas = new Personas();
        personas.annadirPersona(juan);
        System.out.println("El mas joven es: " + personas.elMasJoven().getNombre());
        System.out.println("Suma total de edades: " + personas.calcularSumaEdades());
        System.out.println("Edad minima: " + personas.calcularEdadMinima());
        System.out.println("Media de edad: " + personas.calcularMediaDeEdad());
    }

}
