/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia3;

/**
 *
 * @author fernandocardoce
 */
public class Fresco extends Producto{
    private String FechaEnvase;
    private String PaisOrigen;

    public Fresco(String FechaEnvase, String PaisOrigen, String Caducidad, String NumDeLote) {
        super(Caducidad, NumDeLote);
        this.FechaEnvase = FechaEnvase;
        this.PaisOrigen = PaisOrigen;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getFechaEnvase() {
        return FechaEnvase;
    }

    public void setFechaEnvase(String FechaEnvase) {
        this.FechaEnvase = FechaEnvase;
    }

    @Override
    public String toString() {
        return "Producto Fresco{" + "Caducidad=" + super.getCaducidad() +
                ", Numero de lote=" + super.getNumDeLote() + 
                ", Fecha de Envase=" + FechaEnvase + ", Pais de Origen=" + PaisOrigen + '}';
    }
    
    
    
}
