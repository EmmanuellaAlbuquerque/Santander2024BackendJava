package set.lista_de_alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for(Aluno aluno: alunosSet) {
            if(aluno.getMatricula() == matricula) {
                alunoParaRemover = aluno;
            }
        }

        alunosSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        System.out.println("Alunos: "+ gerenciadorAlunos.alunosSet);

        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println("Alunos: "+ gerenciadorAlunos.alunosSet);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
