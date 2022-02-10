/*
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicios;

import Persona.Persona;
import java.util.Date;
import java.util.Scanner;

public class Metodos {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona P1 = new Persona();
        System.out.println("Ingrese nombre");
        P1.setNombre(leer.nextLine());
        System.out.println("Ingrese Dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese Mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese Año");
        int anio = leer.nextInt();
        Date Nac = new Date(anio + 1900, mes, dia);
        P1.setNacimiento(Nac);
        return P1;

    }

    public int calcularEdad(Persona P1) {
        Date fechaActual = new Date();
        Date fechanacimiento = P1.getNacimiento();
        int edad = fechaActual.getYear() - P1.getNacimiento().getYear();
        edad = fechaActual.getYear() - fechanacimiento.getYear();
        return edad;
    }

    public boolean menorQue(Persona P1, int edad) {
        int edadPersona = calcularEdad(P1);
        /*if(edadPersona >= edad){
           return false;
        }else {
           return true;
        }            
         */
        return edadPersona < edad;
    }

    public void mostrarPersona(Persona P1) {
        System.out.println(P1);

    }

}
