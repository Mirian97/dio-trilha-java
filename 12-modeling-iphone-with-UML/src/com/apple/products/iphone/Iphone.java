package com.apple.products.iphone;

import com.apple.features.AparelhoTelefonico;
import com.apple.features.NavegadorNaInternet;
import com.apple.features.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {
    public void atender() {
        System.out.println("Atendendendo o telefone...");        
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }

    public void tocar() {
        System.out.println("Tocando a música");
    }

    public void pausar() {
        System.out.println("Pausando a música");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página da seguinte url " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando nova página");
    }
}
