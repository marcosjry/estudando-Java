package set.Ordenacao.Aluno;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciaAlunos {
    
    Set<Aluno> setAlunos;

    public GerenciaAlunos(){
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, int nota) {
        setAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        for(Aluno aluno: setAlunos) {
            if(aluno.getMatricula() == matricula) {
                setAlunos.remove(aluno);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunoPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(Comparator.comparing(Aluno::getNome));
        for(Aluno aluno: setAlunos) {
            alunoPorNome.add(aluno);
        }
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunoPorNota(){
        Set<Aluno> alunoNota = new TreeSet<>(Comparator.comparing(Aluno::getNota));
        for(Aluno aluno: setAlunos) {
            alunoNota.add(aluno);
        }
        return alunoNota;
    }

    public void exibirAlunos() {
        System.out.println(setAlunos);
    }

    public static void main(String[] args) {
        GerenciaAlunos alunos = new GerenciaAlunos();

        alunos.adicionarAluno("Marcos", 1124578, 30);
        alunos.adicionarAluno("Pedro", 3215654, 50);
        alunos.adicionarAluno("Henrique", 3521452, 40);
        alunos.adicionarAluno("Maria", 4512178, 20);
        alunos.adicionarAluno("Milena", 1524689, 25);

        alunos.exibirAlunos();
        System.out.println("Exibindo por ordem alfabética");
        System.out.println(alunos.exibirAlunoPorNome());
        System.out.println("Exibindo por nota");

        System.out.println(alunos.exibirAlunoPorNota());

        alunos.removerAluno(4512178);

        alunos.exibirAlunos();
    }
}
