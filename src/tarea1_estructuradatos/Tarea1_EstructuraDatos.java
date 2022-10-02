
/*
Kendal Angulo Hernandez
Luis Alfaro Quesada
Fernando Perez 
Josue Villalobos Esquivel 
*/

package tarea1_estructuradatos;

import java.util.Scanner;


public class Tarea1_EstructuraDatos {

    public static void main(String[] args) {
        Convertir_Codigo test = new Convertir_Codigo();
        Binarios binarios1 = new Binarios();
        
        // EJERCICIO A)
        System.out.println("");
        System.out.println("EJERCICIO A");
        System.out.println("");
        Oraciones_SinVocales sinVocales = new Oraciones_SinVocales(); 
        sinVocales.Imprime_SinVocales();
        
        // EJERCICIO B)
        /*
        System.out.println("");
        System.out.println("EJERCICIO B");
        System.out.println("");
        SumaNumNaturales suma = new SumaNumNaturales();
        int total = suma.sumasR(3);
        System.out.println("El total de la suma es: "+ total);
        */
        // EJERCICIO C)
        System.out.println("");
        System.out.println("EJERCICIO C");
        System.out.println("");
        System.out.println("Introduzca su número a convertir:");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        if (binarios1.decBin(n) == false) {
            System.out.println("No es binario");
        }else {
            System.out.println("Es binario");
        }
        
        // EJERCICIO D)
        System.out.println("");
        System.out.println("EJERCICIO D");
        System.out.println("");
        System.out.println("RESULTADO CON RECURSIVIDAD");
        System.out.println(test.calcExponencialR(5, 3, 0));
        System.out.println("RESULTADO SIN RECURSIVIDAD");
        System.out.println(test.calExponencial(5, 3));
    }
}
