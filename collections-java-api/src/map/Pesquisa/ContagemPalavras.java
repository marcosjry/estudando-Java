package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    Map<String, Integer> contaPalavras;

    public ContagemPalavras() {
        this.contaPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer quantidade) {
        contaPalavras.put(palavra, quantidade);
    }

    public void removerPalavra(String palavra) {
        if(!contaPalavras.isEmpty()) {
            contaPalavras.remove(palavra);

        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : contaPalavras.values()) {
          contagemTotal += contagem;
        }
        return contagemTotal;
      }

    public String exibePalavraMaisFrequente() {
        String linguaguemMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry: contaPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguaguemMaisFrequente = entry.getKey();
            }
        }
        return linguaguemMaisFrequente;
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    public static void main(String[] args) {
        
        ContagemPalavras contaPalavras = new ContagemPalavras();
        
        contaPalavras.adicionarPalavra("Olá", 15);
        contaPalavras.adicionarPalavra("Carambolas",20);
        contaPalavras.adicionarPalavra("Mundo", 5);
        contaPalavras.adicionarPalavra("Tchau", 10);

        System.out.println(contaPalavras.exibirContagemPalavras());

        System.out.println(contaPalavras.exibePalavraMaisFrequente());

        contaPalavras.removerPalavra("Olá");
    
    }
}
