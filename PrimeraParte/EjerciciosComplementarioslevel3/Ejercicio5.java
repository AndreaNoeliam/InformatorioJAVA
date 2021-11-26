package PrimeraParte.EjerciciosComplementarioslevel3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main (String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.of(1978,10,20)),
        new Alumno("Lisa", "Simpson", LocalDate.parse("15/08/1987", fmt)),
        new Alumno("Bart", "Simpson", LocalDate.parse("05/05/2005", fmt)),
        new Alumno("Mickey","Mouse",LocalDate.parse("22/10/2010", fmt)),
        new Alumno("Zoe", "Rousseao", LocalDate.parse("10/02/1965", fmt))); 

    Map<String, Integer> alumnosMap = alumnos.stream()
                                            .collect(Collectors
                                            .toMap(k -> k.getNombre() + " "+ k.getApellido(), k -> Alumno.getAge(k.getFechaDeNacimiento())));

    System.out.println(alumnosMap);
    }
}