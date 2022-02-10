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
public class ejemploDfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultadoFinal = suma (10,10);
        System.out.println(resultadoFinal);
        saludopersonalizado( " chiquito " );
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        saludopersonalizado(nombre);
        System.out.println(leer.next());
        
    }
    public static int suma(int a , int b){
        int resultado = a+ b;
                return resultado;             
    }
    public static void saludopersonalizado(String nombre){
        System.out.println("hola  " + nombre + "  como estas?");
               
    }
}
