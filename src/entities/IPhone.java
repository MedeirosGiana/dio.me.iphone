package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private Boolean ligado;
    private Boolean emChamada;
    private Boolean reproduzindoMusica;
    private String paginaAtual;
    public IPhone(){
        this.ligado = false;
        this.emChamada = false;
        this.reproduzindoMusica = false;
        this.paginaAtual = "";
    }

    @Override
    public boolean ligar() {
        ligado = true;
        return false;
    }

    @Override
    public void atender() {
        if (ligado){
            emChamada = true;
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (emChamada == true || ligado == false){
            System.out.println("Deixe seu recado!");
        }
    }

    @Override
    public void exibirPagina(String url) {
        if (ligado){
            paginaAtual = url;
        }
    }

    @Override
    public void adicionarNovaAba() {
        String url = "";
        System.out.println("Adicionar nova aba:");
        paginaAtual = url;
    }

    @Override
    public void adicionarpagina() {
        adicionarNovaAba();
    }

    @Override
    public void tocar() {
        if (ligado){
            reproduzindoMusica = true;
        }
    }

    @Override
    public void pausar() {
        reproduzindoMusica = false;
    }

    @Override
    public void selecionarMusica(String musica) {
        String musicaEscolhida = "";
        while (reproduzindoMusica){
            System.out.println("Informe a musica desejada");
            musica = musicaEscolhida;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isEmChamada() {
        return emChamada;
    }

    public boolean isReproduzindoMusica() {
        return reproduzindoMusica;
    }

    public String getPaginaAtual() {
        return paginaAtual;
    }
}
