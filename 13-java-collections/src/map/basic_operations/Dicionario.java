package map.basic_operations;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> palavras;

    public Dicionario() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavras.put(palavra, definicao);
    }

    public void removePalavra(String palavra){
        palavras.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(palavras);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPorPalavra = null;

        definicaoPorPalavra = palavras.get(palavra);
        if(definicaoPorPalavra == null){
            return "Não há definição para a palavra pesquisada";
        } 
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    
        dicionario.exibirPalavras();
    
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);
    
        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);
    
        dicionario.removePalavra("typescript");
        dicionario.exibirPalavras();
    }
}
