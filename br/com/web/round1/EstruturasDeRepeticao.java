package br.com.web.round1;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while e do-while
        var contador = 1001;
        while (contador <= 1000) {
            System.out.println("Número " + contador);
            contador = contador + 1;
            /* contador++ */
        }

        do {
            System.out.println("Número " + contador);
            contador++;
        } while (contador <= 1000);

        // For
        for (var contador2 = 1; contador2 <= 1000; contador2++) {
            System.out.println("Número " + contador2);
        }
    }
}
