
package boletin14;

import Partes.CPU;
import Partes.Monitor;
import Partes.Teclado;
public class Ordenador {
    
    private Teclado te;
    private Monitor mo;
    private CPU pro;
    private float precio;

    public Ordenador(Teclado tecla, Monitor pantalla,CPU cpu, float precio) {
        this.te = tecla;
        this.mo = pantalla;
        this.pro=cpu;
        this.precio = precio;
    }

    public Ordenador() {
    }

    public Teclado getTecla() {
        return te;
    }

    public void setTecla(Teclado tecla) {
        this.te = tecla;
    }

    public Monitor getPantalla() {
        return mo;
    }

    public void setPantalla(Monitor pantalla) {
        this.mo = pantalla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public CPU getCpu() {
        return pro;
    }

    public void setCpu(CPU cpu) {
        this.pro = cpu;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "tecla=" + te +", pantalla=" + mo + ", cpu=" + pro + ", precio=" + precio + '}';
    }
    public void amosar(Ordenador or){
        System.out.println(or);
    }
    
    
}
