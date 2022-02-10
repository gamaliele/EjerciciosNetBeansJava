package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;


public class MascotaAPP {

 public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
   
     //leer.next()
     Mascota m1 = new Mascota("chiquito", "cunaguaro","Perro");
     m1.setNombre("Pepe");
     
      System.out.println(m1);
     m1.pasear(100);
     
     System.out.println(m1);

//System.out.println(m1.getNombre());

            
//     una manera de que funcione
//     m1.apodo = "Chiquito";
//     m1.nombre= leer.next();
//     m1.tipo= "Perro";
//     m1.edad = 14;
//     m1.raza = "beagle";
//     m1.cola = true;
//     m1.color = "Tricolor";
     
//     System.out.println(m1.nombre+"  "+m1.apodo+"  "+m1.tipo);
     
//      public String nombre;
//    public String apodo;
//    //conejo, gato, perro , loro carpincho 
//    public String tipo;
//    public String color;
//    public String raza;
//    public int edad;
//    public boolean cola;
     
    }
    
}
