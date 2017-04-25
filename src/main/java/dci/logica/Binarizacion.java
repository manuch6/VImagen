/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dci.logica;

import java.awt.Color;

/**
 *
 * @author dci
 */
public class Binarizacion implements Filtro {
    
    Binarizacion(){}
    

    @Override
    public Imagen aplicarFiltro(Imagen im) {
        int Umbral = 122;
        for (int i = 0; i < im.getAncho(); i++) {
            for (int j = 0; j < im.getAlto(); j++) {
                int rojo = im.getBitmap()[i][j].getRed();
                int azul = im.getBitmap()[i][j].getBlue();
                int verde = im.getBitmap()[i][j].getGreen();
                int nuevoRojo = rojo < Umbral ? 0 : 255;
                int nuevoAzul = azul < Umbral ? 0 : 255;
                int nuevoVerde = verde < Umbral ? 0 : 255;
                im.getBitmap()[i][j] = new Color(nuevoRojo, nuevoVerde, nuevoAzul);
            }
        }
        return im;
    }

}
