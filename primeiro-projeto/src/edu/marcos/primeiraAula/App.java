package edu.marcos.primeiraAula;

public class App {
    
    
    public static String nomeCompleto (String nome1, String nome2) {
        return "\nResultado da concatenação: " + nome1.concat(" ").concat(nome2);
    }
    
    public static void main(String[] args) {
        String nomePrimeiro = "Marcos Antônio";
        String nomeSegundo = "da Silva Junior";

        String nomeTodo = nomeCompleto(nomeSegundo, nomePrimeiro);

        System.out.println(nomeTodo);
    }
    
    
    

}
