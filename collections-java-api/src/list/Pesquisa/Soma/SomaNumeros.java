package list.Pesquisa.Soma;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numero> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int valor) {
        listaNumeros.add(new Numero(valor));
    }

    public int calcularSoma() {
        int soma = 0;
        for(Numero n: listaNumeros){
            soma = soma + n.getNumero();
        }
        return soma;
    }

    public Numero encontraMaiorNumero() {
        Numero maior = listaNumeros.get(0);
        for(Numero n: listaNumeros) {
            if (maior.getNumero() < n.getNumero()) {
                maior = n;
            }
        }
        return maior;
    }

    public Numero encontraMenorNumero() {
        Numero menor = listaNumeros.get(0);
        for(Numero n: listaNumeros) {
            if (menor.getNumero() > n.getNumero()) {
                menor = n;
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        
        SomaNumeros numerosLista = new SomaNumeros();

        numerosLista.adicionarNumero(10);
        numerosLista.adicionarNumero(15);
        numerosLista.adicionarNumero(1);
        numerosLista.adicionarNumero(9);
        numerosLista.adicionarNumero(20);

        numerosLista.exibirNumeros();

        System.out.println(numerosLista.calcularSoma());
        System.out.println(numerosLista.encontraMaiorNumero());
        System.out.println(numerosLista.encontraMenorNumero());
        
        
    }
}