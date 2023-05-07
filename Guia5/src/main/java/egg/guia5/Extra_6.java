/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().

 */
package egg.guia5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Random ran = new Random();
        String[] palabras = new String[5]; // Vector para guardar las 5 palabras introducidas
        
        char[][] sopa = new char[20][20]; // Matriz de caracteres para la sopa de letras
        
         
           System.out.println("Ingrese una palabra de minimo 3 caracteres y maximo 5");
            for(int i = 0; i<5; i++){
                System.out.print("Palabra " + (i+1) + ": ");
                palabras[i] = leer.next();
                
                while(palabras[i].length() < 3 || palabras[i].length()>5) {
                    System.out.println("Cantidad de letras incorrecto, vuelva a ingresar");
                    System.out.print("Palabra " + (i+1) + ": ");
                    palabras[i] = leer.next();
                }
            }// Hasta aca guardo las 5 palabras en un vector de String
            int columna=0;
            for(int i=0; i<5;i++){
                int fila = ran.nextInt(20);
                columna = ran.nextInt(15);
                String palabra = palabras[i];
                for(int j=0; j<palabra.length();j++){
                     
                    sopa[fila][columna+j]=palabra.charAt(j);
                    
                }   
            }// con esto cargo cada palabra que tengo en mi vector a la sopa de letras.
            
            
           rellenarMatriz(sopa);
           System.out.println();
           mostrar(sopa);
           
        
    }
    
    public static void rellenarMatriz(char[][] matriz){//Subproceso para rellenar los espacios vacios de la sopa
       Random ran = new Random();
        
        for(int i=0; i<20;i++){
           for(int j=0; j<20; j++){
               if(matriz[i][j] == '\u0000'){
                   matriz[i][j] = (char) (Math.random() * 10 + '0');
               }
               
           }
       }
    }//FinSubproceso
    
    public static void mostrar(char[][] matriz){
         for(int i=0; i<20;i++){
           for(int j=0; j<20; j++){
               System.out.print(matriz[i][j] + " ");
               
           }
             System.out.println();
       }
    }
}
