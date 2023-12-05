
package boletin3_4;
import java.util.Scanner;
public class Boletin3_4 {


    public static void main(String[] args) {
        long total,cien,veinte,cinco,uno;
        System.out.println("Introduce la cantidad de dinero total");
        Scanner tt=new Scanner(System.in);
        total=tt.nextLong();
        cien=total/100;
        veinte=total%100/20;
        cinco=total%100%20/5;
        uno=total%100%20%5;
        System.out.println("El desglose del dinero es = \n"+cien+" billetes de cien \n"+veinte+" Billetes de veinte \n"+cinco+" Billetes de cinco \n"+uno+" Monedas de uno");
        
    }
    
}
