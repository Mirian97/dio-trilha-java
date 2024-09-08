package map.search;

import java.util.HashMap;
import java.util.Map;

public class ContagemDePalavras {
    Map<String, Integer> contagemDePalavras;

    public ContagemDePalavras() {
        this.contagemDePalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemDePalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemDePalavras.remove(palavra);
    }

    public int exibirContagemPalavras(){
        return contagemDePalavras.size();
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int contagemDaPalavraMaisFrequente = 0;

        for (Map.Entry<String, Integer> palavra : contagemDePalavras.entrySet()) {
            if(palavra.getValue() > contagemDaPalavraMaisFrequente){
                contagemDaPalavraMaisFrequente = palavra.getValue();
                palavraMaisFrequente = palavra.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemDePalavras contagemLinguagens = new ContagemDePalavras();
    
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
    
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras na lista");
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
      }
}
