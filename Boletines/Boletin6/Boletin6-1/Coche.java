
package boletin6.pkg1;


public class Coche {
    
    private int velocidade;
    
    public Coche(){
        velocidade=0;
    }

    public void acelerar(int valor){
        int incremento=velocidade+valor;
    }
    public void frenat(int menos){
        int frenada=velocidade-menos;
    }
    public int getVelocidade() {
        return velocidade;
    }    
    
}
