package list.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdernacaoDePessoas {
    List<Pessoa> pessoas;

    public OrdernacaoDePessoas(){
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = pessoas;
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = pessoas;
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public void exibirLista(){
        System.out.println(pessoas);
    }

    public static void main(String[] args) {
        OrdernacaoDePessoas pessoas = new OrdernacaoDePessoas();
        
        pessoas.adicionarPessoa("Hamed Panjeh", 45, 1.75);
        pessoas.adicionarPessoa("Mirian Quispe", 27, 1.53);
        pessoas.adicionarPessoa("Iago Gustavo", 21, 1.80);
        pessoas.adicionarPessoa("Carlos Salgado", 45, 1.75);
        pessoas.adicionarPessoa("Mateus Evair", 24, 1.80);

        pessoas.exibirLista();
        
        System.out.println(pessoas.ordenarPorIdade());
        System.out.println(pessoas.ordernarPorAltura());
    }
}
