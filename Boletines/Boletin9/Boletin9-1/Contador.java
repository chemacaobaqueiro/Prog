
package boletin9_1;


public class Contador {

    public void calculao(){
        int i1=0;
        int i2=0;
        int i3=0;
        int num=0;
        while(num<10){
            int dato= LerDatos.LerEntero("teclea un nuevo numero");
            if (dato<0){
                i1++;
            }
            else if (dato==0){
                i2++;
            }
            else if (dato>0){
                i3++;
            }
            num++;
        }
        System.out.println("Numeros positivos: "+i3);
        System.out.println("Numeros negativos: "+i1);
        System.out.println("Ceros: "+i2);
    }
}
