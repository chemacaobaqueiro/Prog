
package boletin.pkg15;

import javax.swing.JOptionPane;
public class LerDatos {
    
    public static int LerEntero(String mensaxe){
    return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    public static float lerFloatPositivo(String mensaxe){
        float dato;
        do{
            dato=Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        }while(dato<=0);
        return dato;
    }
}
