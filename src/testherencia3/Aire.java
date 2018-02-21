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
public class Aire extends Congelado{
    private Double PorNitrogeno;
    private Double PorOxigeno;
    private Double PorDioxidoCarbono;
    private Double PorVapor;

    public Aire(Double PorNitrogeno, Double PorOxigeno, Double PorDioxidoCarbono, Double PorVapor, Double TempMantRecomendada, String FechaEnvase, String PaisOrigen, String Caducidad, String NumDeLote) {
        super(TempMantRecomendada, FechaEnvase, PaisOrigen, Caducidad, NumDeLote);
//        Verifica que los porcentajes sumando sean el 100% de la composicion del Aire
        if((PorNitrogeno + PorOxigeno + PorDioxidoCarbono + PorVapor) == 100){
        this.PorNitrogeno = PorNitrogeno;
        this.PorOxigeno = PorOxigeno;
        this.PorDioxidoCarbono = PorDioxidoCarbono;
        this.PorVapor = PorVapor;
        }else{
            System.out.println("ERROR al crear Producto congelado Aire: Los % de Nitrogeno, Oxigeno, CO2 y Vapor no suman el 100% de la composicion del aire no se ha creado el objeto");
        }
    }

    public Double getPorNitrogeno() {
        return PorNitrogeno;
    }

    public void setPorNitrogeno(Double PorNitrogeno) {
        this.PorNitrogeno = PorNitrogeno;
    }

    public Double getPorOxigeno() {
        return PorOxigeno;
    }

    public void setPorOxigeno(Double PorOxigeno) {
        this.PorOxigeno = PorOxigeno;
    }

    public Double getPorDioxidoCarbono() {
        return PorDioxidoCarbono;
    }

    public void setPorDioxidoCarbono(Double PorDioxidoCarbono) {
        this.PorDioxidoCarbono = PorDioxidoCarbono;
    }

    public Double getPorVapor() {
        return PorVapor;
    }

    public void setPorVapor(Double PorVapor) {
        this.PorVapor = PorVapor;
    }

    @Override
    public String toString() {
        return "Aire{" + "Caducidad=" + super.getCaducidad() +
                ", Numero de lote=" + super.getNumDeLote() + ", Fecha de Envase=" + 
                super.getFechaEnvase() + ", Pais de Origen=" + super.getPaisOrigen()
                + ", Temperatura de Mantenimiento Recomendada=" + super.getTempMantRecomendada()
                + ", % de Nitrogeno=" + PorNitrogeno + ", % de Oxigeno=" + PorOxigeno 
                + ", % de Dioxido de Carbono=" + PorDioxidoCarbono + ", % de Vapor=" + PorVapor + '}';
    }
    
    
}
