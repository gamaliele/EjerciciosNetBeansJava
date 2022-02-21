/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.
 */
package entidades;

import java.util.ArrayList;
import java.util.HashSet;

public class AlumnosServicio {

    private ArrayList<String> alumno;
    private HashSet<Integer> notaMatematica1;
    private HashSet<Integer> notaMatematica2;
    private HashSet<Integer> notaMatematica3;

    public AlumnosServicio() {
        alumno = new ArrayList();
        notaMatematica1 = new HashSet();
        notaMatematica2 = new HashSet();
        notaMatematica3 = new HashSet();
    }

    public AlumnosServicio(ArrayList<String> alumno, HashSet<Integer> notaMatematica1, HashSet<Integer> notaMatematica3) {
        this.alumno = alumno;
        this.notaMatematica1 = notaMatematica1;
        this.notaMatematica3 = notaMatematica3;
    }

    public ArrayList<String> getAlumno() {
        return alumno;
    }

    public HashSet<Integer> getNotaMatematica1() {
        return notaMatematica1;
    }

    public void setNotaMatematica1(HashSet<Integer> notaMatematica1) {
        this.notaMatematica1 = notaMatematica1;
    }

    public HashSet<Integer> getNotaMatematica2() {
        return notaMatematica2;
    }

    public void setNotaMatematica2(HashSet<Integer> notaMatematica2) {
        this.notaMatematica2 = notaMatematica2;
    }

    public HashSet<Integer> getNotaMatematica3() {
        return notaMatematica3;
    }

    public void setNotaMatematica3(HashSet<Integer> notaMatematica3) {
        this.notaMatematica3 = notaMatematica3;
    }

    public void recorrerAlumnos() {
        for (String alum : alumno) {
            System.out.println(alum);
        }
    }

    public void setAlumno(ArrayList<AlumnosServicio> alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
