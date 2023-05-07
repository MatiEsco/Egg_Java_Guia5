/*
Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él

 */
package egg.guia5;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Hasta que numero desea calcular la Sucesion de Fibonacci: ");
        int n =leer.nextInt();
        int[] vector = new int[n];
        
        llenar(vector,n);
        mostrar(vector,n);
        
    }
    
    public static void llenar(int [] vector,int n){
        vector[0] = 0;
        vector[1]= 1;
        for(int i=2; i<n; i++){
            vector[i] = fibo(i);
        }
    }
    
    public static int fibo(int n){
         int t1=1,t2=1;
         int retorno=0;
         if(n==1 || n==2){
            retorno = 1;
         }else{
             for(int i=3; i<=n; i++){
                 retorno = t1 + t2;
                 t1 = t2;
                 t2=retorno;
             }
         }
         
         
         return retorno;
    }
    
    
   public static void mostrar(int[] vector,int n){
       for(int i=0; i<n; i++){
           System.out.print("[" + vector[i] + "] ");
       }
       System.out.println();
   }
}
