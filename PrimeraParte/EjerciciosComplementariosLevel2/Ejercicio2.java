import java.util.ArrayList;
import java.util.List;
// Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).


public class Ejercicio2 {
    public static void main (String [] args){
        List<String> numeros = new ArrayList <>();
        cargarLista(numeros);

        int i=0;
        System.out.println("El tamaño de la lista es: " + numeros.size() );
        while (i<numeros.size()){
            System.out.println(numeros.get(i));
            i++;

        }

        numeros.add(0,"0");
        numeros.add("6");
        
        System.out.println("El tamaño de la lista nueva es: " + numeros.size());
        int x=0;
        while (x<numeros.size()){
            System.out.println(numeros.get(x));
            x++;
        }

        

    }

    private static void cargarLista(List<String> numeros) {
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
    }
    
}
