/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoPrincipal;

import autoEntidad.AutoEntidad;
import autoServicio.AutoServicio;

/**
 *
 * @author Gabi
 */
public class AutoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instancia del servicio
        AutoServicio autoServ = new AutoServicio();
        
        
        // instancia de entidad
//        AutoEntidad autoNuevo = autoServ.crearAuto();
//        
//            autoServ.menu(autoNuevo);
//            System.out.println(autoServ.mostrarDatosAuto(autoNuevo));
        
        AutoEntidad[] autosNuevos = new AutoEntidad[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Auto "+ (i+1)+" :");
            
            autosNuevos[i] = autoServ.crearAuto();
            
            autoServ.menu(autosNuevos[i]);
        }
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Auto " + (i+1)+" :");
            
            System.out.println(autoServ.mostrarDatosAuto(autosNuevos[i]));
        }


    }
    
}
