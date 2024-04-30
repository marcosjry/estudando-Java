package map.Ordenacao;

public class Evento {
    String nomeEvento;
    String nomeAtracao;

    public Evento(String nomeAtracao, String nomeEvento) {
        this.nomeAtracao = nomeAtracao;
        this.nomeEvento = nomeEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        
        return "\nEvento: "+nomeEvento+" Atração: "+nomeAtracao;
    }
}
