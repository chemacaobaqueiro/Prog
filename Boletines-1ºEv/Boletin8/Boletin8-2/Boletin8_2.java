
package boletin8_2;
import java.util.Scanner;

public class Boletin8_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Figuras obx=new Figuras();
        System.out.println("Seleccione una de las figuras entre \n1_Cuadrado\n2_Triangulo\n3_Circulo");
        int eleccion=sc.nextInt();
        
        switch(eleccion){
            case 1: obx.Cuadrado();
                    obx.pedirlado();
            break;
            case 2: obx.Triangulo();
                    obx.pedirBase();
                    obx.pediraltura();
            break;
            case 3:obx.Circulo();
                   obx.pedirRadio();
            break;
            default: System.out.println("Opcion incorrecta");
        }
        
        
    }
    
}
