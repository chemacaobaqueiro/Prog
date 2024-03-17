
package boletin.pkg3_2;
import java.util.Scanner;
public class Boletin3_2 {

   
    public static void main(String[] args) {
        double celsius, faren,kelvin;
        System.out.println("Introduce el valor de los grados celsius");
        Scanner cl=new Scanner(System.in);
        celsius=cl.nextDouble();
        faren=celsius*1.8+32;
        kelvin=celsius+273.15;
        System.out.println("El cambio a grado farenheit es = "+faren+"\nEl cambio a kelvin es = "+kelvin);
    }
    
}
