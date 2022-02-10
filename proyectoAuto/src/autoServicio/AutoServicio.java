/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoServicio;

import autoEntidad.AutoEntidad;
import java.util.Scanner;

/**
 *
 * @author Gabi
 */
public class AutoServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public AutoEntidad crearAuto() {

        AutoEntidad autoNuevo = new AutoEntidad();

        System.out.println("Indique la marca del auto");
        autoNuevo.setMarca(read.next());
        System.out.println("Indique el año del auto");
        autoNuevo.setAnio(read.nextInt());
        System.out.println("Indique el combustible que usa");
        autoNuevo.setCombustible(read.next());
        System.out.println("Indique el color del auto");
        autoNuevo.setColor(read.next());

        return autoNuevo;
    }

    public String acelerarAuto() {

        return "El auto esta en movimiento";
    }

    public String detenerAuto() {

        return "El auto esta detenido";
    }

    public String pintarAuto(String colorNuevo) {

        return colorNuevo;
    }

    public String mostrarDatosAuto(AutoEntidad nuevoAuto) {

        return "Es un auto marca: " + nuevoAuto.getMarca() + " modelo:  " + nuevoAuto.getAnio() + "\n"
                + "Usa combustible :" + nuevoAuto.getCombustible() + "\n"
                + "Estado del auto : " + nuevoAuto.getVelocidad() + "\n"
                + nuevoAuto.getColor();

    }

    public void menu(AutoEntidad autoNuevo) {

        int opc = 0;

        while (opc != 4) {

            System.out.println(""
                    + "---      Menu    ---\n"
                    + "1. Arrancar auto.\n"
                    + "2. Frenar auto.\n"
                    + "3. Pintar auto.\n"
                    + "4. Salir ");

            opc = read.nextInt();

            switch (opc) {
                case 1:
                    autoNuevo.setVelocidad(acelerarAuto());
                    System.out.println(autoNuevo.getVelocidad());

                    break;

                case 2:

                    autoNuevo.setVelocidad(detenerAuto());
                    System.out.println(autoNuevo.getVelocidad());
                    break;

                case 3:
                    System.out.println("Elije el color para pintar el auto");
                    String color = read.next();
                    autoNuevo.setColor(pintarAuto(color));

                    break;

                case 4:
                    System.out.println("Ha finalizado la operacion");

            }

        }

    }

}
