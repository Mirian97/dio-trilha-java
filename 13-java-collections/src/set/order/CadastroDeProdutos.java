package set.order;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProdutos {
    private Set<Produto> produtosSet;

    public CadastroDeProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void exibirProdutos(){
        System.out.println(produtosSet);
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto>exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto>exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroDeProdutos produtos = new CadastroDeProdutos();
        produtos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        produtos.adicionarProduto(2L, "Notebook", 1500d, 5);
        produtos.adicionarProduto(1L, "Mouse", 30d, 20);
        produtos.adicionarProduto(4L, "Teclado", 50d, 15);
    
        produtos.exibirProdutos();
        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
