package map.basic_operations;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
    Map<String, Integer> agenda;

    public AgendaDeContatos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agenda.put(nome, telefone);
    }

    public void removerContatoPorNome(String nome){
        agenda.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(agenda);
    }

    public Integer pesquisarPorNome(String nome){
        Integer telefonePorNome = null;

        telefonePorNome = agenda.get(nome);

        if(telefonePorNome == null){
            System.out.println("O contato do telefone não foi encontrado");
        }
        return telefonePorNome;
    }

    public static void main(String[] args) {
    AgendaDeContatos agenda = new AgendaDeContatos();

    agenda.adicionarContato("Camila", 123456);
    agenda.adicionarContato("João", 5665);
    agenda.adicionarContato("Carlos", 1111111);
    agenda.adicionarContato("Ana", 654987);
    agenda.adicionarContato("Maria", 1111111);
    agenda.adicionarContato("Camila", 44444);

    agenda.exibirContatos();
    agenda.removerContatoPorNome("Maria");
    agenda.exibirContatos();

    String nomePesquisa = "João";
    Integer numeroPesquisa = agenda.pesquisarPorNome("João");
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Paula";
    Integer numeroPesquisaNaoExistente = agenda.pesquisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
  }
}
