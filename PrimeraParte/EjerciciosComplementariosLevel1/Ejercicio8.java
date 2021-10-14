/* 6.	Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido} */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Ingrese su Nombre y Apellido");
        String name = input.nextLine();
        System.out.println("Ingrese su Edad");
        String edad = input.nextLine();
        System.out.println("Ingrese su Dirección");
        String direccion = input.nextLine();
        System.out.println("Ingrese su Ciudad");
        String ciudad = input.nextLine();

        System.out.println(ciudad +"-" + direccion +"-"+ edad + "-" + name);



        input.close();

    }
    
}
