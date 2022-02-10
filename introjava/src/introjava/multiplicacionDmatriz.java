/*multiplicacion de un vector por una matriz
 * dado un vector 1 x n y una matriz N X  M EL resultado del producto es 1x M
 * ejemplo vector 1x2  * matriz 2x3 = producto 1x3
v= [3,5]  *  m=[ 4,8,6]   = [ 3*4+5*2,3*8+5*1, 3*6*5*7 = [22,29,53]
               [2, 1, 7]   
*/     
 
package introjava;

import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class multiplicacionDmatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*int i;
        
        */
        int[] vector;
        vector = new int[2];
        int[] producto = new int[3];
        int[][] matriz = {{4,8,6}, {2,1,7}};
        System.out.println("Ingrese los valores del vector de tamaño" +vector.length+ ":");
        Scanner leer = new Scanner(System.in);
     
        for ( int i = 0; i < vector.length; i++) {
            System.out.print("v["+i+ "]=");
            vector [i]= leer.nextInt();
        }
        int sum;
       
            for ( int j = 0; j < matriz[0].length; j++ ){
            sum = 0;
            for (  int i=0; i < vector.length; i++){
                sum += vector[i] * matriz[i][j];
            }
            producto[j]= sum;        
        }
        String aux = "";
        System.out.println("*vector : ");
        for (int elemento : vector){
            aux=aux +"  "+elemento;
        }
        System.out.println("aux");
        System.out.println("\n* matriz:");
        for (int[] fila : matriz){
            aux = " ";
          for (int elemento : fila){ 
              aux +=" "+ elemento;              
          }
            System.out.println("aux");
        }
        aux =" ";
        System.out.println("\n* vector x matriz :");
        for (int elemento : producto){
            aux +=" "+ elemento;
        }
        
    }
    
}
