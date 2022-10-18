
package matrices;

import java.util.Scanner;

/**
 *
 * @author SERVER_PC
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // matrices.
        Scanner asdf = new Scanner(System.in);
        int t; 
        System.out.println("digite el tamaño de la matriz");
        t = asdf.nextInt();
       int [][] matriz  = new int [t][t];
       //para guardar datos 
       for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
               matriz[f][c] = (int) (Math.random()*10+1) ;
            }
        }
       // imprimimos la matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(matriz[f][c]+ "\t");
            }
            System.out.println("");
        }
    }
    
}
