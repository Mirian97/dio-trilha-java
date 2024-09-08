package set.order;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matricula;
    private double nota;

    public Aluno(String nome, Long matricula, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = media;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
      return "Aluno{" +
          "nome='" + nome + '\'' +
          ", matricula=" + matricula +
          ", nota=" + nota +
          '}';
    }
}

