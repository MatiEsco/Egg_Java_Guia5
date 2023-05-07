/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando 
sus filas por columnas (o viceversa).

 */
package egg.guia5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int [4][4];
        int[][] tras = new int[4][4];
        
        matriz = llenar(matriz);
        System.out.println("La matriz original es: ");
        Mostrar(matriz);
        
        tras = Traspuesta(matriz,tras);
        System.out.println("La matriz Traspuesta es: ");
        Mostrar(tras);
        
        
    }
    public static int[][] llenar(int[][] matriz){
        Random ran = new Random();
        for(int i =0; i<4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
            matriz[i][j] = ran.nextInt(10);
            }
        }
        return matriz;
    }
    
    public static void Mostrar(int[][] matriz){
        
        for(int i =0; i<4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print("[" +matriz[i][j] + "]");
            }
            System.out.println();
        }
        
    }
    
    public static int[][] Traspuesta(int[][] matriz, int[][] tras){
        
        for(int i =0; i<4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                tras[j][i] = matriz[i][j];
            }
          
        }
        
        
        return tras;
    }
    
}
