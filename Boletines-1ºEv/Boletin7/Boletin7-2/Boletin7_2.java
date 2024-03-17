
package boletin7_2;
import java.util.Scanner;

public class Boletin7_2 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        condiciones obj=new condiciones();
        
        System.out.println("escribe 2 numeros");
        obj.operaciones(sc.nextShort(),sc.nextShort());
        
    }
    
}
