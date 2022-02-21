package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

        public Alumno crearAlumno() {
        Scanner leer = new Scanner(System.in);
        Alumno alum = new Alumno();
        System.out.println("Ingrese Nombre del alumno");
        alum.setNombre(leer.nextLine());
        ArrayList<Integer> notas = new ArrayList<Integer>();
        System.out.println("Ingrese primer nota de " + alum.getNombre());
        notas.add(leer.nextInt());
        System.out.println("Ingrese segunda nota");
        notas.add(leer.nextInt());
        System.out.println("Ingrese Tercera nota ");
        notas.add(leer.nextInt());

        alum.setNotas(notas);
        return alum;
    }

    public double notaFinal(Alumno alumnorandom) {
        int sumatotal = 0;
        for (Integer aux : alumnorandom.getNotas()) {
            sumatotal = aux + sumatotal;
        }
        return sumatotal / 3;
    }
}
