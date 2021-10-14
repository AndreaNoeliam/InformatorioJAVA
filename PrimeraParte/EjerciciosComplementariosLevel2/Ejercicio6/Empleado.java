package Ejercicio6;

public class Empleado {
        int dni;
        String nombre;
        String apellido;
        int horas;
        int valorPorHora;


        public Empleado (String nombre, int dni, int horas, int valorPorHora){
            this.nombre=nombre;
            this.dni=dni;
            this.horas=horas;
            this.valorPorHora=valorPorHora;
        }

        public int sueldo(){
            return horas*valorPorHora;
        }

    
}

