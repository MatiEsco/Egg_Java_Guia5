/*
Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).

 */
package egg.guia5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero de filas y columnas para la matriz: ");
        System.out.print("Filas: ");
        int fila = leer.nextInt();
        System.out.println();
        System.out.print("Columnas: ");
        int col = leer.nextInt();
        
      // int[][] A = {{0,-2,4},{2,0,2},{-4,-2,0}};
      
      int[][] A = new int[fila][col];
      A = llenar(A,fila,col);
       
       int [][] tras = new int[fila][col];
       tras = Traspuesta(A,tras,fila,col);
       
        System.out.println("Matriz Original: ");
        Mostrar(A, fila, col);
        System.out.println();
        
        System.out.println("Matriz Traspuesta: ");
        Mostrar(tras,fila,col);
        System.out.println();
        
        String res;
        boolean resultado = Antisimetrica(A, tras,fila,col);
        if(resultado){
            res = "Verdadero";
        }else{
            res = "Falso";
        }
        
        System.out.println("Es la matriz una matriz Antisimetrica?: "+ res);
        
        
        
       
    }
    
    public static int[][] llenar(int[][] matriz, int fila,int col){
        Random ran = new Random();
        for(int i =0; i<fila ; i++){
            for(int j = 0 ; j < col ; j++){
            matriz[i][j] = ran.nextInt(-10,10);
            }
        }
        return matriz;
    }
    
    
    public static int[][] Traspuesta(int[][] matriz, int[][] tras, int fila, int col){
        
        for(int i =0; i<fila ; i++){
            for(int j = 0 ; j < col ; j++){
                tras[j][i] = matriz[i][j];
            }
          
        }
        return tras;
    }
    
    public static void Mostrar(int[][] matriz, int fila, int col){
        
        for(int i =0; i<fila ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print("[" +matriz[i][j] + "] ");
            }
            System.out.println();
        }
        
    }
    
    
    public static boolean Antisimetrica(int[][] matriz, int [][] matrizTraspuesta, int fila, int col){
        boolean antiSime = false;
        
            for(int i=0; i<fila; i++){
                for(int j=0; j< col ; j++){
                    if(matriz[i][j] == -(matrizTraspuesta[i][j]) ){
                        antiSime = true;
                    }else{
                        antiSime = false;
                    }
                }
            }
        
        return antiSime;
    }
    
}


