package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    


    Map<String,Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        //O PUT adiciona e faz o replace da variável caso seja passado um valor repetido
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!contatosMap.isEmpty()) {
            contatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(contatosMap);
    }

    public Integer pesquisarNome(String nome) {
        if(contatosMap.isEmpty()) {
            System.out.println("Não existem contatos salvos ainda.");
        }
        return contatosMap.get(nome);
    }

    

    public static void main(String[] args) {
        
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Marcos Antônio", 988683142);
        contatos.adicionarContato("Marcos Paulo", 988064891);
        contatos.adicionarContato("Vinicius", 988332145);
        contatos.adicionarContato("Paula", 988643215);

        System.out.println(contatos.pesquisarNome("Vinicius"));
        
        contatos.exibirContatos();

        contatos.removerContato("Paula");

        contatos.exibirContatos();


    }
}

