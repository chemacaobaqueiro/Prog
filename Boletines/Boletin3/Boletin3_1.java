
package boletin.pkg3_1;
import java.util.Scanner;
public class Boletin3_1 {

   
    public static void main(String[] args) {
        double precio_tar, precio_pag,desc;
        System.out.println("Introduce el precio pagado");
        Scanner pp=new Scanner(System.in);
        precio_pag=pp.nextDouble();
        System.out.println("Introduce el precio de la tarifa");
        Scanner pt=new Scanner(System.in);
        precio_tar=pt.nextDouble();
        desc=100-(precio_pag/precio_tar)*100;
        System.out.println("El descuento es = "+desc);
    }
    
}
