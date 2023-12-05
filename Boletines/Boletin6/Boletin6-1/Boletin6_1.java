
package boletin6.pkg1;


public class Boletin6_1 {


    public static void main(String[] args) {
        
        Coche obj=new Coche();
        obj.acelerar(60);
        obj.frenat(30);
        System.out.println("A velocidade do coche é : "+obj.getVelocidade());
    }
    
}
