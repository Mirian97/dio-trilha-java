package set.search;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {
    private Set<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void listaEstaVazia(){
        if(tarefas.isEmpty()){
           throw new RuntimeException("A lista está vazia");
        }
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        listaEstaVazia();

        Set<Tarefa> tarefasARemover = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasARemover.add(tarefa);
            }
        }
        tarefas.removeAll(tarefasARemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefas);
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        listaEstaVazia();

        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getEstaConcluido()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        listaEstaVazia();

        Tarefa tarefaConcluida = null;
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setEstaConcluido(true);
                tarefaConcluida = tarefa;
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao){
        listaEstaVazia();

        Tarefa tarefaPendente = null;
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setEstaConcluido(false);
                tarefaPendente = tarefa;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas(){
        listaEstaVazia();

        Set<Tarefa> todasAsTarefas = tarefas;
        this.tarefas.removeAll(todasAsTarefas);
    }

    public static void main(String[] args) {
        ListaDeTarefas tarefas = new ListaDeTarefas();

        tarefas.adicionarTarefa("Cortar a grama");
        tarefas.adicionarTarefa("Banhar os gatos");
        tarefas.adicionarTarefa("Limpar o fogão");
        tarefas.adicionarTarefa("Lavar os pratos");
        tarefas.adicionarTarefa("Estudar 2 horas");
        
        tarefas.exibirTarefas();
        tarefas.marcarTarefaConcluida("Banhar os gatos");
        tarefas.marcarTarefaConcluida("Lavar os pratos");
        tarefas.marcarTarefaPendente("Cortar a grama");
        tarefas.exibirTarefas();

        System.out.println(tarefas.obterTarefasConcluidas());
        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();
    }
}
