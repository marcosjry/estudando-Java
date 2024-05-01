package Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    



    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,5,6,8);
        
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
            .reduce(0, somar);

        System.out.println("A soma dos números é: "+ resultado);

        int resultadoDois = numeros.stream()
            .reduce(0, Integer::sum);
        
        System.out.println(resultadoDois);
    }


}
