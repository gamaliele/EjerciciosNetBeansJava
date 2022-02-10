/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Rectangulo;
import servicios.Rectangulos;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class MainR {

    /**prueba dos
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulos rs = new Rectangulos();
        Rectangulo op = rs.crearRectangulos();
        
        System.out.println("la SUPERFICIE del rectangulo es de : "+ rs.Superficie(op));
        System.out.println("El PERIMETRO del triangulo es de :  "+ rs.Perimetro(op));
        rs.Dibujo(op);
                
        
        
    }
    
}
