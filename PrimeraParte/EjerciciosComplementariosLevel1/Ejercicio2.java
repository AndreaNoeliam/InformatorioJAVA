//Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numero1 = myObj.nextInt();

        System.out.println("Ingrese otro número");
        int numero2 = myObj.nextInt();

       
        String numero_1= String.valueOf(numero1);
        String numero_2= String.valueOf(numero2);

        System.out.println(numero_1 + "+" + numero_2 + "=" + (numero1 + numero2));
        System.out.println(numero_1 + "/" + numero_2 + "=" + (numero1 / numero2));
        System.out.println(numero_1 + "*" + numero_2 + "=" + (numero1 * numero2));
        System.out.println(numero_1 + "-" + numero_2 + "=" + (numero1 - numero2));
        System.out.println(numero_1 + "%" + numero_2 + "=" + (numero1 % numero2));
        myObj.close();
    }

    
}
