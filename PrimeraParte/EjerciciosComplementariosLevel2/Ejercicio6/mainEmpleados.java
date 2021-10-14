package Ejercicio6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* 6.	Se dispone de una lista de Empleados, de cada empleado se conoce:
○	Nombre y Apellido
○	DNI
○	horasTrabajadas
○	valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario)
donde la clave (key) es el dni y el valor (value) es el sueldo calculado. */



public class mainEmpleados {
    public static void main (String [] args){
        Set <Empleado> listado = new HashSet <>();
        HashMap <Integer,Object> sueldos_empleados = new HashMap <>();
        listado.add(new Empleado ("Juan Gonzalez", 30455666, 60,270));
        listado.add(new Empleado ("Jorge Rial", 17150679, 12, 700));
        listado.add(new Empleado("Laura Noesta", 11455555, 50, 200));

        for (Empleado empleado : listado){
            int sueldo_empleado = empleado.sueldo();
            sueldos_empleados.put(empleado.dni, sueldo_empleado);
        }
        System.out.println(sueldos_empleados);

        

        
    }
    
}
