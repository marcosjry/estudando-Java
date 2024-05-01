package Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar o consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirPar = numero -> {
            if(numero % 2 == 0) {
                System.out.println(" "+ numero + " ");
            }
        };

        numeros.stream().forEach(integer -> {
                if(integer % 2 == 0) {
                    System.err.println(integer);
                }
            }
        );

        //Usar o consumer para imprimir números pares no sistema
        numeros.stream().filter(i -> i % 2 == 0)
            .forEach(System.out::println);
    }

}
