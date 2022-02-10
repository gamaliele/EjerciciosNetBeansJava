/*
 * 5. Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ejerciciosgui5;

import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class ejercicio5G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("introduzca el numero a transformar" );
      Scanner numero= new Scanner(System.in);
      int N= numero.nextInt();
      int doble = N * 2;
      int triple= N * 3;
        double raiz = Math.sqrt(N);
       System.out.println("EL DOBLE ES :" +doble+ " el Triple : " +triple+ " y la raiz cuadrada : " + raiz ); 
    }
    
}
