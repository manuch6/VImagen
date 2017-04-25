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

    @Override
    public Imagen aplicarFiltro(Imagen im) {

        int Umbral = 122;

        //Color[][] color=im.imagen;
        Color[][] color = new Color[256][256];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int nuevoRojo = 0;
                int nuevoAzul = 0;
                int nuevoVerde = 0;
                int rojo = color[i][j].getRed();
                int azul = color[i][j].getBlue();
                int verde = color[i][j].getGreen();
                if (rojo > Umbral) {
                    nuevoRojo = 255;
                }
                if (azul > Umbral) {
                    nuevoAzul = 255;
                }
                if (verde > Umbral) {
                    nuevoVerde = 255;
                }

                color[i][j] = new Color(nuevoRojo, nuevoVerde, nuevoAzul);

            }

        }

        return im;

    }

}
