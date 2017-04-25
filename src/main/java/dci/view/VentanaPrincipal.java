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
import javax.swing.ImageIcon;
import javax.swing.UIManager;
/**
 *
 * @author dci
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    
    private PanelBotones panelBotones;
    private PanelImagen panelImagen;
    
     public VentanaPrincipal() {

         try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e){
            System.out.println("UIManager Exception : "+e);
        }
         
        this.initComponents();
    }

    private void initComponents() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(382,236);
        
        this.panelBotones = new PanelBotones();
        this.panelBotones.btnNegativo.addActionListener(this);
        this.panelImagen = new PanelImagen();

        this.add(this.panelImagen, BorderLayout.CENTER);
        this.add(this.panelBotones, BorderLayout.EAST);

        //this.setSize(this.panelImagen.label.getWidth(), this.panelImagen.label.getHeight());
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.panelBotones.btnNegativo == e.getSource()) {

            this.panelImagen.imagen = ControladorFiltro.ejecutarFiltro(new Negativo(), this.panelImagen.imagen);
            
        }

    }

 
   
}
