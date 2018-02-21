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
public class Refrigerado extends Congelado{
    private String CodigoOrganismo;

    public Refrigerado(String CodigoOrganismo, Double TempMantRecomendada, String FechaEnvase, String PaisOrigen, String Caducidad, String NumDeLote) {
        super(TempMantRecomendada, FechaEnvase, PaisOrigen, Caducidad, NumDeLote);
        this.CodigoOrganismo = CodigoOrganismo;
    }

    public String getCodigoOrganismo() {
        return CodigoOrganismo;
    }

    public void setCodigoOrganismo(String CodigoOrganismo) {
        this.CodigoOrganismo = CodigoOrganismo;
    }

    @Override
    public String toString() {
        return "Producto Refrigerado{" + "Caducidad=" + super.getCaducidad() + 
                ", Numero de lote=" + super.getNumDeLote() + ", Fecha de Envase=" 
                + super.getFechaEnvase() + ", Pais de Origen=" + 
                super.getPaisOrigen() + ", Temperatura de Mantenimiento Recomendada=" 
                + super.getTempMantRecomendada() 
                + ", Codigo del Organismo Supervision Alimentaria=" + CodigoOrganismo + '}';
    }
    
    
}
