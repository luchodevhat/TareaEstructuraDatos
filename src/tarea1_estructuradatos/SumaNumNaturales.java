
package tarea1_estructuradatos;

/*
 * @author Fernando
 */
public class SumaNumNaturales {
    public int sumasR(int N){
        if (N == 1) {
            return 1;
        }else{
            return N + sumasR(N-1);
        }
    }
}
