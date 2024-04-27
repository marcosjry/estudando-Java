package list.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private List<Tarefa> tarefaList;


    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefa() {
        System.out.println(tarefaList);
    }



    public static void main(String[] args) {
        
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na lista de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        String tarefaUm = "Lavar pratos";
        listaTarefa.adicionaTarefa(tarefaUm);
        listaTarefa.adicionaTarefa(tarefaUm);
        listaTarefa.adicionaTarefa(tarefaUm);
        listaTarefa.adicionaTarefa(tarefaUm);
        listaTarefa.adicionaTarefa("tarefa Dois");

        System.out.println("O numero total de elementos na lista de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
    
        listaTarefa.obterDescricoesTarefa();
    


    }
}
