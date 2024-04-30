package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Integer,Produto> produtosMap;
    int produtosDiferentes = 0;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(Integer key, String nome, double preco, int quantidade) {
        produtosMap.put(key, new Produto(nome, preco, quantidade));
        this.produtosDiferentes++;
    }

    public void exibirProdutos() {
        System.out.println(produtosMap);
    }

    public double calcularValorEstoque() {
        double valorTotal = 0;
        for(Produto p: produtosMap.values()) {
                valorTotal = valorTotal + p.getPrecoTotalProduto();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        double maior = 0;
        for(Produto p: produtosMap.values()) {
            if(maior < p.getPreco()) {
                maior = p.getPreco();
            }
        }
        for(Produto p: produtosMap.values()) {
            if (p.getPreco() == maior) {
                return p;
            }
        }
        return null;
    }

    public Produto obterProdutoMaisBarato() {
        double menor = 0.0;
        for(Produto p: produtosMap.values()) {
            if(menor == 0.0) {
                menor = p.getPreco();
            }
            if(menor > p.getPreco()) {
                menor = p.getPreco();
            }
        }
        for(Produto p: produtosMap.values()) {
            if (p.getPreco() == menor) {
                return p;
            }
        }
        return null;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        double precoMaior = 0;
        for(Produto p: produtosMap.values()) {
            if (precoMaior < p.getPrecoTotalProduto()) {
                precoMaior = p.getPrecoTotalProduto();
            }
        }
        for(Produto p: produtosMap.values()) {
            if (p.getPrecoTotalProduto() == precoMaior) {
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        
        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.adicionarProduto(1111111111, "Celular JS6", 1500, 10);
        produtos.adicionarProduto(222222222, "Monitor AOC", 1250, 5);
        produtos.adicionarProduto(333333333, "Mouse Pad", 50, 6);
        produtos.adicionarProduto(555555555, "Cadeira Gamer Pichau", 2000, 3);
        produtos.adicionarProduto(4444444, "Caixa de bombom", 15, 3);
    
        produtos.exibirProdutos();
        System.out.println(produtos.calcularValorEstoque());
        System.out.println("Produto maior valor total");
        System.out.println(produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println("Produto mais barato");
        System.out.println(produtos.obterProdutoMaisBarato());
        System.out.println("Produto mais caro");
        System.out.println(produtos.obterProdutoMaisCaro());

        System.err.println(produtos.produtosDiferentes);

    }
}
