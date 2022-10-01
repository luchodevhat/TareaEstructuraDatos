package tarea1_estructuradatos;

import java.util.Scanner;

/**
 *
 * @author Kendal Angulo
 */
public class Binarios {

    public boolean binario(int num) {
        if (num == 0 || num == 1
                || num < 0) {
            return false;
        }
        while (num != 0) {

            if (num % 10 > 1) {
              return false;
            }
            num = num / 10;
        }
        return true;
    }
    
    public boolean binarioR(int num) {
        if (num == 0 || num == 1
                || num < 0) {
            return false;
        }if (num != 0 && num % 10 != 1) {
            return true;
        }else {
            num = num / 10;
            return binarioR(num);
        }
    }
}
