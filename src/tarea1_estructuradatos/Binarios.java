/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_estructuradatos;

import java.util.Scanner;

/**
 *
 * @author Kendal Angulo
 */
public class Binarios {
    public static void main(String[] args) {
        System.out.println("Introduzca su número a convertir:");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        if (n == 0) {
            System.out.print("Numero no binario");
            return;
        } else {
            int decimalToBinary=(n / 2);
            System.out.print("Numero binario");
        }
    }
}

   

