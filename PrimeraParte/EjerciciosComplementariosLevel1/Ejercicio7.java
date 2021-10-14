//Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Ingrese un texto");
        String texto = input.next();

        input.close();
        for (char caracteres : texto.toCharArray()) {
            System.out.print((char) (caracteres-32));

        }
        

    }
    
}
