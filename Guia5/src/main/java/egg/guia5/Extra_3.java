/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.

 */
package egg.guia5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector1 = new int[5];
        
        llenar(vector1);
        mostrar(vector1);
    }
    
    public static void llenar(int[] vector){
        Random randon = new Random();
        for(int i=0; i<5; i++){
            vector[i] = randon.nextInt(10);
        }
    }//FinSubproceso
    
     public static void mostrar(int[] vector){
        for(int i=0; i<5; i++){
            System.out.print("["+vector[i]+"]");
        }
        System.out.println();
    }//FinSubproceso
    
}
