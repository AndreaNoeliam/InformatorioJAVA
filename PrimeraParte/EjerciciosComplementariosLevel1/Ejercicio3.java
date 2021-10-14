//Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numero = input.nextInt();

        int i=1;
        
        
        while (i<=numero) {
            System.out.println();
            for (int x = 1; x <= i; x++) {
                System.out.print(x);
            }
                
        
            i++;

            
        }

    
    
  


        input.close();
    }
    
}
