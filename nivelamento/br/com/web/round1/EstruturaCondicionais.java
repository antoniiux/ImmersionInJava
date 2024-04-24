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

        var mesDoAno = 1;
        switch (mesDoAno) {

            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            default:
                System.out.println("Mês Invalido");
                break;

            /*
             * De outra forma, seria: switch melhorado de forma mais simples
             * 
             * case 1 -> System.out.println("Janeiro");
             * case 2 -> System.out.println("Fevereiro");
             * case 3 -> System.out.println("Março");
             * 
             * default -> System.out.println("Mês Invalido");
             */
        }

    }
}