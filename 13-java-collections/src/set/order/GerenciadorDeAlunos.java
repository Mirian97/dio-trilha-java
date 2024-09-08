package set.order;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorDeAlunos {
    Set<Aluno> listaDeAlunos;

    public GerenciadorDeAlunos() {
        this.listaDeAlunos = new HashSet<>();
    }

    private void listaEstaVazia(){
        if(listaDeAlunos.isEmpty()){
            System.out.println("A lista de alunos está vazia");
        }
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        listaDeAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        listaEstaVazia();

        Aluno alunoARemover = null;
        for (Aluno aluno : listaDeAlunos) {
            if(aluno.getMatricula() == matricula){
                alunoARemover = aluno;
            }
        }
        listaDeAlunos.remove(alunoARemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(listaDeAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(listaDeAlunos);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(listaDeAlunos);
    }

    public static void main(String[] args) {
    GerenciadorDeAlunos alunos = new GerenciadorDeAlunos();

    alunos.adicionarAluno("João", 123456L, 7.5);
    alunos.adicionarAluno("Maria", 123457L, 9.0);
    alunos.adicionarAluno("Carlos", 123458L, 5.0);
    alunos.adicionarAluno("Ana", 123459L, 6.8);

    System.out.println("Alunos no gerenciador:");
    alunos.exibirAlunos();
    alunos.removerAluno(000L);
    alunos.removerAluno(123457L);
    alunos.exibirAlunos();
    System.out.println(alunos.exibirAlunosPorNome());
    System.out.println(alunos.exibirAlunosPorNota());
    }
}
