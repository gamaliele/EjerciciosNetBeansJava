/*
 * Método Static y Clase Math

9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package entidades;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class Matematica {
    private double nomero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double nomero1, double numero2) {
        this.nomero1 = nomero1;
        this.numero2 = numero2;
    }

    public double getNomero1() {
        return  nomero1;
    }

    public void setNomero1(double nomero1) {
        this.nomero1 = nomero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public String toString(){
        return " Numeros {" + "numero 1=" + nomero1 + ", numero 2=" + numero2 + '}';
    } 

    public double setNomero1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String setNumero2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
