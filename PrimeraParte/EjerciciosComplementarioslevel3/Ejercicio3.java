package PrimeraParte.EjerciciosComplementarioslevel3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class Ejercicio3 {
    public static void main (String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        List <String> palabrasFiltradas = palabras.stream().filter(p -> p != StringUtils.capitalize(StringUtils.lowerCase(p)).collect(Collectors.toList());

        System.out.println(palabrasFiltradas);

        public static void filtrar(String palabra) {

        }
    } 
}
