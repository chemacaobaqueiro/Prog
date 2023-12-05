
package boletin7_4;


public class Condicionales {
    public void pesos(String persona1,String persona2,float peso1,float peso2){
        if (peso1>peso2){
            float dif=peso1-peso2;
            System.out.println(persona1+" pesa mais e a diferencia de peso é "+dif);
        }
        else{
            float dif2=peso2-peso1;
            System.out.println(persona2+" pesa mais,pesa "+peso1+ "e a diferencia de peso é "+dif2);
        }
    }
    
}
