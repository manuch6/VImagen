/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dci.view;

import dci.logica.Imagen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Note
 */
public class PanelImagen extends JPanel{
    
    public Imagen imagen;
    BufferedImage img;
    ImageIcon icon;
    JLabel label;
    
    public PanelImagen(){
        this.initComponent();
    }
    
    private void initComponent(){
        
        BoxLayout distribucion = new BoxLayout(this,1);
        this.setLayout(distribucion);
        
        try {
            
            //img = ImageIO.read(new File(imagen.getPath()));
            img = ImageIO.read(new File("data/imagen.bmp"));
            icon = new ImageIcon(img);
            label = new JLabel(icon);
        
            this.add(label);
            
        } catch (IOException ex) {
            Logger.getLogger(PanelImagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
