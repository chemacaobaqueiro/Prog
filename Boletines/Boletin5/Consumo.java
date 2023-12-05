
package boletin.pkg5;
import java.util.Scanner;
public class Consumo {
    //atributos da centralita eléctrica
    private double kilometros,litros,velocidad_md,gasolina;
    private double tiempo,consumo_M,consumo_e;
    
    //crear los constructores
    public Consumo(){
        
    }

    public Consumo(double km,double l, double vm, double gs){
        kilometros=km;
        litros=l;
        velocidad_md=vm;
        gasolina=gs;
    }
    
    //hacer los metodos de acceso
    public double valor_km(){
        System.out.println("Introduce los kilometros recorridos");
        Scanner km=new Scanner(System.in);
        kilometros=km.nextDouble();
        return kilometros;
    }
    public double valor_litros(){
        System.out.println("Introduce los litros de combustible consumidos");
        Scanner l=new Scanner(System.in);
        litros=l.nextDouble();
        return litros;
    }
    public double consumoMedio(){
        double consumo_medio=litros/kilometros*100;
        System.out.println("El consumo medio en litros son = "+consumo_medio);
        return consumo_medio;
    }
    
}
