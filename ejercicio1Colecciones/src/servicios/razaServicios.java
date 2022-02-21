/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package servicios;

import entidades.razaArraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class razaServicios {

    private ArrayList<razaArraylist> listaperros;
    private Scanner leer;

    public razaServicios() {
        this.listaperros = new ArrayList<>();
        this.leer = new Scanner(System.in);
    }

    public void crearRaza() {
        System.out.println("Ingrese Raza de Perro");
        String Nombreraza = leer.next();
        razaArraylist p1 = new razaArraylist(Nombreraza);
        listaperros.add(p1);

    }

    public void menuRaza() {
        boolean verdad = true;
        do {
            System.out.println("Desea agregar otra Raza de Perro, SI , NO ?");
            String pregunta = leer.next();
            if (pregunta.equalsIgnoreCase("si")) {
                crearRaza();
            } else {
                for (razaArraylist aux : listaperros) {
                    System.out.println(aux.toString());
                }
                verdad = false;
            }
        } while (verdad == true);

    }
}
