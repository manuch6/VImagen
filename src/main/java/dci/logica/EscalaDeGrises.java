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
        BufferedImage image = null;
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Color clr = new Color(image.getRGB(x, y));
                int r = clr.getRed();
                int g = clr.getGreen();
                int b = clr.getBlue();
                int gris = Math.round((float) (r + g + b) / 3);
                Color clr2 = new Color(gris, gris, gris);
                image.setRGB(x, y, clr2.getRGB());
            }
        }
        return new Imagen();
    }

}
