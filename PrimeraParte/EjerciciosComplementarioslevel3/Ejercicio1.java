package PrimeraParte.EjerciciosComplementarioslevel3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class Ejercicio1 {
    public static void main (String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List <String> palabrasFiltradas = palabras.stream().filter(p -> p != null && !p.isEmpty()).collect(Collectors.toList());

        System.out.println(palabrasFiltradas);
    } 
}
