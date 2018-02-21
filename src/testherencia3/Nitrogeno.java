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
public class Nitrogeno extends Congelado{
    private String MetodoCongelacion;
    private Double TiempoExposicion;

    public Nitrogeno(String MetodoCongelacion, Double TiempoExposicion, Double TempMantRecomendada, String FechaEnvase, String PaisOrigen, String Caducidad, String NumDeLote) {
        super(TempMantRecomendada, FechaEnvase, PaisOrigen, Caducidad, NumDeLote);
        this.MetodoCongelacion = MetodoCongelacion;
        this.TiempoExposicion = TiempoExposicion;
    }

    public Double getTiempoExposicion() {
        return TiempoExposicion;
    }

    public void setTiempoExposicion(Double TiempoExposicion) {
        this.TiempoExposicion = TiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return MetodoCongelacion;
    }

    public void setMetodoCongelacion(String MetodoCongelacion) {
        this.MetodoCongelacion = MetodoCongelacion;
    }

    @Override
    public String toString() {
        return "Nitrogeno{"+ "Caducidad=" + super.getCaducidad() +
                ", Numero de lote=" + super.getNumDeLote() + ", Fecha de Envase=" + 
                super.getFechaEnvase() + ", Pais de Origen=" + super.getPaisOrigen()
                + ", Temperatura de Mantenimiento Recomendada=" + super.getTempMantRecomendada()
                + ", MetodoCongelacion=" + MetodoCongelacion + ", TiempoExposicion="
                + TiempoExposicion + '}';
    }
    
}
