package tarea1_estructuradatos;

import java.util.Scanner;

// a. Elimine las vocales de una oración e imprima la oración resultante.

public class Oraciones_SinVocales {

    public void Imprime_SinVocales() {

        System.out.println("Digite una frase ");
        Scanner consola = new Scanner(System.in);
        String frase = consola.nextLine();
        System.out.println("La frase sin modificar es: " + frase);
        String fraseCons = frase.replaceAll("[a,á,e,é,i,í,o,ó,u,ú, A, E, I, O, U,"
                + "Á, É, Í, Ó, Ú]", "");
        System.out.println("La frase sin vocales es: " + fraseCons);
       
        for (int i = fraseCons.length() - 1; i >= 0; i--) {
             fraseCons.charAt(i);
        }
        

    }
}

