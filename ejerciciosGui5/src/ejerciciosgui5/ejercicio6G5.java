/*
 * 6. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package ejerciciosgui5;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class ejercicio6G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("introduzca primer numero" );
        Scanner UNO= new Scanner(System.in);
         int a = UNO.nextInt();
         System.out.println("introduzca SEGUNDO numero" );
         Scanner DOS= new Scanner(System.in);
         int b = DOS.nextInt();
         int mayor = max(a,b);
         System.out.println("el mayor numero es : " + mayor);
    }
    
}
