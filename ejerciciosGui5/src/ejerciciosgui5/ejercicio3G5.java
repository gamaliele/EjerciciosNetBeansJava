/*3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package ejerciciosgui5;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class ejercicio3G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("ESCRIBE TU NOMBRE COMPLETO EN MAYUSCULA" );
      Scanner nombre= new Scanner(System.in);
        String guardado = nombre.nextLine();
      System.out.println("hola tu nombre te lo transformo en minuscula   " + guardado.toLowerCase()  );
        System.out.println("escribeme tu nombre completo en minuscula" );
             Scanner nombre2= new Scanner(System.in);
            System.out.println("HOLA TU NOMBRE TE LO TRANSFORMO EN MAYUSCULA     " + nombre2.nextLine().toUpperCase() ); 
    }
    
}
