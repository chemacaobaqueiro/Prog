
package boletin.pkg2_5;
import java.util.Scanner;
public class Boletin2_5 {

    public static void main(String[] args) {
           double millas,metros;
           System.out.println("Escribe las millas");
           Scanner ml=new Scanner(System.in);
           millas=ml.nextDouble();
           final int valor=1852;
           metros=millas*valor;
           System.out.println("Las millas anteriores son = "+metros+" metros");
    }
    
}
