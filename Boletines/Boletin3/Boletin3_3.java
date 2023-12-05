
package boletin3_3;
import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        double cien,veinte,cinco,un;
        System.out.println("Introduce la cantidad de billetes de 100");
        Scanner cen=new Scanner(System.in);
        System.out.println("Introduce la cantidad de billetes de 20");
        Scanner vt=new Scanner(System.in);
        System.out.println("Introduce la cantidad de billetes de 5");
        Scanner five=new Scanner(System.in);
        System.out.println("Introduce la cantidad de monedasd de 1 euro");
        Scanner uno=new Scanner(System.in);
        cien=cen.nextDouble();
        veinte=vt.nextDouble();
        cinco=five.nextDouble();
        un=uno.nextFloat();
        double cantidadtotal=cien*100+veinte*20+cinco*5+un;
        System.out.println("La suma total del dinero es ="+cantidadtotal);
        
    }
    
}
