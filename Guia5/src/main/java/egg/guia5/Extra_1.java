/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.

 */
package egg.guia5;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        int suma = 0;
        for(int i=0; i<n; i++){
            System.out.print("Valor celda [" + i + "]: ");
            vector[i] = leer.nextInt();
            suma+= vector[i];
            
            
        }
        mostrar(vector,n);
        System.out.println("La suma de los elementos del vector es: " + suma);
        
    }
    
    public static void mostrar(int[] vector, int longitud){
        for(int i=0; i<longitud; i++){
            System.out.print("[" +vector[i]+"] ");
        }
        System.out.println();
    }
    
}
