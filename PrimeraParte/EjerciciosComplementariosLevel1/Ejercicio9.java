//Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un texto");
        String texto = input.nextLine();
        System.out.println("Ingrese el caracter que desea contar");
        String letra = input.nextLine();
        char caracter = letra.charAt(0);

        int i=0;

        for (char caracteres : texto.toCharArray()){
            if (caracteres == caracter){
                i++;
            
           

            }
        }
        System.out.println(i);

        input.close();
}     }   

    

