package dominio;

import java.util.ArrayList;

public class Mates {

    // Suma 0 + 1 + 2 + ... + n.
    public static int sumaHastaN(int nb) {
        if (nb == 0) {
            return 0;
        }

        return nb + sumaHastaN(nb - 1);
    }

    // Factorial de un numero
    public static int factorial(int nb) {
        if (nb == 1) {
            return 1;
        }

        return nb * (factorial(nb - 1));
    }

    // Potencia n-esima
    public static int potencia(int nb, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return nb * potencia(nb, exponente - 1);
    }

    // Suma elementos de una lista de numeros
    public static int sumaElementosLista(int[] listaNumeros, int index) {
        if (index == listaNumeros.length) {
            return 0;
        }

        return listaNumeros[index] + sumaElementosLista(listaNumeros, index + 1);
    }

    // Media aritmetica de una lista de numeros
    public static double mediaElementosLista(int[] listaNumeros, int index, int tallaInicial) {
        if (index == listaNumeros.length) {
            return 0;
        }

        // sumo recursivamente
        double suma = listaNumeros[index] + mediaElementosLista(listaNumeros, index + 1, tallaInicial);

        if (index == 0) {
            // calculo de media
            suma = suma / tallaInicial;
        }

        return suma;
    }

    // Desviación tipica de una lista de numeros
    public static double desviacionElementosLista(int[] listaNumeros, double media,
        int tallaInicial, int index, double sumaDiferencias)
    {
        if (index == listaNumeros.length) {
            double varianza = sumaDiferencias / tallaInicial;
            return Math.sqrt(varianza); // retorno desviacion
        }

        double diferenciaCuadrado = Math.pow(listaNumeros[index] - media, 2);
        sumaDiferencias += diferenciaCuadrado;

        return desviacionElementosLista(listaNumeros, media, tallaInicial, index + 1, sumaDiferencias);
    }

    // Suma de numeros pares hasta N
    public static int sumaParesHastaN(int nb) {
        if (nb == 0) {
            return 0;
        }

        if (nb % 2 == 0) {
            return nb + sumaParesHastaN(nb - 1);
        }

        return sumaParesHastaN(nb - 1);
    }

    // Suma de elementos pares en una lista
    public static int sumaParesElementosLista(int[] listaNumeros, int tallaInicial, int i) {
        if (i == tallaInicial) {
            return 0;
        }

        if (listaNumeros[i] % 2 == 0){
            return listaNumeros[i] + sumaParesElementosLista(listaNumeros, tallaInicial, i+1);
        } else {
            return sumaParesElementosLista(listaNumeros, tallaInicial, i+1);
        }
    }

    // Lista de numeros pares de una lista dada
    public static ArrayList<Integer> obtenerListaPar (int[] listaNumeros, ArrayList<Integer> nuevalista, int i) {
        if (i == listaNumeros.length) {
            return nuevalista;
        }

        if (listaNumeros[i] >= 2 && listaNumeros[i] % 2 == 0) {
            nuevalista.add(listaNumeros[i]);
        }

        return obtenerListaPar(listaNumeros, nuevalista, i + 1);
    }

    // Lista de numeros pares hasta N (en orden descendiente)
    public static ArrayList<Integer> obtenerListaParHastaN (ArrayList<Integer> nuevaLista, int nb) {
        if (nb == 0) {
            return nuevaLista;
        }

        if (nb >= 2 && nb % 2 == 0) {
            nuevaLista.add(nb);
        }

        return obtenerListaParHastaN(nuevaLista, nb - 1);
    }

    // Producto escalar de dos listas no vacias y del mismo tamaño
    public static int productoEscalarListas(int[] listaNumeros1, int[] listaNumeros2, int i, int resultado) {
        if (listaNumeros1.length != listaNumeros2.length) {
            System.out.println("Las listas deben ser del mismo tamaño");
            System.exit(1);
        }

        if (i == listaNumeros1.length) {
            return resultado;
        }

        resultado += listaNumeros1[i] * listaNumeros2[i];
        return productoEscalarListas(listaNumeros1, listaNumeros2, i + 1, resultado);
    }

 }
