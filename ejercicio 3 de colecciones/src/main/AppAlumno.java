package main;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.AlumnoServicio;

public class AppAlumno {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Scanner leer = new Scanner(System.in);
        AlumnoServicio alumServ = new AlumnoServicio();
        String opcion;
        do {
            alumnos.add(alumServ.crearAlumno());
            System.out.println("Desea ingresar otro Alumno S/N");
            opcion = leer.nextLine();
        } while (opcion.equals("S"));
         System.out.println("Ingrese el nombre que desea calcular el promedio");
         String busqueda = leer.nextLine();
         for(Alumno auxiliar : alumnos ){
             if(busqueda.equalsIgnoreCase(auxiliar.getNombre())){
                 System.out.println("La nota final de "+ busqueda+ "  es :  "+ alumServ.notaFinal(auxiliar));
         }
         }
    }

}


