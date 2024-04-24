package br.com.web.round1;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        // List
        var notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(8.1);
        notas.add(0.5);

        System.out.println(notas.size());
        /* System.out.println(notas.get(0)) */

        // Map
        var medias = new HashMap<String, Double>();
        medias.put("Floki", 10.0);
        medias.put("Tom", 8.1);
        medias.put("Elton", 0.5);

        System.out.println(medias.get("Elton"));
        /* System.out.println(medias); */
    }

}
