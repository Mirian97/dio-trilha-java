package set.basic_operations;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavrasUnicas {
    Set<String> palavrasUnicas;

    public ConjuntoDePalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    private void conjuntoVazio(){
        if(palavrasUnicas.isEmpty()){
            System.out.println("O conjunto de palavras está vazio");
        }
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        conjuntoVazio();
        if(palavrasUnicas.contains(palavra)){
            palavrasUnicas.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada no conjunto");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        conjuntoVazio();
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoDePalavrasUnicas conjunto = new ConjuntoDePalavrasUnicas();

        conjunto.adicionarPalavra("Miyagui");
        conjunto.adicionarPalavra("Jade");
        conjunto.adicionarPalavra("Tommy");
        conjunto.adicionarPalavra("Susi");
        conjunto.exibirPalavrasUnicas();
        conjunto.removerPalavra("Mirian");
        conjunto.removerPalavra("Tommy");
        conjunto.exibirPalavrasUnicas();
    }
}
