
package boletin3_5;
import java.util.Scanner;

public class Boletin3_5 {

   
    public static void main(String[] args) {
        double sueldo_t,sueldo_bt,sueldo_li,ventas,comision,quilometraje,kilometros,dieta,dietas;
        System.out.println("Introduce el valor del sueldo total");
        Scanner st=new Scanner(System.in);
        System.out.println("Introduce la cantidad de ventas realizadas");
        Scanner vt=new Scanner(System.in);
        System.out.println("Introduce el valor de los quilometros realizados");
        Scanner qm=new Scanner(System.in);
        System.out.println("Introduce la cantidad de dias de desplazamiento");
        Scanner dt=new Scanner(System.in);
        sueldo_t=st.nextDouble();
        ventas=vt.nextDouble();
        kilometros=qm.nextDouble();
        dieta=dt.nextDouble();
        comision=ventas*0.05;
        quilometraje=kilometros*2;
        dietas=dieta*30;
        sueldo_bt=
        double irpf=sueldo_t*0.18;
        System.out.println("El sueldo bruto es = ");
    }
    
}
