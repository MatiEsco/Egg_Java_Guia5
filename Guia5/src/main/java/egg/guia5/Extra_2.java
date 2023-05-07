/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package egg.guia5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        llenar(vector1,n);
        llenar(vector2,n);
        
        mostrar(vector1,n);
        System.out.println();
        mostrar(vector2,n);
        
        boolean resultado = iguales(vector1, vector2,n);
        
        if(resultado){
            System.out.println("Los vectores son iguales!");
        }else {
            System.out.println("No son iguales.");
        }
        
        
    }
    
    public static void llenar(int[] vector, int n){
        Random randon = new Random();
        for(int i=0; i<n; i++){
            vector[i] = randon.nextInt(10);
        }
    }//FinSubproceso
    
    public static void mostrar(int[] vector,int n){
        for(int i=0; i<n; i++){
            System.out.print("["+vector[i]+"]");
        }
        System.out.println();
    }//FinSubproceso
    
    public static boolean iguales(int[] vec1, int[] vec2,int n){
        boolean Iguales = true;
        for(int i=0; i<n; i++){
            if(vec1[i] != vec2[i]){
                Iguales = false;
                break;
            }
        }
        
        
        return Iguales;
    }//FinSubproceso
    
}
