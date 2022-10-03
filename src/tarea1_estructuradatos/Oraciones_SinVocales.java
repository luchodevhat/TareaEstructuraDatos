package tarea1_estructuradatos;

import java.util.Scanner;

// a. Elimine las vocales de una oración e imprima la oración resultante.
public class Oraciones_SinVocales {

    String vocales[] = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};


    public void EliminarVocales(String palabra, int posicion) {

        palabra = palabra.replace(vocales[posicion], "");
        palabra = palabra.replace((vocales[posicion]).toUpperCase(), "");
        posicion ++;

        if (posicion < 5) {
           EliminarVocales(palabra, posicion);

        } else {
        }
        System.out.println(palabra);
    }
}
