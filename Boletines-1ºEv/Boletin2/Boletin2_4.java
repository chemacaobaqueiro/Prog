package boletin.pkg2_4;

import java.util.Scanner;

public class Boletin2_4 {


    public static void main(String[] args) {
        double num1,num2,suma,resta,cociente,producto;
        System.out.println("Escribe el primer numero");
        Scanner n1=new Scanner (System.in);
        num1=n1.nextDouble();
        System.out.println("Ahora escribe el segundo numero");
        Scanner n2=new Scanner (System.in);
        num2=n2.nextDouble();
        suma=num1+num2;
        resta=num1-num2;
        producto=num1*num2;
        cociente=num1/num2;
        System.out.println("La suma de los dos numeros es = "+suma+"\nLa resta es = "+resta+"\nEl producto es = "+producto+"\nEl cociente es = "+cociente);
        
        
    }
    
}
