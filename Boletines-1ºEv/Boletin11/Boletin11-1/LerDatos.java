
package boletin11_1;

import javax.swing.JOptionPane;

public class LerDatos {


    public static int lerNumero(String mensaxe) {
        int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        while (dato > 50) {
            dato = LerDatos.lerNumero("El numero tiene que estar entre 1 y 50, esscribe otro numero");
        }
        while (dato < 1) {
            dato = LerDatos.lerNumero("El numero tiene que estar entre 1 y 50, esscribe otro numero");
        }
        return dato;
    }

    public static int lerIntento(String mensaxe) {
        int intentos;
        intentos = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return intentos;
    }
}
