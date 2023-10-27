package entities;

import entities.interfaces.AparelhoTelefonico;
import entities.interfaces.NavegadorInternet;
import entities.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligar");

    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adiciona nova aba");
    }

    @Override
    public void adicionarpagina() {
        System.out.println("Adiciona pagina");
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Seleciona musica");
    }

}
