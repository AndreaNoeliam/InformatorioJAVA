package PrimeraParte.EjerciciosComplementarioslevel3;
import java.util.List;
import java.util.stream.Collectors;




public class Ejercicio3 {
    public static void main(String[] args) {    
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        
        List<String> startsWithB =
          palabras.stream()
                 .filter(name -> name.substring(0,1).equalsIgnoreCase("b"))
                 .collect(Collectors.toList());
        int cont = startsWithB.size();
        
        System.out.println(cont);
    }}
