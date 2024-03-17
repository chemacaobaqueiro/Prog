
package boletin8_1;

import java.util.Scanner;
public class Boletin8_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tabla obx=new Tabla();
        System.out.println("Introduce o nome do produto y sus respectivas ventas");
        obx.ventas(sc.nextLine(), sc.nextInt());
        
    }
    
}
