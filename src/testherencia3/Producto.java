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
public class Producto {
   private String Caducidad;
   private String NumDeLote;

    @Override
    public String toString() {
        return "Producto{" + "Caducidad=" + Caducidad + ", NumDeLote=" + NumDeLote + '}';
    }

    public Producto(String Caducidad, String NumDeLote) {
        this.Caducidad = Caducidad;
        this.NumDeLote = NumDeLote;
    }

    public String getNumDeLote() {
        return NumDeLote;
    }

    public void setNumDeLote(String NumDeLote) {
        this.NumDeLote = NumDeLote;
    }

    public String getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(String Caducidad) {
        this.Caducidad = Caducidad;
    }
}
