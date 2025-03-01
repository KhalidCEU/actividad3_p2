package dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.time.LocalDate;

public class Personas {
    ArrayList<Persona> personas;

    public Personas() {
        personas = new ArrayList<>();
        personas.add(new Persona("Ana", LocalDate.of(1980, 8, 20)));
        personas.add(new Persona("Pepe", LocalDate.of(1982, 2, 10)));
        personas.add(new Persona("Ernesto", LocalDate.of(2015, 5, 5)));
    }

    public void annadirPersona(Persona persona) {
        personas.add(persona);
        System.out.println(persona.getNombre() + " añadido a lista de personas: " + this.toString());
    }

    public Persona elMasJoven() {
        Persona masJoven =
            personas.stream()
                .min(Comparator.comparing(Persona::calcularEdad))
                .orElse(null);

        return masJoven;
    }

    public long calcularSumaEdades() {
        long sumaEdades = personas.stream()
            .mapToLong(Persona::calcularEdad)
            .sum();

        return sumaEdades;
    }

    public long calcularEdadMinima() {
        long edadMinima = personas.stream()
            .mapToLong(Persona::getEdad)
            .min()
            .orElse(0);

        return edadMinima;
    }

    public double calcularMediaDeEdad() {
        double mediaEdad = personas.stream()
            .mapToLong(Persona::getEdad)
            .average()
            .orElse(0.0);

        return mediaEdad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Persona persona : personas) {
            sb.append(persona.getNombre())
            .append("(")
            .append(persona.getEdad())
            .append(") ");
        }
        sb.append("\n");

        return sb.toString();
    }
}
