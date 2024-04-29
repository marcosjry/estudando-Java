package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        convidadosSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidado(int codigo) {
        Convidado convidadoAremover = null;
        for(Convidado c: convidadosSet){
            if(c.getCodigoConvite() == codigo) {
                convidadoAremover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoAremover);
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        
        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();

        listaConvidados.adicionarConvidado("Marcos Antônio", 152487);

        listaConvidados.adicionarConvidado("Marilia Leia", 358475);
        listaConvidados.adicionarConvidado("Josealdo Antunes", 152487);
        listaConvidados.adicionarConvidado("Arlindo Mares", 356289);

        listaConvidados.exibirConvidados();

        listaConvidados.removerConvidado(358475);
        
        listaConvidados.exibirConvidados();

        
    }
}