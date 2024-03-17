
package boletin9_5;

import javax.swing.JOptionPane;
public class LerDatos {
    
    public static int LerEntero(String mensaxe){
        int resposta=Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;
    }
    
}
