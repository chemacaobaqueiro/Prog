package boletin6.pkg3;


public class Boletin6_3 {

    public static void main(String[] args) {
        // Crear un objeto Circulo con constructor sin parámetros
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(3.0);

        // Mostrar información del círculo 1
        System.out.println("Círculo 1:");
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Lonxitude: " + circulo1.calcularLonxitude());
        System.out.println();

        // Crear un objeto Circulo con constructor con parámetros
        Circulo circulo2 = new Circulo(7.5);

        // Mostrar información del círculo 2
        System.out.println("Círculo 2:");
        System.out.println("Radio: " + circulo2.getRadio());
        System.out.println("Área: " + circulo2.calcularArea());
        System.out.println("Lonxitude: " + circulo2.calcularLonxitude());
    }
}

