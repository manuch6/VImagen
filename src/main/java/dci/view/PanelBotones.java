/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dci.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Note
 */
public class PanelBotones extends JPanel {

    public JButton btnNegativo;
    public JButton btnBinarizacion;
    public JButton btnEscalaGrises;

    public PanelBotones() {
        this.initComponent();
    }

    private void initComponent() {
        GridLayout distribucion = new GridLayout(6, 1);
        this.setLayout(distribucion);

        this.btnNegativo = new JButton("Negativo");
        this.add(this.btnNegativo);

        this.btnBinarizacion = new JButton("Binarizacion");
        this.add(this.btnBinarizacion);

        this.btnEscalaGrises = new JButton("Escala de Grises");
        this.add(this.btnEscalaGrises);

    }

}
