/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diu_practica8;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;



/**
 *
 * @author Víctor y Xavi
 */
public class Lienzo extends JPanel {

    private BufferedImage imagen = null;

    public Lienzo() {
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, null);
        }
    }

    public int getImageWidth() {
        return imagen.getWidth();
    }

    public int getImageHeight() {
        return imagen.getHeight();
    }
}


