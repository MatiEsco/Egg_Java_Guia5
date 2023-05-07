/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará 
dónde se encuentra el numero y si se encuentra repetido

 */
package egg.guia5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       Random ran = new Random();
       
       int n;
        System.out.print("Ingrese tamaño del vector: ");
        n = leer.nextInt();
        
        int[] vector = new int[n];
        for(int i = 0 ; i<vector.length; i++){
            vector[i] = ran.nextInt(10);
        }
        
        System.out.print("Escriba un numero para buscar en el vector: ");
        int buscar = leer.nextInt();
        
        int cont = 0;
        int indice =1;
        for(int numero:vector){
            if(numero == buscar){
                cont++;
                System.out.println("Se encontró el numero " + buscar + " en la posicion " + indice);
            }
            indice++;
        }
        
        if(cont == 0 ){
            System.out.println("No se encontró el numero!");
        }else if(cont > 1){
            System.out.println("El numero se encuentra repetido");
        }
        
        Mostrar(vector);
       
    }
    public static void Mostrar(int[] vector){
        for(int elemento:vector){
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
