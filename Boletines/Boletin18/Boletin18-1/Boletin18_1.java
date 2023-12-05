
package boletin18_1;


public class Boletin18_1 {

    
    public static void main(String[] args) {
        
        Costo obj=new Costo();
        obj.setDia(LerDatos.lerString("Introduce el dia de la semana en el que empezó la llamada"));
        obj.setTempo(LerDatos.LerEntero("Introduce la cantidad de minutos que duró la llamada"));
        if (obj.getDia().equals("domingo")){
            obj.precio();
        }
        else{
        obj.setQuenda(LerDatos.lerString("Introduce en que quenda se inició la llamada, si en la de mañana o en la de tarde"));
        obj.precio();
    }
    
}
}