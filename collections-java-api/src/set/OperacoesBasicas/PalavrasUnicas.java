package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {
    
    Set<String> conjuntoPalavras;

    public PalavrasUnicas(){
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String remover = null;
        for(String p: conjuntoPalavras) {
            if(p.contains(palavra)) {
                remover = p;
                break;
            }
        }
        conjuntoPalavras.remove(remover);
    }

    public void verificarPalavra(String palavra){
        if(conjuntoPalavras.contains(palavra)) {
            System.out.println("Palavra está no conjunto");
        } else {
            System.out.println("Palavra não está no conjunto");
        }
        
    }

    public void exibirPalavras() {
        System.out.println(conjuntoPalavras);
    }

    public static void main(String[] args) {
        
        PalavrasUnicas palavras = new PalavrasUnicas();


        palavras.adicionarPalavra("Banana");
        palavras.adicionarPalavra("Morango");
        palavras.adicionarPalavra("Panqueca");
        palavras.adicionarPalavra("Esfiha");
        palavras.adicionarPalavra("Morango");

        palavras.exibirPalavras();

        palavras.removerPalavra("Morango");
        palavras.exibirPalavras();
        palavras.verificarPalavra("Morango");

    }
}
