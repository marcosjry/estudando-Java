import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        
        String meuNome = "Marcos Antônio";

        Date dataNascimento = new Date();

        //Aqui, diferente da linguagem C, eu posso concatenar Strings diretamente
        //utilizando o operador "+"
        /* 
        String restoNome = "da Silva Junior";
        String nomeCompleto = meuNome + " " + restoNome;

        System.out.println("\n"+nomeCompleto);
        System.out.println(dataNascimento);
        */

        
        String concatenacao = "?";

        concatenacao = "1"+1+1+1;

        System.out.println("\n"+concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println("\n"+concatenacao);

        concatenacao = "1"+(1+1+1+1);

        System.out.println("\n"+concatenacao);


    }
}
