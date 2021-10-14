import java.util.ArrayList;
import java.util.List;
//Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.

public class Ejercicio4 {
    public static void main(String [] args){
        List <String> alumnos= new ArrayList<>();
        cargarLista(alumnos);
        List <String> curso1 = alumnos.subList(0,4);
        List <String> curso2 = alumnos.subList(4,8);
        List <String> curso3 = alumnos.subList(8,12);
        System.out.println("Al curso 1 van a ir: " + curso1);
        System.out.println("Al curso 2 van a ir: " + curso2);
        System.out.println("Al curso 3 van a ir: " + curso3);

    }
    private static void cargarLista(List <String> alumnos){
        alumnos.add("Noelia");
        alumnos.add("Ramon");
        alumnos.add("Anastasia");
        alumnos.add("Rodrigo");
        alumnos.add("Maria");
        alumnos.add("Raul");
        alumnos.add("Carmela");
        alumnos.add("Domingo");
        alumnos.add("Lia");
        alumnos.add("Heidi");
        alumnos.add("Ludovico");
        alumnos.add("Fabricia");
    }
}
