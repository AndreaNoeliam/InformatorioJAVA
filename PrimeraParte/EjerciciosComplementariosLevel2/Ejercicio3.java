import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
//Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.

public class Ejercicio3 {
    public static void main(String [] args){
        List<Integer> baraja= new ArrayList <>();
        cargarLista(baraja);
        int z=0;
        System.out.println("Orden creciente de la baraja:");
        while (z<baraja.size()){
            System.out.println(baraja.get(z));
            z++;
        }
        Collections.reverse(baraja);
        System.out.println("Orden decreciente de la baraja:");

        int x=0;
        while (x<baraja.size()){
            System.out.println(baraja.get(x));
            x++;
        }

        Collections.shuffle(baraja);
        System.out.println("Orden aleatorio de la baraja:");

        int y=0;
        while(y<baraja.size()){
            System.out.println(baraja.get(y));
            y++;
        }



    }
    private static void cargarLista(List<Integer> baraja){
        for (int i=2 ; i<=10 ; i++ ){
            baraja.add(i);
        }


    }
}
