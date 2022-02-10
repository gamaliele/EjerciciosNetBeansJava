/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import entidades.Matematica;
import servicios.metodosMatematica;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class MainMatematica {

    /**
     * @param args the command line arguments
     */
    /*public void agregarNumero (Matematica aleatorio){
      int agrega=Math.random(aleatorio.setNomero1(0));
      aleatorio.setNumero2(Math.random);
    }*/
    public static void main(String[] args) {
     metodosMatematica mm=new metodosMatematica();
     Matematica op= new Matematica();
     
     op.setNomero1(Math.random());
     op.setNumero2(Math.random());
     
        System.out.println(op);
        
     mm.devolverMayor(op);
     mm.calcularPotencia(op);
     mm.calculaRaiz(op);
     
     
     
    }

    
    
}
