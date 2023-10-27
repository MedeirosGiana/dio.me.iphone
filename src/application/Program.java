package application;

import entities.IPhone;

public class Program {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        System.out.println("Funcionalidades do Iphone");
        System.out.println(iPhone.isLigado());
        System.out.println(iPhone.ligar());
    }
}
