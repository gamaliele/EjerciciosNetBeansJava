/*
 *9. Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejerciciosgui5;

import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class ejercicio9G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("introduzca su frase de 8 caracteres" );
        Scanner palabra= new Scanner(System.in);
         String frase = palabra.nextLine();{
       if  (frase.length()==8)
         System.out.println("CORRECTO" ); 
       else
           System.out.println("INCORRECTO la frase no contiene 8 caracteres" );
    }
    }
    
}
