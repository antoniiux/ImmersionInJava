package br.com.web.round2;

import br.com.web.round2.classes.Diarista;

public class App {
    public static void main(String[] args) {

        var joao = new Diarista("João da Silva", "(34) 99777-7098", "Av Portugal, 1522");

        System.out.println("Nome: " + joao.nome);
        System.out.println("Telefone: " + joao.telefone);
        System.out.println("Endereço: " + joao.endereco);
        joao.atender("Antonio");
        System.out.println();

        var maria = new Diarista("Maria da Penha", "(34) 998774580", "Av Portugal, 1523");

        System.out.println("Nome: " + maria.nome);
        System.out.println("Telefone: " + maria.telefone);
        System.out.println("Endereço: " + maria.endereco);
        maria.atender("Hialen");

        var gustavo = new Diarista("Gustavo Henrique da Silva");
        System.out.println("Nome: " + gustavo.nome);
        System.out.println("Telefone: " + gustavo.telefone);
        System.out.println("Endereço: " + gustavo.endereco);

    }
}
