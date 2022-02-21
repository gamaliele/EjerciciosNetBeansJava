package guia_7_05;

import java.util.Iterator;
import java.util.TreeSet;

public class Guia_7_05 {

    public static void main(String[] args) {

        TreeSet<String> paises = new TreeSet<>();
        paises.add("Argentina");
        paises.add("Colombia");
        paises.add("Australia");
        paises.add("Islandia");
        paises.add("Dinamarca");
        paises.add("Islas Faena");
        paises.add("Islandia");

        mostrarLista(paises);

        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("Argentina")) {
                it.remove();
            }
        }
        System.out.println("");
        mostrarLista(paises);
    }

    public static void mostrarLista(TreeSet<String> paises) {

        for (String aux : paises) {
            System.out.println(aux);
        }
    }

}
