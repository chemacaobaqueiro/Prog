
package boletin9_4;

import javax.swing.JOptionPane;
public class LerDatos {
    
    public static float tabla(String mensaxe){
        float dato;
        do{
            dato=Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
            System.out.println("La tabla del "+dato+" es = \n"+dato*1+"\n"+dato*2+"\n"+dato*3+"\n"+dato*4+"\n"+dato*5+"\n"+dato*6+"\n"+dato*7+"\n"+dato*8+"\n"+dato*9+"\n"+dato*10);
        }while(dato!=0);
        return dato;
    }
}
