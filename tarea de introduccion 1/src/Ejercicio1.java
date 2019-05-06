
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int primernum = entrada.nextInt();
        System.out.println("Ingrese un numero: ");
        int segundonum = entrada.nextInt();
        if (primernum > segundonum) {
            System.out.println("El numero mayor es:" + primernum);
        } else {
            System.out.println("El numero mayor es: " + segundonum);
        }
    }
}