package tarea1_estructuradatos;

import java.util.Scanner;

/**
 *
 * @author Kendal Angulo
 */
public class Binarios {

    public boolean decBin(int num) {
        if (num == 0 || num == 1
                || num < 0) {
            return false;
        }
        while (num != 0) {

            if (num % 10 > 1) {
                return decBin(num/10);
            }
            num = num / 10;
        }
        return true;
    }
}
