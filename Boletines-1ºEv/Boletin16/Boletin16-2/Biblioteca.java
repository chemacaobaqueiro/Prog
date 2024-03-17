
package boletin16;


public class Biblioteca {
    

//atributos
    
    
    private Libros libro;
    private Revistas revista;


//constructores

    public Biblioteca() {
    }

    public Biblioteca(Libros libro, Revistas revista) {
        this.libro = libro;
        this.revista = revista;
    }


    //getters y setters

    public Libros getPrestado() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public Revistas getRevista() {
        return revista;
    }

    public void setRevista(Revistas revista) {
        this.revista = revista;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Biblioteca{" + "prestado=" + libro + ", numero=" + revista + '}';
    }
    
    
}
