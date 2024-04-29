package list.Ordenacao.Pessoas;

public class Pessoa implements Comparable<Pessoa>{
    
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getName() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public int compareTo(Pessoa objeto) {
        return Integer.compare(this.idade, objeto.idade);
    }

    public int compareToAltura(Pessoa objeto) {
        return Double.compare(this.altura, objeto.altura);
    }

    @Override
    public String toString() {
        
        return "\nNome: "+nome+"\nIdade :"+idade+"\nAltura: "+altura;

    }
}
