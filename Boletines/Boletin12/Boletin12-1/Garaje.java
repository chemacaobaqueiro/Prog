
package boletin12_1;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Garaje {
    public void xestionar(){
    int numeroCoches=0;
    
    //Crear un bucle para que se pidan coches hasta que el numero de coches sea 5 que es el tope del parking

    do{
      Coches obj=new Coches();   
             
            System.out.println("Plazas dispoñibles");
            
//            Introducir la matricula del vehiculo

            System.out.println("Introduce la matricula del vehiculo");
            Scanner mt=new Scanner(System.in);
            obj.setMatricula(mt.nextLine());
            
            //Introducir la marca del coche
            
            System.out.println("Introduce la marca del vehiculo");
            Scanner mc=new Scanner(System.in);
            obj.setMarca(mc.nextLine());
            numeroCoches++;
            if (numeroCoches>0){
            System.out.println("¿Quieres retirar un coche?");
            Scanner op=new Scanner(System.in);
            String opcion=op.nextLine();
            if (opcion.equals("Si")){
                numeroCoches--;
//Introducir la cantidad de horas que ha estado en el garaje
            
            System.out.println("Cuantas horas ha estado dentro del garaje");
            Scanner hr=new Scanner(System.in);
            float horas1=hr.nextFloat();
            
            //Calcular cuanto tiene que pagar con las horas pedidas anteriormente
            
            double total=0;
            if (horas1<=3){
                total=1.5;
            }else if(horas1>3){
                double horas=horas1*0.20;
                total=horas+1.5;
            }
            
            System.out.println("El precio del parking es : "+total);
            
            //Pedir la cantidad de dinero que quiere utilizar para pagar el aparcamiento
            
            System.out.println("Introduce la cantidad que quieras pagar");
            Scanner cr=new Scanner(System.in);
            float cartosRecibidos=cr.nextFloat();
            
            //Se saca por pantalla la factura con todos los datos necesarios
            
            JOptionPane.showMessageDialog(null,"\nFactura\nMatricula coche : "+obj.getMatricula()+"\nTempo : "+horas1+" horas\nPrecio : "+total+"\nCartos Recibidos : "+cartosRecibidos+"\nCartos Devoltos : "+(cartosRecibidos-total)+"\n\nGRACIAS POR USAR O NOSO APARCADOIRO\n\n");                
            }
        }            
    }while (numeroCoches<5);
    if (numeroCoches==5){
        System.out.println("Completo");
    }
    }    
}
