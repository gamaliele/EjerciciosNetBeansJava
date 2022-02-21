package utilidades;

import entidades.peliculas;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<peliculas> ordenDuracionDescendente = new Comparator<peliculas>(){
        
        @Override 
        
        public int compare(peliculas o1, peliculas o2) {            
            
            return o2.getDuracion().compareTo(o1.getDuracion());
        }        
    };
    
    public static Comparator<peliculas> ordenDuracionAscendente = new Comparator<peliculas>(){
        
        @Override 
        
        public int compare(peliculas o1, peliculas o2) {            
            
            return o1.getDuracion().compareTo(o2.getDuracion());
        } 
    };
   
    public static Comparator<peliculas> ordenTituloAscendente = new Comparator<peliculas>(){
        
        @Override 
        
        public int compare(peliculas o1, peliculas o2) {
            
            
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
        
    };
    
   public static Comparator<peliculas> ordenDirectorAscendente = new Comparator<peliculas>(){
        
        @Override 
        
        public int compare(peliculas o1, peliculas o2) {           
            
            return o1.getDirector().compareTo(o2.getDirector());
        }
        
    }; 
  
}
