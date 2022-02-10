/*
 * 8. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package ejerciciosgui5;

import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class ejercicio8G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("introduzca su clave" );
        Scanner palabra= new Scanner(System.in);
         String P = palabra.next();{
        /*LA FUNCION EQUALS() trae la comparacion exacta mientras que
        la equalsIgnoreCase trae la comparacion asi sean mayusculas
                */
        if (P.equalsIgnoreCase("eureka"))
           System.out.println("CORRECTO" ); 
        else
            System.out.println("INCORRECTO, mas pelao que rodilla e chivo" );
    }
    }
    
}
