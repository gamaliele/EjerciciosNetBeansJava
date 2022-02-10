/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class condicionales {

    /**5
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opinion ;
       Scanner leer= new Scanner(System.in);
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas");
        opinion= leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
        
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("nos sentimos apenados que no hayas disfrutado la peli.... : ( ");
                    break;
                case 3:
                    System.out.println("has calificado la pelicula como buena : ) ");
                    break;
                case 4:
                    System.out.println("has calificado la pelicula como muy buena ");
                    break;
                case 5:
                    System.out.println("fantastico que hayas disfrutado y te hayas entretenido ! ");
                    break;
                                    
                          
                    
            }
        } else if ( opinion < 0){
            System.out.println("una opinion negativa? tan mala fue la pelicula? ");
            }else if ( opinion == 0){
            System.out.println("el valor :" + opinion + " no es valido y no se tomara en cuenta" );
            }else {
            System.out.println( opinion + " wow se te fue de la mano la calificacion gracias");
            }
       
    }
    
}
