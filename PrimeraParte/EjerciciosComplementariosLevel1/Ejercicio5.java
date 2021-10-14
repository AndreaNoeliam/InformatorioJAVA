// Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");

        int numero1= input.nextInt();

        System.out.println("Ingrese otro número");

        int numero2=input.nextInt();
        input.close();
        int i=0;
        int b=0;

    
        while (i<numero2){
            b=b + numero1;
            i++;
        }
        
        System.out.println(numero1+"x"+numero2+"="+b);

        

    

    
    }
    
}
