package set.Ordenacao.Produto;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class CadastroProduto {
    
    Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new TreeSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorPreco() {
        //Para ter um conjunto SET ordenado é preciso passar o COMPARATOR no construtor do conjunto 
        Set<Produto> setPorPreco = new TreeSet<>(Comparator.comparing(Produto::getPreco)); 
        for(Produto p: produtoSet) {
            setPorPreco.add(p);
        }
        return setPorPreco;
    }

    public Set<Produto> exibirProdutosPorNome() {
        //Para ter um conjunto SET ordenado é preciso passar o COMPARATOR no construtor do conjunto 
        Set<Produto> setPorNome = new TreeSet<>(Comparator.comparing(Produto::getNome)); 
        for(Produto p: produtoSet) {
            setPorNome.add(p);
        }
        return setPorNome;
    }

    public static void main(String[] args) {
        
        CadastroProduto produtos = new CadastroProduto();

        produtos.adicionarProduto("Cadeira Gamer Pichau", 23564872, 1500.0, 2);
        produtos.adicionarProduto("Cadeira Ergonômica", 55421235, 2500.10, 3);
        produtos.adicionarProduto("Monitor AOC 140Hz", 333320121, 1300.0, 1);
        produtos.adicionarProduto("Teclado Gamer SPACEX", 12456385, 358.50, 4);

        System.out.println(produtos.exibirProdutosPorNome());

        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
