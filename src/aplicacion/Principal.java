package aplicacion;

import java.util.ArrayList;

import dominio.Mates;

public class Principal {

    public static void main(String[] args) {
        // Suma hasta n
        System.out.println("Suma hasta n: " + Mates.sumaHastaN(10));

        // Factorial
        System.out.println("Factorial: " + Mates.factorial(5));

        // Potencia N-ésima
        System.out.println("Potencia: " + Mates.potencia(2, 4));

        // Suma elementos
        int[] listaNumeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Suma elementos lista: " + Mates.sumaElementosLista(listaNumeros, 0));

        // Media elementos
        System.out.println("Media elementos lista: " + Mates.mediaElementosLista(listaNumeros, 0, listaNumeros.length));

        // Desviacion tipica
        int[] listaNumeros2 = {9, 3, 8, 8, 9, 8, 9, 18};
        double media = Mates.mediaElementosLista(listaNumeros2, 0, listaNumeros2.length);
        System.out.println("Desviación elementos lista: " + Mates.desviacionElementosLista(listaNumeros2, media, listaNumeros2.length, 0, 0));

        // Suma pares en n numeros
        System.out.println("Suma pares: " + Mates.sumaParesHastaN(9));

        // Suma pares de una lista
        System.out.println("Suma pares (lista): " + Mates.sumaParesElementosLista(listaNumeros, listaNumeros.length, 0));

        // Obtener pares de una lista
        ArrayList<Integer> listaVacia = new ArrayList<Integer>();
        System.out.println("Lista pares: " + Mates.obtenerListaPar(listaNumeros, listaVacia, 0));

        // Obtener pares de numeros hasta n
        ArrayList<Integer> listaVacia2 = new ArrayList<Integer>();
        System.out.println("Lista pares 2: " + Mates.obtenerListaParHastaN(listaVacia2, 9));

        // Obtener pares de numeros hasta n
        int[] listaNumeros3 = {1, 2, 3};
        int[] listaNumeros4 = {2, 4, 6};
        System.out.println("Producto escalar: " + Mates.productoEscalarListas(listaNumeros3, listaNumeros4, 0, 0));
    }

}
