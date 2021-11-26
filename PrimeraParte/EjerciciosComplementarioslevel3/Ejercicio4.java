package PrimeraParte.EjerciciosComplementarioslevel3;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Ejercicio4 {
    public static void main (String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        
        numeros.stream().distinct().collect(Collectors.toList());
        List<Long> numerosFactorial = numeros.stream().map(Ejercicio4::factorialStreams).collect(Collectors.toList());
        System.out.println(numerosFactorial);
    }

        public static long factorialStreams( long n ) {
            return LongStream.rangeClosed( 1, n )
                     .reduce(1, ( long a, long b ) -> a * b);     
    } 
}