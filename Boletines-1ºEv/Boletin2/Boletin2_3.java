package boletin.pkg2_3;
import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        System.out.println("Dime la cantidad de euros");
        Scanner eu=new Scanner (System.in);
        float euros=eu.nextFloat();
        System.out.println("Dime como esta el cambio de euro a dolar");
        Scanner cm=new Scanner (System.in);
        float cambio=cm.nextFloat();
        float dolares=euros*cambio;
        System.out.println(euros+" Euros son " +dolares+ " Dolares ");
    }
    
}
