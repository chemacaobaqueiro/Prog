
package boletin18_1;

import javax.swing.JOptionPane;
public class LerDatos {
    
    public static int LerEntero(String mensaxe){
        int resposta=Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;
    }
    
    public static float lerFloatPositivo(String mensaxe){
        float dato;
        do{
            dato=Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        }while(dato<=0);
        return dato;
    }
    public static String lerString(String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
    }
}
