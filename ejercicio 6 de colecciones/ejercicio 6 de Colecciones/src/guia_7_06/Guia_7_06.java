/*Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
package guia_7_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Guia_7_06 {

    public static void main(String[] args) {

        HashMap<String, Double> lista = new HashMap<>();
        
        introducir(lista);
        mostrar(lista);
        modificar(lista);
        mostrar(lista);
        eliminar(lista);
        System.out.println("eliminación!!!");
        mostrar(lista);

    }

    public static void introducir(HashMap<String, Double> lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar producto");
        String nombre = leer.nextLine();
        System.out.println("Ingresar precio del producto");
        Double precio = leer.nextDouble();

        lista.put(nombre, precio);
    }

    public static void modificar(HashMap<String, Double> lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar producto a modificar");
        String modificarProducto = leer.nextLine();

        for (Map.Entry<String, Double> aux : lista.entrySet()) {
            if (modificarProducto.equals(aux.getKey())) {
                System.out.println("Ingresar precio nuevo");
                aux.setValue(leer.nextDouble());
            }
        }
    }

    public static void eliminar(HashMap<String, Double> lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar producto a eliminar");
        String eliminarProducto = leer.nextLine();
        if (lista.containsKey(eliminarProducto)) {
            lista.remove(eliminarProducto);
        }
    }

    public static void mostrar(HashMap<String, Double> lista) {
        for (Map.Entry<String, Double> aux : lista.entrySet()) {
            System.out.println("Producto: " + aux.getKey() + " Precio: $" + aux.getValue());
        }
    }
}
