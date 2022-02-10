/*
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package libro;
 


/**
 *
 * @author GamalielE.Gonzalez
 */
public class Libro {
private int ISBN;
private String titulo;
private String autor;
private int npagina;

public Libro(int ISBN,String titulo,String autor,int npagina){
    this.ISBN = ISBN;
    this.autor = autor;
    this.npagina = npagina;
}

public String getNombre() {
        return nombre;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
