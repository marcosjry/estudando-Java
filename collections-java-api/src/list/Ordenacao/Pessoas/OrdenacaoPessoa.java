package list.Ordenacao.Pessoas;

import java.util.ArrayList;

import java.util.List;


public class OrdenacaoPessoa {
    
    List<Pessoa> listaPessoas;



    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void exibirPessoas() {
        System.out.println(listaPessoas);
    }

    public void ordenarPorIdade() {
        listaPessoas.sort(Pessoa::compareTo);
    }

    public void ordenarPorAltura() {
        listaPessoas.sort(Pessoa::compareToAltura);
    }

    public static void main(String[] args) {
        OrdenacaoPessoa pessoasLista = new OrdenacaoPessoa();

        pessoasLista.adicionarPessoa("Marcos", 23, 1.79);
        pessoasLista.adicionarPessoa("Marcelo", 22, 1.78);
        pessoasLista.adicionarPessoa("Joao Pedro", 22, 1.70);
        pessoasLista.adicionarPessoa("Rayane", 19, 1.70);

        System.out.println("Lista na ordem em que foram inseridos.");
        pessoasLista.exibirPessoas();
        System.out.println("Lista Ordenada por Altura");
        pessoasLista.ordenarPorAltura();

        pessoasLista.exibirPessoas();
        System.out.println("Lista Ordenada por Idade");
        pessoasLista.ordenarPorIdade();

        pessoasLista.exibirPessoas();
        
    }

}
