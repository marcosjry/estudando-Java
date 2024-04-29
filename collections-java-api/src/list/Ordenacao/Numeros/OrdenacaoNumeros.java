package list.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {
    
    List<Numero> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int valor) {
        listaNumeros.add(new Numero(valor));
    }

    public void ordenarAscendente() {
        listaNumeros.sort(Numero::compareTo);
    }

    public void ordenarDescendente() {
        listaNumeros.sort(Numero::descendente);
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

        listaNumeros.adicionarNumero(10);
        listaNumeros.adicionarNumero(5);
        listaNumeros.adicionarNumero(110);
        listaNumeros.adicionarNumero(20);
        listaNumeros.adicionarNumero(15);

        listaNumeros.ordenarAscendente();
        
        listaNumeros.exibirNumeros();

        listaNumeros.ordenarDescendente();

        listaNumeros.exibirNumeros();
        

    }
}
