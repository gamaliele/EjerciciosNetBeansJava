/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoEntidad;

/**
 *
 * @author Gabi
 */
public class AutoEntidad {
    
    //Caracteristicas o atributos
    
    private String velocidad;
    
    private String color;
    
    private String marca;
    
    private int anio;
    
    private String combustible;

    //Metodo Constructor
    
    public AutoEntidad(int ruedas, String color, String marca, int anio, String combustible) {
        
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.combustible = combustible;
    }

    public AutoEntidad() {
        
        this.velocidad = "El auto no se ha movido";
    }

    
    //METODOS ACCESORES
    
    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return "El color del auto es " + color;
    }

    public void setColor(String color) {
        this.color =  color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    
    // To String
    
    @Override
    public String toString() {
        return "AutoEntidad{" + "velocidad=" + velocidad + ", color=" + color + ", marca=" + marca + ", anio=" + anio + ", combustible=" + combustible + '}';
    }
    
    
    
           
    
}
