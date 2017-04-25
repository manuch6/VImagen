/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dci.view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Note
 */
public class PanelBotones extends JPanel{
    
    public JButton btnNegativo, btnReflejar, btnBinarizacion, btnPixels,
            btnEscalaGrises, btnConvolucion, btnExt1, btnExt2;
    
    public PanelBotones() {
        this.initComponent();
    }
    
    private void initComponent() {
        BoxLayout distribucion = new BoxLayout(this,3);
        this.setLayout(distribucion);
        
        this.btnNegativo = new JButton("Negativo");
        this.add(this.btnNegativo);

        this.btnReflejar = new JButton("Reflejar");
        this.add(this.btnReflejar);
        
        this.btnPixels = new JButton("Binarización");
        this.add(this.btnPixels);
        
        this.btnBinarizacion = new JButton("Pixels");
        this.add(this.btnBinarizacion);
        
        this.btnEscalaGrises = new JButton("Escala de Grises");
        this.add(this.btnEscalaGrises);
        
        this.btnConvolucion = new JButton("Convolución");
        this.add(this.btnConvolucion);
        
        this.btnExt1 = new JButton("Extensión 1");
        this.add(this.btnExt1);
        
        this.btnExt2 = new JButton("Extensión 2");
        this.add(this.btnExt2);

    }
    
}
