/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Circunferencia;
import servicios.circunferenciaServicios;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circunferenciaServicios cs=new circunferenciaServicios();
        Circunferencia op = cs.crearCircunferencia();
        System.out.println("el AREA de la circunferencia es: "+ cs.Area(op));
        System.out.println("el PERIMETRO de la circunferencia es : "+ cs.Perimetro(op));
        
    }
    
}
