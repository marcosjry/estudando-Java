package Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    
    public static void main(String[] args) {
        

        List<String> palavras = Arrays.asList("marcos", "bruna", "suelen", "solange", "eurora");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        System.out.println(maisDeCincoCaracteres);

        palavras.stream()
            .filter(n -> n.length() < 5)
            .forEach(System.out::println);

    }


}
