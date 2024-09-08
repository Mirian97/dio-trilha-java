package list.basic_operations;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinhoDeCompras = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        if(carrinhoDeCompras.size() == 0){
            System.out.println("Carrinho de compras vazio!");
        }

        List<Item> itensARemover = new ArrayList<>();
        for(Item item: carrinhoDeCompras){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensARemover.add(item);
            }
        }
        carrinhoDeCompras.removeAll(itensARemover);
    }

    public void calcularValorTotal(){
        double total = 0;
        for(Item item: carrinhoDeCompras){
            total = total + (item.getPreco() * item.getQuantidade());
        }
        System.out.printf("Valor total do carrinho: %f", total);
    }

    public void exibirItens(){
        if(carrinhoDeCompras.size() == 0){
            System.out.println("Carrinho de compras vazio!");
        }

        int index = 1;
        for(Item item: carrinhoDeCompras){
            System.out.println(index + " - " + item.getNome() + " - " + item.getQuantidade() + "x - " + item.getPreco());
            index ++;
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Monitor Dell", 2000.99, 1);
        carrinhoDeCompras.removerItem("TV");
        carrinhoDeCompras.exibirItens();
    }
}
