package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  //atributo
  private Set<Contato> contatosSet;

  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatosSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    if (!contatosSet.isEmpty()) {
      System.out.println(contatosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().startsWith(nome)) {
          contatosPorNome.add(c);
        }
      }
      return contatosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().equalsIgnoreCase(nome)) {
          c.setNumero(novoNumero);
          contatoAtualizado = c;
          break;
        }
      }
      return contatoAtualizado;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {

    AgendaContatos agendaContatos = new AgendaContatos();


    agendaContatos.exibirContatos();


    agendaContatos.adicionarContato("Paulo Guedes", 321456879);
    agendaContatos.adicionarContato("Maria Marilande", 65482321);
    agendaContatos.adicionarContato("Maria", 357532468);
    agendaContatos.adicionarContato("Ana Eduarda", 656895477);
    agendaContatos.adicionarContato("João Henrique", 362415178);
    agendaContatos.adicionarContato("Carlos", 215487825);

    agendaContatos.exibirContatos();


    System.out.println(agendaContatos.pesquisarPorNome("Paulo Guedes"));


    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carlos", 40028922);
    System.out.println("Contato atualizado: " + contatoAtualizado);


    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContatos();
  }
}
