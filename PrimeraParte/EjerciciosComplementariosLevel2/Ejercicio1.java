import java.util.ArrayList;
import java.util.List;

//Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking

public class Ejercicio1{
    public static void main (String [] args){
        List<String> ciudades = new ArrayList <>();
        ciudades.add("Córdoba");
        ciudades.add("Buenos Aires");
        ciudades.add("Bariloche");
        ciudades.add("Mendoza");
        int largo = ciudades.size();

        for (int i=0; i<largo; i++){
            System.out.println(ciudades.get(i));
        }
    
    }
}