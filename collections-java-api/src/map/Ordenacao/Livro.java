package map.Ordenacao;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    String nome;
    String autor;
    double preco;

    public Livro(String nome, String autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        
        return "\nLivro: "+nome+" Autor: "+autor+" Preco: "+preco;
    }
}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}
