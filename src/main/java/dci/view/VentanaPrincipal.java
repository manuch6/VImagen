/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dci.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import dci.logica.ControladorFiltro;
import dci.logica.Negativo;
/**
 *
 * @author dci
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    
    private PanelBotones panelBotones;
    private PanelImagen panelImagen;
    
     public VentanaPrincipal() {
        this.initComponents();
    }

    private void initComponents() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 300);
        
        this.panelBotones = new PanelBotones();
        this.panelImagen = new PanelImagen();
       
        this.add(this.panelImagen, BorderLayout.CENTER);
        this.add(this.panelBotones, BorderLayout.EAST);

        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.panelBotones.btnNegativo == e.getSource()) {
            
            //this.panelImagen.imagen = ControladorFiltro.ejecutarFiltro(new Negativo(), this.panelImagen.imagen);
       
        }

    }

 
   
}
