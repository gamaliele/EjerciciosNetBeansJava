/*
 * sumatoria de los numeros naturales pares, va saltando y sumandose siempre y cuando sean pares, con el bucle while.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author GamalielE.Gonzalez
 */
public class sumatoriaconSalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer= new Scanner(System.in);
        
       do {
           System.out.println("ingrese numero entero positivo");
           num = leer.nextInt();
           if ( num > 1000 ){
               System.out.println("este programa podria tardar, estas seguro s/n?");
               String confirma = leer.next();
               if (confirma.equals ("s")){
                   break;
               }
           }
       } while ( num <=0 );
       
       int j, suma;
       for ( int i=1 ; i <= num ; i++){
           if (i%2 !=0)
               continue;
           suma = 0;
           j=1;
           while( j<=i){
               suma+=j;
               j++;
           }
           System.out.println("la suma de los  " + i + " numeros naturales es :  " + suma );
       }
    }
    
}
