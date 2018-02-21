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
public abstract class Congelado extends Fresco{
    private Double TempMantRecomendada;

    public Congelado(Double TempMantRecomendada, String FechaEnvase, String PaisOrigen, String Caducidad, String NumDeLote) {
        super(FechaEnvase, PaisOrigen, Caducidad, NumDeLote);
        this.TempMantRecomendada = TempMantRecomendada;
    }

    public Double getTempMantRecomendada() {
        return TempMantRecomendada;
    }

    public void setTempMantRecomendada(Double TempMantRecomendada) {
        this.TempMantRecomendada = TempMantRecomendada;
    }

    @Override
    public String toString() {
        return "Producto Congelado{"+ "Caducidad=" + super.getCaducidad() +
                ", Numero de lote=" + super.getNumDeLote() + "Fecha de Envase=" + 
                super.getFechaEnvase() + ", Pais de Origen=" + super.getPaisOrigen()
                + "Temperatura de Mantenimiento Recomendada=" + TempMantRecomendada + '}';
    }
    
}
