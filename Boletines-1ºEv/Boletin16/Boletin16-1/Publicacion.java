
package boletin16;


public class Publicacion {
    private int codigo;
    private String titulo;
    private String anoPublicacion;

    public Publicacion() {
    }

    public Publicacion(int codigo, String titulo, String anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

  
    public String getAnoPublicacion() {
        return anoPublicacion;
    }


    @Override
    public String toString() {
        return "Publicacion{" + "codigo=" + codigo + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + '}';
    }
    
}
