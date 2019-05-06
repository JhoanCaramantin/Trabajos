
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int primernum ;
        int segundonum;
        do {
            try {
                System.out.println("Ingrese un numero: ");
                primernum = entrada.nextInt();
                System.out.println("Ingrese un numero: ");
                segundonum = entrada.nextInt();
                if (primernum > segundonum) {
                    System.out.println("El numero mayor es:" + primernum);
                } else {
                    System.out.println("El numero mayor es: " + segundonum);
                }
            } catch (Exception e) {System.out.println("!Cuidado! No es un numero entero,introduzca un numero entero");primernum=1;segundonum=1;entrada.nextLine();}
        } while (primernum != 0&& segundonum!=0);

    }

}