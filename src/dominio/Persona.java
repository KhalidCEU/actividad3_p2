package dominio;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Persona (String nombre, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public long getEdad() {
        return this.calcularEdad();
    }

    public long calcularEdad() {
        LocalDate hoy = LocalDate.now();

        long edad = fechaDeNacimiento
            .until(hoy)
            .getYears();

        return edad;
    }
}
