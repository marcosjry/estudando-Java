package set.Ordenacao.Aluno;

public class Aluno {
    private String nome;
    private long matricula;
    private int nota;

    public Aluno(String nome, long matricula, int nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        
        return "\nAluno ["+nome+"]\nMatricula ["+matricula+"]\nNota ["+nota+"]\n";
    }
}
