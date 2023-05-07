/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class SOPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random random = new Random();
       String[] palabras = new String[5];
       int filas=20, columnas=20;
       String[][] matriz=new String [filas][columnas];
       
       System.out.println("Ingrese 5 palabras de al menos 3 y hasta 5 caracteres:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = sc.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Inténtelo de nuevo: ");
                palabras[i] = sc.nextLine();
            } 
        }
       //--------Elijo una fila al azar y ubico la palabra----------
       int filaRandom;
       int RandomC;
       int cont;
        for (int i = 0; i < palabras.length; i++) {
            filaRandom=0;
            RandomC=0;
            cont=0;
            RandomC=random.nextInt(15);
            filaRandom=random.nextInt(filas);
            for (int j = 0; j < palabras[i].length(); j++) {
                    matriz[filaRandom][RandomC+cont] = palabras[i].substring(j, j+1);
                    cont++;
            }
        }
       //-------------Relleno matriz-----------  
       for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == null){
                matriz[i][j]=String.valueOf((int)(Math.random ()*9+1));  
                }
            }
        }
      //---------------Imprimo matriz-------------
       for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
