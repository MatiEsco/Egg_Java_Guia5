/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.

 */
package egg.guia5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author MatiPC
 */
public class Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n,m;
        System.out.print("Tamaño Filas: ");
        n=leer.nextInt();
        System.out.print("Tamaño Columnas: ");
        m=leer.nextInt();
        int[][] matriz = new int[n][m];
        
        llenarMatriz(matriz,n,m);
        mostrar(matriz,n,m);
        
        
        
    }
    
    public static void llenarMatriz(int[][] matriz, int fila, int columna){
        Random ran = new Random();
        
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                matriz[i][j] = ran.nextInt(10);
            }
        }
    }
    
    
    public static void mostrar(int[][] matriz,int fila, int columna){
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }
    
}
