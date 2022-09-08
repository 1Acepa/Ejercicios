package javaapplication2;
import java.util.Scanner; // el programa usa la clase Scanner
public class JavaApplication2 {
    public static void main(String[] args) {
        // TODO code application logic here
        // crea objeto Scanner para obtener la entrada de la ventada de comandos
        Scanner entrada= new Scanner (System.in);
        
        int numero1; // primer numero a comparar
        int numero2; // segundo numero a comparar
        
        System.out.print("Escriba el primer numero entero:"); // indicador
        numero1 = entrada.nextInt(); // lee el primer numero del usuario
        
        System.out.print("Escriba el segundo numero entero:"); // indicador
        numero2 = entrada.nextInt(); // lee el segundo numero del usuario
        
        if (numero1 == numero2)
        System.out.println ("El numero"+ numero1 + "es igual a" + numero2);
        
        if (numero1 != numero2)
        System.out.println ("El numero"+ numero1 + "es distinto a" + numero2);
        
        if (numero1 < numero2)
        System.out.println ("El numero"+ numero1 + "es menor a" + numero2);
        
        if (numero1 > numero2)
        System.out.println ("El numero"+ numero1 + "es mayor a" + numero2);
        
        if (numero1 <= numero2)
        System.out.println ("El numero"+ numero1 + "es menor o igual a" + numero2);
        
        if (numero1 >= numero2)
        System.out.println ("El numero"+ numero1 + "es mayor o igual a" + numero2);
    }
    
}
