/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.

 */
package egg.guia5;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        llenar(matriz);
        System.out.println();
        Mostrar(matriz);
        Verificar(matriz);
        
        
    }
    
    public static void llenar(int[][] matriz){
       Scanner leer = new Scanner(System.in);
        int numero;
        for(int i=0; i<3; i++){
            for(int j = 0 ; j<3; j++){
                System.out.print("Valor celda ["+i+j+"]: ");
                do{
                   numero = leer.nextInt();
                   if(numero<1 || numero >9){
                       System.out.println("El numero debe ser entre 1 y 9");
                       System.out.print("Valor celda ["+i+j+"]: ");
                   }

                }while(numero < 1 || numero > 9);
            
                matriz[i][j] = numero;
            }
            
        }
    }//Fin Subproceso
    
    
    public static void Mostrar(int[][] matriz){
        
        for(int i =0; i<3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print("[" +matriz[i][j] + "] ");
            }
            System.out.println();
        }
        
    }//Fin Subproceso
    
    
    public static void Verificar(int[][] matriz){
        int sumafila1, sumafila2, sumafila3, sumacol1, sumacol2, sumacol3,sumaDiag1, sumaDiag2;
        sumafila1  = 0; sumafila2=0; sumafila3=0; sumacol1=0; sumacol2=0; sumacol3=0; sumaDiag1=0; sumaDiag2=0; 
        
        int[] sumas = new int[8];
        for(int i=0; i<3; i++){
            for(int j=0 ; j<3; j++){
                if(i==0){
                   sumafila1 = matriz[i][j];
                   sumas[0] += sumafila1;
                }else if(i ==1){
                    sumafila2 = matriz[i][j];
                    sumas[1] += sumafila2;
                }else{
                    sumafila3 = matriz[i][j];
                    sumas[2] += sumafila3;
                }
                
                if(j==0){
                   sumacol1 = matriz[i][j]; 
                   sumas[3] += sumacol1;
                }else if(j ==1){
                    sumacol2 = matriz[i][j];
                    sumas[4] += sumacol2;
                }else{
                    sumacol3 = matriz[i][j];
                    sumas[5] += sumacol3;
                }
               
                if(i==j){
                    sumaDiag1 = matriz[i][j];
                    sumas[6] += sumaDiag1;
                }
                
                if(i+j ==2 ){
                    sumaDiag2 = matriz[i][j];
                    sumas[7] += sumaDiag2;
                }
            }
        }
        
        boolean verificado = true;
        for(int i=0; i< sumas.length; i++){
            if(sumas[i] != sumas[0]){
                verificado = false;
                break;
            }
        }
        
        if(verificado){
            System.out.println("ES UNA MATRIZ MAGICA!!");
        }else{
            System.out.println("NO ES UNA MATRIZ MAGICA :(");
        }
        
       
        
    }//FinSubproceso
    
}
