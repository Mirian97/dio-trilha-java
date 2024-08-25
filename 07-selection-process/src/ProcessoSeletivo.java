import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
        ArrayList<String> candidatosSelecionados = selecaoDeCandidatos();

        for(String candidato: candidatosSelecionados){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){     
        boolean atendeu = false;
        int tentativasRealizadas = 0;

        do{
            atendeu = atender();
            tentativasRealizadas++;
        }while(tentativasRealizadas <3 && !atendeu);

        if(atendeu) {
            System.out.println("O candidato " + candidato + " atendeu na tentaiva nº " + tentativasRealizadas);
        } else {  
            System.err.println("O candidato " + candidato +  " não atendeu as " + tentativasRealizadas + " tentativas de ligação");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirCandidatosSelecionados(){
        ArrayList<String> candidatosSelecionados = selecaoDeCandidatos();
        for(String candidato: candidatosSelecionados){
            System.out.println("O candidato " + candidato + " foi selecionado");
        }
    }

    static ArrayList<String> selecaoDeCandidatos () {
        double SALARIO_BASE = 2000.0;
        String [] candidatos = {"MIRIAN", "EVAIR", "IAGO", "HAMED", "THIAGO", "ALESSANDRA", "LEONARDO", "MURILO", "GABRIEL", "IGOR"};
        
        ArrayList<String> candidatosSelecionados = new ArrayList<String>();
        int candidatoAtual = 0;

        while(candidatosSelecionados.size() < 5 && candidatoAtual < candidatos.length){
            double valorPretendidoCandidatoAtual = valorPretendido();
            String candidato = candidatos[candidatoAtual];

            System.out.println("O candidato " + candidato + " tem o Valor Pretendido de R$ " + valorPretendidoCandidatoAtual);

            if(SALARIO_BASE > valorPretendidoCandidatoAtual){
                candidatosSelecionados.add(candidato);
                System.out.println("Candidato " + candidato + " foi selecionado para entrevista");
            }
            candidatoAtual++;
        }
        System.out.println(" ");
        return candidatosSelecionados;
    } 

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double valorPretendido){
        double SALARIO_BASE = 2000.0;

        if(SALARIO_BASE > valorPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(SALARIO_BASE == valorPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM UMA CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
