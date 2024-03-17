
package boletin14;

import Partes.CPU;
import Partes.Monitor;
import Partes.Teclado;


public class Boletin14 {


    public static void main(String[] args) {
        //Introduzco todos los datos del ordenador
        Teclado objT = new Teclado("Samsung",80f);
        Monitor objM = new Monitor("Samsung",15.5f);
        CPU obju = new CPU(12,8);
        
        //Se adjudican losdatos intyroducidos anteriormente al objeto ordenador 
        
        Ordenador objO = new Ordenador(objT,objM,obju,1000);
        
        //Muestro todos los datos del ordenador, solo el precio del ordenador, solo la marca del teclado, solo la velocidad del cpu
        System.out.println(objO);
        System.out.println("Precio : "+objO.getPrecio());
        System.out.println("Marca teclado : "+objT.getMarca());
        System.out.println("Velocidad de cpu : "+obju.getVelocidad());

    }
    
}
