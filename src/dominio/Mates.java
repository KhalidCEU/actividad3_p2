package dominio;

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
}
