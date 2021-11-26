package PrimeraParte.EjerciciosComplementarioslevel3;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;

    public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    
    public static int getAge(LocalDate fechaDeNacimiento) {
        Period edad = Period.between(fechaDeNacimiento, LocalDate.now());
        return edad.getYears();
    }

}