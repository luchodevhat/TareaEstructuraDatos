
/*
Kendal Angulo Hernandez
Luis Alfaro Quesada
Fernando Perez 
Josue Villalobos Esquivel 

*/

package tarea1_estructuradatos;

import javax.swing.JOptionPane;


public class Tarea1_EstructuraDatos {

    public static void main(String[] args) {
        Convertir_Codigo test = new Convertir_Codigo();
        
        System.out.println("RESULTADO CON RECURSIVIDAD");
        System.out.println(test.calcExponencialR(5, 3, 0));
        System.out.println("RESULTADO SIN RECURSIVIDAD");
        System.out.println(test.calExponencial(5, 3));
        
        Oraciones_SinVocales r = new Oraciones_SinVocales();
        
        String palabra=JOptionPane.showInputDialog(null, "Digite una frase");
        r.EliminarVocales(palabra, 0);
    
   
    }
    
  
  
}