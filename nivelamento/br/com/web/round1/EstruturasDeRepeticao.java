package br.com.web.round1;

import java.util.ArrayList;

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

        // for
        /*
         * for (var contador2 = 1; contador2 <= 1000; contador2++) {
         * System.out.println("Número " + contador2);
         */

        var notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(8.1);
        notas.add(0.5);
        notas.add(0.2);

        for (var index = 0; index < notas.size(); index++) {
            System.out.println(notas.get(index));
        }

        // foreach
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
