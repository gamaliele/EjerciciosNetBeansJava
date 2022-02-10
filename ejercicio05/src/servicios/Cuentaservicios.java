/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Cuenta.newpackage.Cuenta;
import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class Cuentaservicios {
    public Cuenta crearCuentas(){
        Cuenta moldeCuenta= new Cuenta();
        Scanner Leer=new Scanner(System.in);
        
        System.out.println("Introducir nombre");
          moldeCuenta.setNombre(Leer.nextLine());
          
          System.out.println("Introducir el DNI");
          moldeCuenta.setDNI(Leer.nextInt());
          
          System.out.println("Introducir Numero de Cuenta");
          moldeCuenta.setNumeroCuenta(Leer.nextInt());
          
          System.out.println("Introduce Tu saldo Actual");
          moldeCuenta.setSaldoActual(Leer.nextDouble());
          
          
          
          return moldeCuenta;
    }
public double Ingreso (Cuenta moldeCuenta){
    System.out.println("INGRESE LA CANTIDAD DE DINERO A DEPOSITAR");
    Scanner ingresar=new Scanner(System.in);
    double ingreso= moldeCuenta.getSaldoActual()+ ingresar.nextDouble();
    moldeCuenta.setSaldoActual(ingreso);
    return ingreso;
}
public void Retirar (Cuenta moldeCuenta){
    System.out.println("Ingrese monto a SACAR");
    Scanner sacar=new Scanner (System.in);
    double retirar=moldeCuenta.getSaldoActual()-sacar.nextDouble();
    if (retirar>0)
        System.out.println("Saldo queda en en :"+retirar);
    else
        System.out.println("El Saldo es cero");
   if (retirar>0) moldeCuenta.setSaldoActual(retirar);
   else
       moldeCuenta.setSaldoActual(0);
}
public void extraccionRapida (Cuenta moldeCuenta){
    double extraccion;
    double porcentaje;
    porcentaje= moldeCuenta.getSaldoActual()*0.2;
   extraccion=0;
    System.out.println("no se puede sacar mas del 20% , introduzca un monto");
    Scanner montosacado= new Scanner (System.in);
    extraccion= moldeCuenta.
    if (porcentaje >= montosacado.nextDouble()){
        System.out.println("NO PODES SACAR MAS DEL 20 % DE TU SALDO");
   }else{
             System.out.println("tu retiro del : "+montosacado.nextDouble())+" % es de "+ extraccion);
       
             moldeCuenta.setSaldoActual(extraccion);
        }
}
public void consultarSaldo (Cuenta moldeCuenta){
        System.out.println("el saldo actual es de "+ moldeCuenta.getSaldoActual() );                  
          
}
public void consultarDatos (Cuenta moldeCuenta){
    System.out.println("Nombre           : "+moldeCuenta.getNombre());
    System.out.println("Numero de Cuenta : "+moldeCuenta.getNumeroCuenta());
    System.out.println("Numero de DNI    :"+moldeCuenta.getDNI());
    System.out.println("INTERESES GENERADOS :"+moldeCuenta.getInteres());
    System.out.println("SALDO ACTUAL :    "+moldeCuenta.getSaldoActual());
}
}

