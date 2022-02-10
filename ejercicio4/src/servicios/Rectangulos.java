/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class Rectangulos {
     public Rectangulo crearRectangulos(){
         Rectangulo area= new Rectangulo();
         Scanner Leer=new Scanner(System.in);
         
         System.out.println("Ingrese Base del rectangulo : ");
         area.setBase(Leer.nextInt());
         
         System.out.println("Ingrese Altura del rectangulo:  ");
         area.setAltura(Leer.nextInt());
         
         return area;
     }
 public int Superficie (Rectangulo area){
     int superficie = area.getBase() * area.getAltura();
     return superficie;
 }
 public int Perimetro (Rectangulo area){
     int perimetro = (area.getBase()+ area.getAltura())*2;
     return perimetro;
 }
 public void Dibujo (Rectangulo area){
         int i = 0;
     while (i<area.getAltura()){
             int j = 0;
         while (j<area.getBase()){
             System.out.print("*");
             j++;
         }
         System.out.println("");
         i++;
         }
     }
 }

