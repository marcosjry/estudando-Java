package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String descricao) {
        dicionario.put(palavra, descricao);
    }

    public void removerPalavra(String palavra) {
        if(!(dicionario.isEmpty())) {
            dicionario.remove(palavra);   
            System.out.println("Palavra Removida."); 
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public String pesquisarPalavra(String palavra) {   
        if(dicionario.containsKey(palavra)) { 
            return dicionario.get(palavra);
        }
        return "palavra Não Encontrada";
    }


    public static void main(String[] args) {
        Dicionario palavras = new Dicionario();

        palavras.adicionarPalavra("Abstinência", "1.\r\n" + //
                        "ato de abster-se, de privar-se do uso de alguma coisa.\r\n" + //
                        "2.\r\n" + //
                        "moderação ou sobriedade no comer, no beber e na vida sexual.");

        palavras.adicionarPalavra("Trabalho", "1.\r\n" + //
                        "conjunto de atividades, produtivas ou criativas, que o homem exerce para atingir determinado fim.\r\n" + //
                        "\"t. manual\"\r\n" + //
                        "2.\r\n" + //
                        "atividade profissional regular, remunerada ou assalariada.\r\n" + //
                        "\"t. de tempo integral\"");
    
        palavras.exibirPalavras();
        System.out.println("\n \nPesquisando pela palavra");
        System.out.println(palavras.pesquisarPalavra("Trabalho"));

        palavras.removerPalavra("Abstinência");
        System.out.println("\n \nPesquisando pela palavra");
        System.out.println(palavras.pesquisarPalavra("Abstinência"));
    
    
    
    
    
    }
}
