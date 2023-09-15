package Iphone.test;

import Iphone.iterfaces.AparelhoTelefonico;
import Iphone.iterfaces.NavegadorInternet;
import Iphone.iterfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String nomeDoModelo;
    private String capacidadeDeArmazenamento;
    private String cor;
    private int estadoDaBateria;
    private int volume;
    private String paginaWebAtual;
    private String numeroDiscado;
    private String musicaAtual;

    // Métodos da interface ReprodutorMusical
    public void tocarMusica() {
        System.out.println("Tocando música: " + musicaAtual);
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    public void avancarMusica() {
        System.out.println("Avançando para a próxima música.");
    }

    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior.");
    }

    // Métodos da interface AparelhoTelefonico
    public void fazerLigacao() {
        System.out.println("Fazendo ligação para: " + numeroDiscado);
    }

    public void receberLigacao() {
        System.out.println("Recebendo ligação.");
    }

    public void encerrarLigacao() {
        System.out.println("Ligação encerrada.");
    }

    public void discarNumero() {
        System.out.println("Discando número: " + numeroDiscado);
    }

    // Métodos da interface NavegadorInternet
    public void abrirPaginaWeb() {
        System.out.println("Abrindo página web: " + paginaWebAtual);
    }

    public void voltarPaginaWeb() {
        System.out.println("Voltando para a página web anterior.");
    }

    public void avancarPaginaWeb() {
        System.out.println("Avançando para a próxima página web.");
    }

    public void atualizarPaginaWeb() {
        System.out.println("Atualizando página web: " + paginaWebAtual);
    }

}
