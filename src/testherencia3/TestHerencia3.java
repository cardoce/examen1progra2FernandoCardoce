/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia3;

import java.util.ArrayList;

/**
 *
 * @author Fernando Cardoce Castelnau
 */
public class TestHerencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        Fresco prdFresco1 = new Fresco("12/2/2017",  "Costa Rica",  "12/8/2019",  "A12");
        Fresco prdFresco2 = new Fresco("12/1/2018",  "Mexico",  "12/7/2021",  "M56");
        Refrigerado prdRefrigerado1 = new Refrigerado("AD453GD1", 3.56, "30/5/2017",  "USA",  "12/7/2021",  "T78");
        Refrigerado prdRefrigerado2 = new Refrigerado("45TF45Y5", 12.45, "2/1/2017",  "USA",  "12/7/2021",  "T34");
        Refrigerado prdRefrigerado3 = new Refrigerado("2RFD433f", -32.2, "5/1/2017",  "USA",  "12/7/2021",  "T90");
        Agua prdCongeladoAgua1 = new Agua(20.5, 0.0, "28/1/2018",  "USA",  "12/7/2035",  "A01");
        Agua prdCongeladoAgua2 = new Agua(14.0, 0.0, "1/3/2018",  "USA",  "1/1/2035",  "A02");
        Aire prdCongeladoAire1 = new Aire(25.0,25.0,25.0, 25.0, -23.0, "1/3/2018",  "USA",  "1/1/2035",  "O02");
        Aire prdCongeladoAire2 = new Aire(12.0,38.0,10.0, 40.0, -23.0, "1/3/2018",  "USA",  "1/1/2035",  "O02");
        Nitrogeno prdNitrogeno = new Nitrogeno("Expo directa", 35.0, 0.0, "2/2/2017",  "Alemania",  "1/2/2040",  "N01");
        
//      Agregar productos a lista de productos
        listaProductos.add(prdFresco1);
        listaProductos.add(prdFresco2);
        listaProductos.add(prdRefrigerado1);
        listaProductos.add(prdRefrigerado2);
        listaProductos.add(prdRefrigerado3);
        listaProductos.add(prdCongeladoAgua1);
        listaProductos.add(prdCongeladoAgua2);
        listaProductos.add(prdCongeladoAire1);
        listaProductos.add(prdCongeladoAire2);
        listaProductos.add(prdNitrogeno);
        
        
        System.out.println("Lista de productos:");
        for(Producto producto : listaProductos){
            System.out.println("Producto #"+(listaProductos.indexOf(producto)+1));
            System.out.println(producto.toString());
        }
    }
    
}
