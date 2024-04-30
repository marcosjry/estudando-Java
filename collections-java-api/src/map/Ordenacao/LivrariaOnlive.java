package map.Ordenacao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class LivrariaOnlive {
    Map<String,Livro> livrosMap;

    public LivrariaOnlive() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String nome, String autor, double preco) {
        livrosMap.put(link, new Livro(nome, autor, preco));
    }

    public void removerLivro(String titulo) {
        for(Map.Entry<String, Livro> entry: livrosMap.entrySet()) {
            if(entry.getValue().nome.equals(titulo)) {
                livrosMap.remove(entry.getKey());
                System.out.println("Livro Removido.");
                exibirLivros();
                break;
            }
        }
    }

    public Map<String, Livro> exibirLivrosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());
    
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
    
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
    
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
          livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
    
        return livrosOrdenadosPorPreco;
    }

    public void exibirLivros() {
        System.out.println(livrosMap);
    }

    public void pesquisarLivroPorAutor(String nome) {
        Map<String, Livro> mesmoAutor = new TreeMap<>();
        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if(entry.getValue().autor.equals(nome)) {
                mesmoAutor.put(entry.getKey(), entry.getValue());
            }
        }
        for(Map.Entry<String, Livro> entry : mesmoAutor.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public Livro livroMaisCaro() {
        Livro maiorPreco = null;
        double maior = 0;
        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if(entry.getValue().preco > maior) {
                maior = entry.getValue().preco;
                maiorPreco = entry.getValue();
            }
        }
        return maiorPreco;
    }

    public Livro livroMaisBarato() {
        Livro menorPreco = null;
        double menor = 0.0;
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            menor = entry.getValue().preco;
            menorPreco = entry.getValue();
            for(Map.Entry<String, Livro> entryDois : livrosMap.entrySet()) {
                if(menor > entryDois.getValue().getPreco()) {
                    menor = entryDois.getValue().preco;
                    menorPreco = entryDois.getValue();
                }
            }
            break;
        }
        return menorPreco;
    }


    public static void main(String[] args) {
        
        LivrariaOnlive livraria = new LivrariaOnlive();

        livraria.adicionarLivro("xxxx", "Percy Jackson", "null", 110);
        livraria.adicionarLivro("yyyy", "Harry Potter", "null", 55.0);
        livraria.adicionarLivro("jjjj", "Harry Potter 2", "null", 60);
        livraria.adicionarLivro("kkkk", "Harry Potter 3", "marcos", 70);
        livraria.adicionarLivro("llll", "Harry Potter 4", "vitoria", 90);

        //livraria.exibirLivros();

        //livraria.removerLivro("Percy Jackson");

        //System.out.println(livraria.exibirLivrosPorPreco());

        //livraria.pesquisarLivroPorAutor("null");

        System.out.println("Livro mais caro");
        System.out.println(livraria.livroMaisCaro());

        System.out.println("Livro mais barato");
        System.out.println(livraria.livroMaisBarato());
    }

}
