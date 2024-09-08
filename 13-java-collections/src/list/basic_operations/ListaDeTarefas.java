package list.basic_operations;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefa> listaDeTarefas;
    
    public ListaDeTarefas(){
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasARemover = new ArrayList<>();

        for(Tarefa tarefa: listaDeTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasARemover.add(tarefa);
            }
        }

        listaDeTarefas.removeAll(tarefasARemover);
    }

    public void obterDescricoesDasTarefas(){
        if(listaDeTarefas.size() == 0) {
            System.out.println("Lista de tarefas vazia");
        }

        int index = 1;
        for (Tarefa tarefa: listaDeTarefas){
            System.out.println(index + " - " +tarefa.getDescricao());
            index++;
        }
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        listaDeTarefas.adicionarTarefa("Cozinhar");
        listaDeTarefas.adicionarTarefa("Construir um boneco de neve");
        listaDeTarefas.adicionarTarefa("Ir ao hopi hari");
        listaDeTarefas.obterDescricoesDasTarefas();
        listaDeTarefas.removerTarefa("cozinhar");
        listaDeTarefas.obterDescricoesDasTarefas();
    }
}
