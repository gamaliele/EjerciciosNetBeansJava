package ejerciciosgui5;

import java.util.Scanner;

/*
 * 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado 
de la suma
 
 */

/**
 *
 * @author GamalielE.Gonzalez
 */
public class ejercicio1G5 {
    
    public static void main(String[] args) {
      
        
        
        System.out.println("ingrese el primer numero para la suma" );
            
         Scanner num1= new Scanner(System.in);
        int numero1 = num1.nextInt();
         System.out.println("ingrese el segundo numero para la suma" );
            
         Scanner num2= new Scanner(System.in);
         
         int numero2= num2.nextInt();
         int suma;
               
         suma = (numero1 + numero2);
         System.out.println("el valor de la suma del numero   "+numero1 +  " + " +numero2+ " es igual a :" + suma);
         
         
        
    }
    
    
}
