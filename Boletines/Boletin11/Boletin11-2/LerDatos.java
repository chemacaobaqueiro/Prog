
package boletin11_2;

import javax.swing.JOptionPane;
public class LerDatos {
    
    
    public static int lerIntento(String mensaxe){
        int intento;
        intento=Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return intento;
    }
    }
