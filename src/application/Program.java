package application;

import entities.IPhone;

public class Program {
    public static void main(String[] args) {
        System.out.println("**************Funcionalidades iPhone**************");
        IPhone iPhone = new IPhone();
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("**************Funcionalidades Navegador**************");
        String url = "";
        iPhone.exibirPagina(url);
        iPhone.adicionarNovaAba();
        iPhone.adicionarpagina();

        System.out.println("**************Funcionalidades Reprodutor Musical**************");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica(url);
    }
}
