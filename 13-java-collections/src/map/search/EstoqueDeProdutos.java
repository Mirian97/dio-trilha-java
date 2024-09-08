package map.search;

import java.util.HashMap;
import java.util.Map;

public class EstoqueDeProdutos {
    Map<Long, Produto> estoqueDeProdutos;

    public EstoqueDeProdutos() {
        this.estoqueDeProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueDeProdutos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueDeProdutos);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        for ( Produto produto : estoqueDeProdutos.values()) {
            valorTotal += produto.getQuantidade() * produto.getPreco();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Produto produto : estoqueDeProdutos.values()) {
           if(produto.getPreco() > maiorPreco){
            produtoMaisCaro = produto;
            maiorPreco = produto.getPreco();
           }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Produto produto : estoqueDeProdutos.values()) {
           if(produto.getPreco() < menorPreco){
            produtoMaisBarato = produto;
            menorPreco = produto.getPreco();
           }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorValorTotalNoEstoque = Double.MIN_VALUE;

        for ( Produto produto : estoqueDeProdutos.values()) {
            double valorTotalPorProduto = produto.getQuantidade() * produto.getPreco();
            if(valorTotalPorProduto > maiorValorTotalNoEstoque){
                maiorValorTotalNoEstoque = valorTotalPorProduto;
                produtoMaiorQuantidadeValorTotalNoEstoque = produto;
            }
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueDeProdutos estoque = new EstoqueDeProdutos();
    
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    
        estoque.exibirProdutos();
    
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
      }
}
