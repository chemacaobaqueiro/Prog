
package boletin9_1;

import javax.swing.JOptionPane;
public class LerDatos {
    
    public static int LerEntero(String mensaxe){
        int resposta=Integer.parseInt(JOptionPane.showInputDialog(mensaxe));

        return resposta;

//        posible
//                return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
//                return Integer.parseInt(JOptionPane.showInputDialog(mensaxe2));
    }
    
}
