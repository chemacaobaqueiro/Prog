
package boletin16;


public class Libros extends Publicacion{
    
    private Boolean prestado=false;

    public Libros(Boolean prestado) {
        this.prestado=prestado;
    }

    public Libros(Boolean prestado,String codigo, String titulo, String anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.prestado=prestado;
        
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString()+"Libros{" + "prestado=" + prestado + '}';
    }
    
}
