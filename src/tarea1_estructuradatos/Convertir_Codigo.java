package tarea1_estructuradatos;

/**
 *
 * @author Aleja
 */
public class Convertir_Codigo {

    // FUNCIONES RECURSIVAS
    public double calcExponencialR(int n, int x, int i) {  
        
        double result = 0;
        if (i >= n) {
            return 0;
        } else {
            result = result + Math.pow(x, i) / factorialR(i);
            return result + calcExponencialR(n, x, i+1);
        }
    }

    public double factorialR(int num) {   

        if (num == 0) {
            return 1;
        } else {
            return num * factorialR(num - 1);
        }
    }

    //FUNCIONES CON CICLOS FOR
    public double calExponencial(int n, int x) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result = result + Math.pow(x, i) / factorial(i);
        }
        return result;
    }
    
    public double factorial(int num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}
