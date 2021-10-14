import java.util.ArrayList;
/*Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 */


public class Ejercicio7 {

    public static void main(String [] args){
        System.out.println(fizzBuzzFuncion(1,6));
        System.out.println(fizzBuzzFuncion(1,8));





    }
    public static ArrayList <String> fizzBuzzFuncion (int num1, int num2){
        ArrayList <String> arrayListString = new ArrayList<>();

        for (int i=num1; i<num2; i++){
            if (i==1){
                arrayListString.add("1");
            }
            else if (i%2==0 && i%3==0){
                arrayListString.add("FizzBuzz");
            }
            else if (i%2==0){
                arrayListString.add("Fizz");
            }
            else if (i%3==0){
                arrayListString.add("Buzz");
            }

            
            else {
                arrayListString.add(String.valueOf (i));
            }
        
        }
        return arrayListString;

        }
}
