package PrimeraParte.EjerciciosComplementarioslevel3;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





public class Ejercicio5 {
    public static void main (String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.of(1978,10,20)),
        new Alumno("Lisa", "Simpson", LocalDate.of(1999,5,1)),
        new Alumno("Bart", "Simpson", LocalDate.of(1996,2,15)),
        new Alumno("Mickey","Mouse",LocalDate.of(2010,3,4)),
        new Alumno("Zoe", "Rousseao", LocalDate.of(1993,6,12))); 

    Map<String, Integer> alumnosMap = new HashMap<>();

    for (Alumno alumno : alumnos) {
        alumnosMap.put(alumno.getApellido() + " " + alumno.getNombre(),
            Alumno.getAge(alumno.getFechaDeNacimiento()));
      }
    System.out.println(alumnosMap);
    }

}
