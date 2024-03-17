
package boletin9_3;
import java.util.Scanner;

public class DatosRectangulo {
    
    public static float pedirBase(){
        float base;
           Scanner sctb=new Scanner(System.in);
           System.out.println("Introduce la base del triangulo");
            base=sctb.nextFloat();
        return base;
    }
    public static float pediraltura(String mensaxe){
        float altura;
        Scanner sct=new Scanner(System.in);
            altura=sct.nextFloat();
        return altura;   
    }
   
    
}
