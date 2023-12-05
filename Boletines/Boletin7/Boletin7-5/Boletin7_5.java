
package boletin7_5;

import java.util.Scanner;
public class Boletin7_5 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        metodo obx=new metodo();
        System.out.println("Introduce tres numeros");
        obx.maior(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
    }
    
}
