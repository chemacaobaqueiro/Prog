
package boletin7_4;

import java.util.Scanner;
public class Boletin7_4 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Condicionales obx=new Condicionales();
        System.out.println("Introduce los nombres de las personas y sus pesos");
        obx.pesos(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat());
        
    }
    
}
