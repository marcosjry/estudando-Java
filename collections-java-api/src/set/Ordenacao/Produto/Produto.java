package set.Ordenacao.Produto;


public class Produto implements Comparable<Produto> {
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Produto outro) {

        return this.nome.compareTo(outro.getNome());
    }

    public int precoCrescente(Produto outro) {
        return Double.compare(this.preco, outro.getPreco());
    }

    @Override
    public String toString() {
        return "\nProduto: "+nome+" Codigo: "+codigo+"\nPreço: "+preco+" Quantidade: "+quantidade;
    }

}
