package unidad.pkg2.semana.pkg3.clase.pkg8.ejercicio.pkg2;
import java.util.Scanner;
public class Unidad2Semana3Clase8Ejercicio2 {
public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        System.out.println ("Ingrese el numero:");
        int numero;
        numero= ingresar. nextInt();
        for (int i=1; i<=10; i++) {
            System.out.println(numero+"*"+ i + " = " + numero * i);
        }
    }
    
}
