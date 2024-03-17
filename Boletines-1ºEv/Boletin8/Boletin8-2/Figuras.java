
package boletin8_2;

import java.util.Scanner;
public class Figuras {
    public void Cuadrado(){
            float areac=lado*lado;
            System.out.println("El area del circulo es :"+areac);
        }
    public void Triangulo(){
            float areat=altura*base/2;
            System.out.println("El area del triangulo es : "+areat);
        }
    public void Circulo(){
            double areacr=3.14*radio*radio;
            System.out.println("El area del circulo es : "+areacr);
        }
    public float pedirlado(){
        float lado;
        Scanner scc=new Scanner(System.in);
            System.out.println("Introduce el lado del cuadrado");
            lado=scc.nextFloat();
        return lado;
    }
    public static float pediraltura(String mensaxe){
        float altura;
        Scanner sct=new Scanner(System.in);
            altura=sct.nextFloat();
        return altura;   
    }
    public static float pedirBase(){
        float base;
           Scanner sctb=new Scanner(System.in);
           System.out.println("Introduce la base del triangulo");
            base=sctb.nextFloat();
        return base;
    }
    public static float pedirRadio(){
        float radio;
        Scanner sccr=new Scanner(System.in);
            System.out.println("Introduce el radio del circulo");
            radio=sccr.nextFloat();
        return radio;
        
    }
        
    }
