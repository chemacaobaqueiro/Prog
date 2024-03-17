
package boletin9_3;
import javax.swing.JOptionPane;
public class DoWhile {
    
    public static float calcularArea(String mensaxe){
        float base;
        float altura;
        float area;
        do{
            base=Float.parseFloat(JOptionPane.showInputDialog("Introduce la base"));
            
            
        }while(base<0);
        do{
            altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
        }while(altura<0);
        area=base*altura;
        System.out.println("El area es : "+area);
        return area;

    }
    
}
