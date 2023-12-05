package boletin6.pkg3;

import java.lang.Math;

public class Circulo {
    // Atributos
    private double radio;
    private final double Pi = 3.14;

    // Constructores
    public Circulo() {
        // Constructor sin parámetros
    }

    public Circulo(double radio) {
        // Constructor con parámetros
        this.radio = radio;
    }

    // Métodos de acceso
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Pi * Math.pow(radio, 2);
    }

    // Método para calcular la longitud de la circunferencia
    public double calcularLonxitude() {
        return 2 * Pi * radio;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear un objeto Circulo
        Circulo miCirculo = new Circulo(5.0);

        // Acceder al radio
        System.out.println("Radio: " + miCirculo.getRadio());

        // Calcular y mostrar el área
        System.out.println("Área: " + miCirculo.calcularArea());

        // Calcular y mostrar la longitud de la circunferencia
        System.out.println("Lonxitude: " + miCirculo.calcularLonxitude());
    }
}
