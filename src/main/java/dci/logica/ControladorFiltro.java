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
public class ControladorFiltro {
    
    public static Imagen ejecutarFiltro(Filtro f, Imagen im){
    
        return f.aplicarFiltro(im);
    }
    
}
