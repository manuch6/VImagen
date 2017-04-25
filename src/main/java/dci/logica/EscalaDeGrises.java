/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dci.logica;

/**
 *
 * @author dci
 */
public class EscalaDeGrises implements Filtro {

    @Override
    public Imagen aplicarFiltro(Imagen im) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int r = 1;
                int g = 2;
                int b = 3;
                int gris = Math.round((float) (r + g + b) / 3);
            }
        }
        return new Imagen();
    }

}
