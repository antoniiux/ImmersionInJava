package br.com.web.round1;

public class EstruturaCondicionais {
    public static void main(String[] args) {

        var idade = 16;

        /*
         * if (idade >= 20) {
         * System.out.println("Você é maior de idade");
         * } else {
         * System.out.println("Você é menor de idade");
         * }
         */

        if (idade >= 20) {
            System.out.println("Você é maior de idade");
        } else if (idade >= 16) {
            System.out.println("Você já pode votar, lembrando que é menor de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}