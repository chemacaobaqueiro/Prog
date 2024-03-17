
package boletin6.pkg2;


public class Boletin6_2 {


    public static void main(String[] args) {
        
        // Crear un satélite usando el constructor por defecto
        Satelite satelite1 = new Satelite();

        // Mostrar la posición del primer satélite
        System.out.println("Posición del primer satélite:");
        satelite1.verPosicion();
        System.out.println();

        // Crear un satélite con valores específicos
        Satelite satelite2 = new Satelite(35.5, -120.75, 500.25);

        // Mostrar la posición del segundo satélite
        System.out.println("Posición del segundo satélite:");
        satelite2.verPosicion();
    }
    }
    
