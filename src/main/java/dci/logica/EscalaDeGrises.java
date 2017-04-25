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
public class EscalaDeGrises implements Filtro {

    @Override
    public Imagen aplicarFiltro(Imagen im) {
        for (int x = 0; x < im.getAncho(); x++) {
            for (int y = 0; y < im.getAlto(); y++) {
                int r = im.getBitmap()[x][y].getRed();
                int g = im.getBitmap()[x][y].getGreen();
                int b = im.getBitmap()[x][y].getBlue();
                int gris = Math.round((float) (r + g + b) / 3);
                im.getBitmap()[x][y] = new Color(gris, gris, gris);
            }
        }
        return im;
    }

}
