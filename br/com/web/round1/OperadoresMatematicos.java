package br.com.web.round1;

public class OperadoresMatematicos {
    public static void main(String[] args) {

        // SOMA
        var soma = 10 + 10;

        System.out.println(soma);

        // SUBTRAÇÃO
        var subtracao = 10 - 10;

        System.out.println(subtracao);

        // MULTIPLICAÇÃO
        var multiplicacao = 3 * 3;

        System.out.println(multiplicacao);

        // Divisão
        var divisao = 3 / 2;
        var divisao2 = 3 / 2.0;
        var divisao3 = 3 / 2f;

        System.out.println(divisao + " Irá imprimir o numero do tipo int");
        System.out.println(divisao2 + " Irá imprimir o numero do tipo double");
        System.out.println(divisao3 + " Irá imprimir o numero do tipo flout");

        // MODULO
        var modulo = 3 % 2;

        System.out.println(modulo);
    }

}
