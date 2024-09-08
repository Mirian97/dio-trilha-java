package set.search;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean estaConcluido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.estaConcluido = false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getEstaConcluido() {
        return estaConcluido;
    }

    public void setEstaConcluido(boolean estaConcluido) {
        this.estaConcluido = estaConcluido;
    }

    public String toString() {
        return "{ " + descricao + " - " + estaConcluido + " }";
    }
}
