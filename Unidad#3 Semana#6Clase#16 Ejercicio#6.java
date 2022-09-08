package javaapplication20;
import java.util.Scanner;
public class JavaApplication20 {
public static void main(String[] args) {
     Scanner keyboard = new Scanner (System.in);
     int password;
     do{
         System.out.print ("Introduzca su contraseña numérica:");
         password= keyboard.nextInt();
         if (password !=1234)
            System.out.println ("La contraseña no es válida");
        }
        while (password!=1234);
    }
    
}
