/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class Operaciones {

    public Operacion crearOperacion() {
        Operacion datos = new Operacion();
        Scanner Leer = new Scanner(System.in);

        System.out.println("Ingrese el PRIMER NUMERO");
        datos.setNum1(Leer.nextInt());

        System.out.println("Ingrese SEGUNDO NUMERO");
        datos.setNum2(Leer.nextInt());

        return datos;
    }

    public int Sumar(Operacion datos) {
        int sumar = datos.getNum1() + datos.getNum2();
        return sumar;
    }

    public int Restar(Operacion datos) {
        int restar = datos.getNum1() - datos.getNum2();
        return restar;
    }

    public void Multiplicar(Operacion datos) {
        /*int multiplicar = datos.getNum1() * datos.getNum2();
         */
        if (datos.getNum2() == 0) {
            System.out.println("No se puede Multiplicar por cero el resultado dara : " + datos.getNum2());
        } else {
            System.out.println("La Multiplicacion es : " + datos.getNum1() * datos.getNum2());
        }

        /*return multiplicar;*/
    }

    public void Dividir(Operacion datos) {
        double dividir;
        /*double dividir = datos.getNum1()/datos.getNum2();
         */
        if (datos.getNum2() == 0) {
            System.out.println("NO PUEDES DIVIDIR A CERO");
        } else /*dividir = datos.getNum1()/datos.getNum2();*/ {
            System.out.println("La Division es : " + datos.getNum1() / datos.getNum2());
        }
        /*(datos.getNum2()>0);*/

    }
}
