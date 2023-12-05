
package Partes;


public class Monitor {
    
    private String marca;
    private float pulgada;

    public Monitor() {
    }

    public Monitor(String marca, float pulgada) {
        this.marca = marca;
        this.pulgada = pulgada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgada() {
        return pulgada;
    }

    public void setPulgada(float pulgada) {
        this.pulgada = pulgada;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", pulgada=" + pulgada;
    }
    
    
}
