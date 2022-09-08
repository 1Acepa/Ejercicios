package javaapplication15;
import java.util.Scanner;
public class JavaApplication15 {
public static void main(String[] args) {
        // se crear el onjeto a la clase Scanner
        Scanner ingresar = new Scanner (System.in);
        //DECLARAR VARIABLES
        double nota;
        
        System.out.println ("favor ingresar un valor desde 1 hasta 10");
        nota= ingresar.nextDouble();
        
        while (nota<1 | nota>10)
        {
        System.out.println("lo siento mucho pero el valor proporcionado no es correcto");
        nota= ingresar.nextDouble();
        }
        
    }
    
}
