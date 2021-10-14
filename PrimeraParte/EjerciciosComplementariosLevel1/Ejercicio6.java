//Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).


import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String [] args){
        Scanner input= new Scanner (System.in);

        System.out.println("Ingrese un número");

        int num1= input.nextInt();

        System.out.println("Ingrese otro número");
        int num2 = input.nextInt();

        input.close();
        int i=0;
        int c=1;

        while (i<num2){
            c=c*num1;
            i++;
        }
        System.out.println(num1+" "+"elevado a la"+" "+num2 + " "+"es"+" "+ c);

    }
    
}
