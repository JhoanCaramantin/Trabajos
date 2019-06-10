
package matrizids;

import java.util.Arrays;
import java.util.Scanner;
public class MatrizIDS {
    private Scanner teclado;
    private int[][]mat;
    
    public void cargar(){
    teclado=new Scanner(System.in);
        System.out.println("Indique el numero de filas: ");
        int filas=teclado.nextInt();
        System.out.println("Indique el numero de columnas: ");
        int columnas=teclado.nextInt();
    mat= new int[filas][columnas];
    for (int i=0;i<filas;i++){
        for(int j=0;i<columnas;i++){
            System.out.println(Arrays.toString(mat));
        }
        System.out.println("\n");
    }
    
    
    
    
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Indique el numero de filas: ");
        Scanner entrada = new Scanner (System.in);
        
        
        
        
        
    }
    
}
