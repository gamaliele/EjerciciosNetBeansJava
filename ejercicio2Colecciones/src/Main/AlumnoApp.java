package Main;

import entidades.AlumnosServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoApp {

    AlumnosServicio as = new AlumnosServicio();
    private ArrayList<AlumnosServicio> alumn;
    private Scanner leer;

    public AlumnoApp() {
        this.alumn = new ArrayList<>();
        this.leer = new Scanner(System.in);
    }

    public void crearAlumno() {
        System.out.println("Ingrese Alumno");
        String NombreA = leer.next();
        AlumnosServicio p1 = new AlumnosServicio(NombreA);
        alumn.add(p1);
        as.setAlumno(alumn);
    }

    public static void main(String[] args) {
        AlumnoApp a1 = new AlumnoApp();
        a1.crearAlumno();

    }

}
