/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package egg.guia5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        int n = leer.nextInt();
        Random ran = new Random();
        
        int[] vector = new int[n];
        
        for(int i=0; i< vector.length;i++){
            vector[i] = ran.nextInt(1,99999);
        }
        
        int unDig = 0, dosDig=0, tresDig = 0, cuatroDig=0, cincoDig = 0;
        for(int numero:vector  ){
            String numeroCadena = Integer.toString(numero);
            int longitud = numeroCadena.length();
            
            
            switch (longitud){
                case 1: unDig++;
                break;
                case 2: dosDig++;
                break;
                case 3: tresDig++;
                break;
                case 4: cuatroDig++;
                break;
                case 5: cincoDig++;
                break;
            }
        }
        System.out.println("Se encotró " + unDig + " numeros de un Digito.");
        System.out.println("Se encotró " + dosDig + " numeros de dos Digitos.");
        System.out.println("Se encotró " + tresDig + " numeros de tres Digitos.");
        System.out.println("Se encotró " + cuatroDig + " numeros de cuatro Digito.");
        System.out.println("Se encotró " + cincoDig + " numeros de cinco Digito.");
        System.out.println();
        Mostrar(vector);
       
    }
    
     public static void Mostrar(int[] vector){
        for(int elemento:vector){
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    
}
