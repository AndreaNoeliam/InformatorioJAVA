import java.util.ArrayList;
import java.util.List;
// Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.


public class Ejercicio5 {
    public static void main (String [] args){
        List<Integer> horas = new ArrayList <>();
        List <Integer> pago = new ArrayList <>();
        List <Integer> cobro = new ArrayList<>();

        cargarLista(horas);
        cargarLista2(pago);
        for (int i=0; i< horas.size(); i++){
            cobro.add(horas.get(i)*pago.get(i));
        }
        int x=0;
        int b=0;
        while (x<horas.size()){
            b=b+ cobro.get(x);
            x++;
        }
        System.out.println(cobro);
        System.out.println("Total : $" + b);

    }
    private static void cargarLista(List<Integer> horas){
        horas.add(6);
        horas.add(7);
        horas.add(8);
        horas.add(4);
        horas.add(5);
    }
    private static void cargarLista2(List<Integer> pago){
        pago.add(350);
        pago.add(345);
        pago.add(550);
        pago.add(600);
        pago.add(320);
    }
    
}
