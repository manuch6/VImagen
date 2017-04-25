/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dci.logica;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author dci
 */
public class EscalaDeGrises implements Filtro {

    @Override
    public Imagen aplicarFiltro(Imagen im) {
        for (int x = 0; x < im.ancho; x++) {
            for (int y = 0; y < im.alto; y++) {
                int r = im.bitmap[x][y].getRed();
                int g = im.bitmap[x][y].getGreen();
                int b = im.bitmap[x][y].getBlue();
                int gris = Math.round((float) (r + g + b) / 3);
                im.bitmap[x][y] = new Color(gris, gris, gris);
            }
        }
        return im;
    }

}
