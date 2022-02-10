/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Matematica;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class metodosMatematica {

    public void devolverMayor(Matematica operaciones) {
        /*operaciones.setNomero1(Math.random());*/
      
        if (operaciones.getNomero1() < operaciones.getNumero2()) {
            System.out.println("El numero mayor es : " + operaciones.getNumero2());
        } else if (operaciones.getNumero2() < operaciones.getNomero1()) {
           
            System.out.println("El numero mayor es :  " + operaciones.getNomero1());
        } else {
            System.out.println("LOS NUMEROS SON IGUALES");
        }

    }
    public void calcularPotencia(Matematica operaciones){
        Math.floor(operaciones.getNomero1());
           Math.floor(operaciones.getNumero2());
       if (operaciones.getNomero1() < operaciones.getNumero2()) {
           System.out.println("la potencia del mayor valor de la clase\n" +
"elevado al menor número es : " + Math.pow(operaciones.getNumero2(), operaciones.getNomero1()));
        
       } else if (operaciones.getNumero2() < operaciones.getNomero1()) {
            System.out.println("La potencia del mayor valor de la clase 2:  " + Math.pow(operaciones.getNomero1(), operaciones.getNumero2()));
        } else {
            System.out.println("LOS NUMEROS SON IGUALES");
        }
    }
    public void calculaRaiz(Matematica operaciones){
        double absoluto1= Math.abs(operaciones.getNomero1());
        double absoluto2= Math.abs(operaciones.getNumero2());
       if (operaciones.getNomero1() < operaciones.getNumero2()) {
            System.out.println("la Raiz cuadrada del Menor numero obtenido 1 de la clase\n" +
" es : " + Math.sqrt(absoluto1));
        
       } else if (operaciones.getNumero2() < operaciones.getNomero1()) {
            System.out.println("la Raiz cuadrada del Menor numero obtenido 2 de la clase\n" +
" es : " + Math.sqrt(absoluto2));
        } else {
            System.out.println("LOS NUMEROS SON IGUALES");
        }  
    }
}
