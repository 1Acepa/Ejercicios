
package javaapplication1;
import java.util.Scanner;// el programa usa la clase Scanner
public class JavaApplication1 {
    /** 
     * @param args the comand line arguments
     */
    public static void main(String[] args) {
        //crea objeto Scanner para obtener la entrada de la ventana de comandos

       Scanner entrada = new Scanner (System.in);

      
        int numero1; // declaracion de variable, primer número a sumar
        int numero2; // declaracion de variable, segundo número a sumar
        int suma; // declaracion de variable, suma de numerol y numero2
        
       System.out.print("Escriba el primer entero:"); //indicador
       numero1= entrada.nextInt(); //lee el primer numero del usuario

       System.out.print ("Escriba el segundo entero: "); // indicador
       numero2= entrada.nextInt(); //lee el segundo numero del usuario
      
       suma= numero1 + numero2; // suma los numeros, despues almacena el total en suma
        
        System.out.println("La suma es"+suma); // muestra la suma
    }
}


    

