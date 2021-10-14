//Realizar un programa que calcule el factorial de un número: n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n. Sin hacer uso de librerías.



import java.util.Scanner;

public class Ejercicio4 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");

        int n = input.nextInt();

        int i=0;
        int b=1;

        
        while (i<=n){


            if (i>0){
                b=i*b;

            }
            
        
            i++;
            


        }
        System.out.print("El factorial de"+" "+n+ " "+  "es"+" "+ b);
        
        input.close();
    
}
}
