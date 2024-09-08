package list.search;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {
    private List<Integer> listaDeNumeros;

    public void listaEstaVazia(){
        if(listaDeNumeros.isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
    }

    public SomaDeNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
    }

    public int calcularSoma(){
        int resultado = 0;
        for (Integer numero : listaDeNumeros) {
            resultado += numero;
        }
        return resultado;
    }

    public int encontrarMaiorNumero(){
        listaEstaVazia();

        int maiorNumero = Integer.MIN_VALUE;
        for (Integer numero : listaDeNumeros) {
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        listaEstaVazia();

        int menorNumero = Integer.MAX_VALUE;
        for (Integer numero : listaDeNumeros) {
            if(numero < menorNumero){
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        listaEstaVazia();
        System.out.println(listaDeNumeros);
    }

    public static void main(String[] args) {
        SomaDeNumeros lista = new SomaDeNumeros();

        lista.adicionarNumero(10);
        lista.adicionarNumero(15);
        lista.adicionarNumero(5);
        lista.adicionarNumero(7);
        
        lista.exibirNumeros();
        System.out.println(lista.encontrarMaiorNumero());
        System.out.println(lista.encontrarMenorNumero());
        System.out.println(lista.calcularSoma());
    }
}
