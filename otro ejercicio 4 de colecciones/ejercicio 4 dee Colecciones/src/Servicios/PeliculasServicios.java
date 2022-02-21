package Servicios;

import entidades.peliculas;
import java.util.Scanner;

public class PeliculasServicios {

    public peliculas crearPeliculas() {

        peliculas pelicula = new peliculas();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el titulo de la pelicula");
        pelicula.setTitulo(leer.nextLine());
        System.out.println("Ingresar director de la pelicula");
        pelicula.setDirector(leer.nextLine());
        System.out.println("Ingresar duracion de la pelicula");
        pelicula.setDuracion(leer.nextDouble());
        
        return pelicula;
    }
}