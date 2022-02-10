/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class circunferenciaServicios {
    
    public Circunferencia crearCircunferencia(){
        Circunferencia masDatos=new Circunferencia();
        Scanner Leer=new Scanner( System.in);
        
        System.out.println("ingrese el Radio");
        masDatos.setRadio(Leer.nextDouble());
        
        masDatos.setPi(3.14);
        return masDatos;
    }
public double Area (Circunferencia masDatos){
    double area = masDatos.getRadio() * masDatos.getPi();
    return area;
}
public double Perimetro (Circunferencia masDatos){
    double perimetro = (2)* masDatos.getPi()* masDatos.getRadio();
    return perimetro;
}
}
