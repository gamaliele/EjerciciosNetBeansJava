/*
 *7. Crear un programa que dado un numero determine si es par o impar
 */
package ejerciciosgui5;

import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class ejercicio7G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("introduzca  numero a evaluar" );
        Scanner numero= new Scanner(System.in);
         int N = numero.nextInt();{
        
      if (N%2==0)
        System.out.println("El número "+N+" es par");
         else 
     System.out.println("El número "+N+" es impar");
    }

    }  
}
