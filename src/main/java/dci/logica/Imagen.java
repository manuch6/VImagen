/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dci.logica;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author dci
 */
public class Imagen {

    public Color[][] bitmap;
    public int ancho;
    public int alto;

    public Color[][] getBitmap() {
        return bitmap;
    }

    public void setBitmap(Color[][] bitmap) {
        this.bitmap = bitmap;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Imagen() {
    }

    public void cargarImagen() throws FileNotFoundException, IOException {

        InputStream input = new FileInputStream("data/imagen.bmp");
        ImageInputStream imageInput = ImageIO.createImageInputStream(input);
        BufferedImage imagenL = ImageIO.read(imageInput);
        
        setAlto(imagenL.getHeight());
        setAncho(imagenL.getWidth());

        if (imagenL.getHeight() > 300) {
            setAlto(300);
        } else if (imagenL.getHeight() > 400) {
            setAncho(400);
        }

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                int pixel = imagenL.getRGB(x, y);
                Color c = new Color(pixel);
                bitmap[x][y] = c;
            }

        }

        System.out.println(alto + " - " + ancho);

    }
    public void AjustarImagen(){
        
    }

    /*public static void main(String[] args) {
        Imagen i = new Imagen();
        try {
            i.CargarImagen();
        } catch (IOException ex) {
            Logger.getLogger(Imagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

}
