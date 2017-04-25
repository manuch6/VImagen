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
public class Negativo implements Filtro{

    public Negativo() {
    }

    @Override
    public Imagen aplicarFiltro(Imagen im) {
        int maxRGB = 255;
        for(int i=0; i< im.getAlto();i++){
            for(int j=0; j< im.getAncho(); j++){
                int rojo = im.getBitmap()[i][j].getRed();
                int verde = im.getBitmap()[i][j].getGreen();
                int azul = im.getBitmap()[i][j].getBlue();
                int rojoNeg = Math.abs(maxRGB-rojo);
                int verdeNeg = Math.abs(maxRGB-verde);
                int azulNeg = Math.abs(maxRGB-azul);
                im.getBitmap()[i][j] = new Color(rojoNeg,verdeNeg,azulNeg);
            }
        }
        return im;
    }
    
}
