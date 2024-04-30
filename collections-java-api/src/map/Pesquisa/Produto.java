package map.Pesquisa;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoTotalProduto() {
        return preco*quantidade;
    }

    @Override
    public String toString() {
        
        return "Produto: "+nome+"\nPreco: "+preco+"\nQuantidade: "+quantidade+"\n";
    }
}
