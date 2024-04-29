package set.Pesquisa;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean concluida;
  
    public Tarefa(String descricao) {
      this.descricao = descricao;
      this.concluida = false;
    }
  
    public String getDescricao() {
      return descricao;
    }
  
    public boolean getEstadoTarefa() {
      return concluida;
    }
  
    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }
  
    public void setConcluida(boolean concluida) {
      this.concluida = concluida;
    }
  
    @Override
    public String toString() {
      return "\nTarefa: "+descricao+"\nConcluida: "+concluida;
    }
  }
