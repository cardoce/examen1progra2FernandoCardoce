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
public class Agua extends Congelado{
    private Double GramosSalPorLitroAgua;

    public Agua(Double GramosSalPorLitroAgua, Double TempMantRecomendada, String FechaEnvase, String PaisOrigen, String Caducidad, String NumDeLote) {
        super(TempMantRecomendada, FechaEnvase, PaisOrigen, Caducidad, NumDeLote);
        this.GramosSalPorLitroAgua = GramosSalPorLitroAgua;
    }

    public Double getGramosSalPorLitroAgua() {
        return GramosSalPorLitroAgua;
    }

    public void setGramosSalPorLitroAgua(Double GramosSalPorLitroAgua) {
        this.GramosSalPorLitroAgua = GramosSalPorLitroAgua;
    }

    @Override
    public String toString() {
        return "Agua{"+ "Caducidad=" + super.getCaducidad() +
                ", Numero de lote=" + super.getNumDeLote() + ", Fecha de Envase=" + 
                super.getFechaEnvase() + ", Pais de Origen=" + super.getPaisOrigen()
                + ", Temperatura de Mantenimiento Recomendada=" + super.getTempMantRecomendada()
                + ", Gramos de Sal por Litro de Agua=" + GramosSalPorLitroAgua + '}';
    }
    
}
