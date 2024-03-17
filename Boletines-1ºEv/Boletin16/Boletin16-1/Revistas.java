
package boletin16;


public class Revistas extends Publicacion{
    
    private int numero;
    
    public Revistas() {
    }
    
    public Revistas(int numero) {
        this.numero = numero;
    }

    public Revistas(int numero,int codigo, String titulo, String anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.numero=numero;
    }
    
    @Override
    public int getCodigo(){
        return super.getCodigo();
}
    @Override
    public String toString() {
        return super.toString()+"Revistas{" + "numero=" + numero + '}';
    }


}
