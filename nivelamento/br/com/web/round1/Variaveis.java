package br.com.web.round1;

public class Variaveis {
    public static void main(String[] args) {
        String nome = "Antonio";
        int idade = 18;
        float altura = 1.70f;
        double peso = 80.5;
        boolean testandoTudo = true;

        var variavel = "Antonio tem 18 anos e estuda na Uniube";

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(testandoTudo);
        System.out.println(variavel);

        final var CONSTANTE = "testandoTudo";

        System.out.println(CONSTANTE);
    }
}