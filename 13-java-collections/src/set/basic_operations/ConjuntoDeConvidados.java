package set.basic_operations;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidados {
    Set<Convidado> convidados;

    public ConjuntoDeConvidados() {
        this.convidados = new HashSet();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for (Convidado convidado : convidados) {
            if(convidado.getCodigoDoConvite() == codigoConvite){
                convidados.remove(convidado);
            }
        }
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoDeConvidados convidados = new ConjuntoDeConvidados();

        convidados.exibirConvidados();
        System.out.println(convidados.contarConvidados());

        convidados.adicionarConvidado("Pessoa 1", 1234);
        convidados.adicionarConvidado("Pessoa 2", 1235);
        convidados.adicionarConvidado("Pessoa 3", 1235);
        convidados.adicionarConvidado("Pessoa 4", 1236);

        convidados.exibirConvidados();
        System.out.println(convidados.contarConvidados());
    }
}
