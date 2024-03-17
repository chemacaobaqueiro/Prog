
package boletin11_1;

import java.util.Scanner;

public class Xogo {

    public void Randomizado() {
        int dato = LerDatos.lerNumero("Introduce un numero entre 1 y 50");
        int intentos = LerDatos.lerIntento("Introduce el numero de intentos que tendrá");
        int i = 0;
        int intento;
        while (intentos > i) {
            System.out.println("Introduce el numero que creas : ");
            Scanner sc = new Scanner(System.in);
            intento = sc.nextInt();
            if (dato == intento) {
                System.out.println("!Has acertado el numero!");
                i++;
                break;
            } else if (intento > dato) {
                System.out.println("El numero introducido es mayor que el dato");
                i++;
            } else {
                System.out.println("El numero introducido es menor que el dato");
                i++;
            }
        }
        System.out.println("Ya se acabó el bucle");
        if (i == intentos) {
            System.out.println("Te has quedado sin intentos");
        }

    }

}
