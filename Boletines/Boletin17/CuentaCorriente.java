
package boletin17;


public class CuentaCorriente extends Conta{
    
    private final double INTERES_FIJO=1.5d;

    public CuentaCorriente() {
    }

    public CuentaCorriente(long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "INTERES_FIJO=" + INTERES_FIJO + '}';
    }
    
    
}
