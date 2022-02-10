/*
 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
package ejerciciosgui5;

import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class ejercicio4G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("centigrados" );
      Scanner centigrados= new Scanner(System.in);
      float centigrado1= centigrados.nextInt();
         float transformacion;
        transformacion= 32 + ( centigrado1* 9/ 5);
         System.out.println("Fahrenheit =  " +transformacion);
    }
    
}
