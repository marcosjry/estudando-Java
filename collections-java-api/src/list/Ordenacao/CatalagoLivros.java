package list.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    
    private List<Livro> livrosLista;

    public CatalagoLivros() {
        this.livrosLista = new ArrayList<>();
    }

    public void adicionarLivro(String nomeLivro, String autorLivro, int anoPublicacao) {
        livrosLista.add(new Livro(nomeLivro, autorLivro, anoPublicacao));
    }

    public void pesquisaPorAutor(String autorLivro) {
        System.out.println("Pesquisando por Autor: ");
        for(Livro l : livrosLista) {
            if(l.getAutor().equalsIgnoreCase(autorLivro)) {
                System.out.println(l);
            }
        }
    }

    public void pesquisaPorTitulo(String tituloLivro) {
        System.out.println("Pesquisando por títulos similares: ");
        for(Livro l : livrosLista) {
            if(l.getTitulo().equalsIgnoreCase(tituloLivro)) {
                System.out.println(l);
                break;
            }
        }
    }

    public void pesquisaPorIntervaloAno(int anoInicial, int anoFinal){
        System.out.println("Pesquisando no intervalo de anos escolhido: ");
        for(Livro i : livrosLista) {
            if(i.getAnoPub()>= anoInicial && i.getAnoPub() <= anoFinal) {
                System.out.println(i);
            }
        }
    }

    public void exibirLivros() {
        System.out.println(livrosLista);
    }

    public static void main(String[] args) {
        
        CatalagoLivros livrosCatalago = new CatalagoLivros();

        livrosCatalago.adicionarLivro("Um Conto de Duas Cidades", "Charles Dickens", 1859);
        livrosCatalago.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        livrosCatalago.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        livrosCatalago.adicionarLivro("Harry Potter e as Relíquias da Morte", "J. K. Rowling", 2007);
        livrosCatalago.adicionarLivro("Box Harry Potter - SÉRIE COMPLETA", "J. K. Rowling", 2001);
        livrosCatalago.adicionarLivro("Harry Potter e a Câmara Secreta", "J. K. Rowling", 1998);
        livrosCatalago.adicionarLivro("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 1999);

        //livrosCatalago.pesquisaPorAutor("J. K. Rowling");

        
        //livrosCatalago.pesquisaPorIntervaloAno(1500, 2001);

        //livrosCatalago.pesquisaPorTitulo("O Pequeno Príncipe");
    
        livrosCatalago.exibirLivros();
    }

}
