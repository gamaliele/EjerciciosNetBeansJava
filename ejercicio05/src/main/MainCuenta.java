/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Cuenta.newpackage.Cuenta;
import servicios.Cuentaservicios;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class MainCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuentaservicios cus= new Cuentaservicios();
       Cuenta cu1=cus.crearCuentas();
        System.out.println("El saldo despues de ingresado fue de :" + cus.Ingreso(cu1));
      cus.Retirar(cu1);
      
        
        
    }
    
}
        
