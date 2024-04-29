package list.Pesquisa.Soma;

public class Numero {
    private int numero;

    public Numero(int valor) {
        this.numero = valor;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        
        return ""+numero;
    }
}
