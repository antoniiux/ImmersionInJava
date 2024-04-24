package br.com.web.round2;

import br.com.web.round2.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var joao = new Diarista();
        joao.nome = "João da Silva";
        joao.telefone = "(34) 99777-7098";
        joao.endereco = "Av Portugal, 1522";

        System.out.println("Nome: " + joao.nome);
        System.out.println("Telefone: " + joao.telefone);
        System.out.println("Endereço: " + joao.endereco);
        joao.atender("Antonio");
        System.out.println();

        var maria = new Diarista();
        maria.nome = "Maria da Penha";
        maria.telefone = "(34) 998774580";
        maria.endereco = "Av Portugal, 1523";

        System.out.println("Nome: " + maria.nome);
        System.out.println("Telefone: " + maria.telefone);
        System.out.println("Endereço: " + maria.endereco);
        maria.atender("Hialen");
    }
}
