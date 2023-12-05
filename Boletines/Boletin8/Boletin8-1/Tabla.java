
package boletin8_1;


public class Tabla {
    public void ventas(String nome,int num1){
        if (num1<=100){
            System.out.println(nome+" é un produto de :"+"Consumo baixo");
        }
        
        else if (num1>100&num1<=500){
            System.out.println(nome+" é un produto de :"+"Consumo medio");
        }
        else if (num1>500&num1<=1000){
            System.out.println(nome+" é un produto de :"+"Consumo alto");
        }
        else if (num1>1000){
            System.out.println(nome+" é un produto de :"+"Consumo alto");
        }
        
        
    }
    
}
