
package boletin18_1;


public class Costo {
    
    private int tempo;
    private String dia;
    private String quenda;

    public Costo() {
    }

    public Costo(int tempo, String dia, String quenda) {
        this.tempo = tempo;
        this.dia = dia;
        this.quenda = quenda;
    }
    
    // Setters y Getters para poner los datos del tiempo que ha estado en llamada, el dia de la semana y la quenda que estuvo

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getQuenda() {
        return quenda;
    }

    public void setQuenda(String quenda) {
        Costo obj=new Costo();
        switch (quenda) {
            case "mañana":
                this.quenda=quenda;
                break;
            case "tarde":
                this.quenda=quenda;
                break;
            default:
                obj.setQuenda(LerDatos.lerString("Introduce una quenda válida"));
                break;
        }
    }
    
    // Metodos para calcular la cantidad a pagar
    
    public void precio(){
        double precio=0;
        if (tempo<=5){
            precio=1;
        }else if (tempo<=8&&tempo>5){
            precio=1.8;
        }else if (tempo<10&&tempo>8){
            precio=2.5;
        }else if (tempo>10){
            precio=2.5+(tempo-10)*0.5;
        }
        if (dia.equals("domingo")) {
                        MostrarDatos.mostrarDatos("El precio a pagar es : "+((precio*0.03)+precio));
        } else if (quenda.equals("mañana")){
            MostrarDatos.mostrarDatos("El precio a pagar es : "+((precio*0.15)+precio));
        }else if (quenda.equals("tarde")){
            MostrarDatos.mostrarDatos("El precio a pagar es : "+((precio*0.1)+precio));
        }
        }
}
