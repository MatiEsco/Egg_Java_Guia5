/*
Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10% ----> practico1
Segundo trabajo práctico evaluativo 15%-----> practico2
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package egg.guia5;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double[] notas = new double[10];
       double[] notaxAlumno=new double[4];
       
       
       for(int i=0; i<10; i++){
           
           System.out.println("Alumno N°"+(i+1));
           System.out.print("Nota Practico1: "); notaxAlumno[0] = validarNota(leer.nextDouble());
           System.out.print("Nota Practico2: "); notaxAlumno[1] = validarNota(leer.nextDouble());
           System.out.print("Nota Integrador1: "); notaxAlumno[2] = validarNota(leer.nextDouble());
           System.out.print("Nota Integrador2: "); notaxAlumno[3]= validarNota(leer.nextDouble());
           System.out.println("Vector con notas del Alumno N°"+(i+1));
           mostrarVector(notaxAlumno,4);
           notas[i] = promedio(notaxAlumno);
           
          // reset(notaxAlumno);
       }
       
        System.out.println();
        System.out.println("------Vector final con el promedio de cada Alumno------");
        mostrarVector(notas,10);
        Aprobados(notas);
       
    }
    
    public static double promedio(double[] notaxAlumno){
        double prom=0;
        
            notaxAlumno[0] = (notaxAlumno[0] * 0.1);
            notaxAlumno[1] = (notaxAlumno[1] * 0.15);
            notaxAlumno[2] = (notaxAlumno[2] * 0.25);
            notaxAlumno[3] = (notaxAlumno[3] * 0.5);
           // System.out.println("Vector dentro de la funcion promedio");
            //mostrarVector(notaxAlumno,4);
            
            
            for(int i=0; i<4; i++){
                prom += notaxAlumno[i];
            }
             
            //System.out.println("Promedio: " + prom);
            
        
        return prom;
    }
    
    public static void Aprobados(double[] notas){
        int aproTotal=0, noAproTotal=0;
        for(int i=0; i<10; i++){
            if(notas[i] >= 7.0){
                aproTotal++;
            }else{
                noAproTotal++;
            }
        }
        
        System.out.println("Cantidad de Aprobados con nota mayor o igual a 7: " + aproTotal+ " Alumnos");
        System.out.println("Cantidad de Alumnos Desaprobados: "+ noAproTotal+ " Alumnos");
    }
    
    public static void mostrarVector(double[] vector, int n){
        for(int i=0; i<n; i++){
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println();
        System.out.println();
    }
    
    /*public static void reset(double[] vec){
        for(int i=0; i<4; i++){
            vec[i] = 0;
        }
    }*/ //Al final no lo uso xq en cada iteracion del bucle for estoy reemplazando directamente cada celda del vector
        //con un nuevo valor.
    
    
    public static double validarNota(double nota){
        Scanner leer = new Scanner(System.in);
        do{
            if(nota<=0 || nota>10){
                System.out.print("Ingrese una nota Valida: ");
                
            }else{
                break;
            }
            
            nota = leer.nextDouble();
            
        }while(nota<=0 || nota>10);
        return nota;
        
    }
}
