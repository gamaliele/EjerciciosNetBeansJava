/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:*/
package guia_7_04;

import Servicios.PeliculasServicios;
import entidades.peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

public class Guia_7_04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<peliculas> lista = new ArrayList<>();
        PeliculasServicios ps = new PeliculasServicios();
        String respuesta;

        do {
            lista.add(ps.crearPeliculas());
            System.out.println("Quiere ingresar otra pelicula? S/N");
            respuesta = leer.nextLine();
        } while (respuesta.equals("S"));

        mostrarLista(lista);

        System.out.println("Peliculas con duracion mayor a 1 hora:");
        for (peliculas aux : lista) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        }

        System.out.println("Peliculas ordenadas por DURACION DESCENDENTE");
        Collections.sort(lista, Comparadores.ordenDuracionDescendente);
        mostrarLista(lista);
        System.out.println("Peliculas ordenadas por DURACION ASCENDENTE");
        Collections.sort(lista, Comparadores.ordenDuracionAscendente);
        mostrarLista(lista);
        System.out.println("Peliculas ordenadas por TITULO");
        Collections.sort(lista, Comparadores.ordenTituloAscendente);
        mostrarLista(lista);
        System.out.println("Peliculas ordenadas por Director");
        Collections.sort(lista, Comparadores.ordenDirectorAscendente);
        mostrarLista(lista);

    }

    public static void mostrarLista(ArrayList<peliculas> lista) {

        for (peliculas aux : lista) {
            System.out.println(aux);
        }
    }
}
