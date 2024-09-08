package list.search;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
    private List<Livro> catalogoDeLivros;

    public CatalogoDeLivros() {
        this.catalogoDeLivros = new ArrayList<>();
    }

    public void estaVazioCatalogoDeLivros(){
        if(catalogoDeLivros.isEmpty()){
           throw new RuntimeException ("A lista está vazia");
        }
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        catalogoDeLivros.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        estaVazioCatalogoDeLivros();

        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro livro : catalogoDeLivros) {
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        estaVazioCatalogoDeLivros();
        List<Livro> livrosPorIntervalo = new ArrayList<>();

        for (Livro livro : catalogoDeLivros) {
            if(livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal){
                livrosPorIntervalo.add(livro);
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTituloEncontrado = null;

        for (Livro livro : catalogoDeLivros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTituloEncontrado = livro;
                break;
            }
        }
        return livroPorTituloEncontrado;
    }

    public static void main(String[] args) {
        CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();

        catalogoDeLivros.adicionarLivro("Harry Potter", "Autor 1", 2020);
        catalogoDeLivros.adicionarLivro("O hobbit", "Autor 2", 2021);
        catalogoDeLivros.adicionarLivro("Eragon", "Autor 2", 2022);
        catalogoDeLivros.adicionarLivro("A menina que roubava livros", "Autor 4", 2023);
        catalogoDeLivros.adicionarLivro("Poliana", "Autor 5", 2024);

        System.out.println(catalogoDeLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoDeLivros.pesquisarPorAutor("Autor 2"));

        System.out.println(catalogoDeLivros.pesquisarPorIntervaloAnos(2022, 2024));

        System.out.println(catalogoDeLivros.pesquisarPorTitulo("Eragon"));
    }
}
