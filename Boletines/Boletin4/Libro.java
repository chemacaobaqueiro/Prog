
package boletin.pkg4;


public class Libro {
    //crear atributos de la clase libro
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    //listos todos los atributos
    
    //crear los constructores
    public Libro(){
        
    }
    public Libro(String t,String au,int an,short np,float v){
        titulo=t;
        autor=au;
        ano=an;
        numPaginas=np;
        valoracion=v;
    }
    
    //hacer los metodos de acceso
    
    public void OrganizacionLibro(){
        System.out.println("Las caracteristicas del libro son: \nEl titulo es: "+titulo+"\nEl autor es: "+autor+"\nEl año de publicacion: "+ano+"\nEl numero de paginas es: "+numPaginas+"\nLa valoracion del libro es: "+valoracion);
    }
    
}
