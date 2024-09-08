package set.search;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        agenda.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(agenda);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPesquisados  = new HashSet<>();
        for (Contato contato : agenda) {
            if(contato.getNome().startsWith(nome)){
                contatosPesquisados.add(contato);
            }
        }
        return contatosPesquisados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for (Contato contato : agenda) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Mirian", 127323);
        agenda.adicionarContato("Mirian Montevilla", 23424242);
        agenda.adicionarContato("Mirian Quispe", 12734223);
        agenda.adicionarContato("Camila", 1272323);

        agenda.exibirContatos();
        System.out.println(agenda.atualizarNumeroContato("Mirian", 666777));
        System.out.println(agenda.pesquisarPorNome("Mirian "));
        agenda.exibirContatos();
    }
}
