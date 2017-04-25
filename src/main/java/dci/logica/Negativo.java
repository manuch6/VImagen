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
//        for(int i=0; i< im.largo;i++){
//            for(int j=0; j< im.ancho; j++){
//                int rojo = im.imagen()[i][j].getRed();
//                int verde = im.imagen()[i][j].getGreen();
//                int azul = im.imagen()[i][j].getBlue();
//                int rojoNeg = Math.abs(maxRGB-rojo);
//                int verdeNeg = Math.abs(maxRGB-verde);
//                int azulNeg = Math.abs(maxRGB-azul);
//                im.imagen()[i][j] = new Color(rojoNeg,verdeNeg,azulNeg);
//            }
//        }
        return im;
    }
    
}
