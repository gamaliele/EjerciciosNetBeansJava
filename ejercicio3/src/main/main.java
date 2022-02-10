/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Operacion;
import servicios.Operaciones;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        Operacion calcu = op.crearOperacion();
        
        System.out.println("La suma de los numeros es : "+ op.Sumar(calcu));
        System.out.println("La RESTA de los numeros es : "+ op.Restar(calcu));
        op.Multiplicar(calcu);
       op.Dividir(calcu);
    }
    
}
