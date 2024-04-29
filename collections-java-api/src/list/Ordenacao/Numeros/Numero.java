package list.Ordenacao.Numeros;

public class Numero implements Comparable<Numero>{
    private int numero;

    public Numero(int valor) {
        this.numero = valor;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Numero objeto) {
    
        return Integer.compare(this.numero, objeto.numero);
    }
    
    public int descendente(Numero objeto) {
    
        return Integer.compare(objeto.numero,this.numero);
    }

    @Override
    public String toString() {
        
        return ""+numero;
    }
}