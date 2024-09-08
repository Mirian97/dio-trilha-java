package map.order;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class AgendaDeEventos {
    Map<LocalDate, Evento> agenda;

    public AgendaDeEventos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agenda.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        System.out.println(agenda);
    }

    public void obterProximoEvento(){
        Evento eventoMaisProximo = null;
        LocalDate proximaData = null;

        for (Map.Entry<LocalDate, Evento> evento : agenda.entrySet()) {
            LocalDate hoje = LocalDate.now();
            LocalDate dataDoEvento = evento.getKey();
            Evento eventoAtual = evento.getValue();

            if(dataDoEvento.isEqual(hoje) || dataDoEvento.isAfter(hoje)){
                eventoMaisProximo = eventoAtual;
                proximaData = dataDoEvento;
            }
        }

        if (eventoMaisProximo != null) {
            System.out.println("O próximo evento: " + eventoMaisProximo.getNome() + " acontecerá na data " + proximaData);
          } else {
            System.out.println("Não há eventos futuros na agenda.");
          }
    }

    public static void main(String[] args) {
    AgendaDeEventos agendaEventos = new AgendaDeEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

    agendaEventos.exibirAgenda();
    agendaEventos.obterProximoEvento();
  }
}
