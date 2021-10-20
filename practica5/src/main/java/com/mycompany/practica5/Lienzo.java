package com.mycompany.practica5;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Víctor
 */
public class Lienzo extends JPanel {
    private BufferedImage imagen = null;
    private BufferedImage imClonada = null;
    private BufferedImage logo = null;
    int cordx = 477; 
    int cordy = 0;

    public Lienzo(){
        try {
            imagen = ImageIO.read(new File ("rosas.jpg"));
            imClonada = ImageIO.read(new File ("rosas.jpg"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            logo = ImageIO.read(new File("batman.png"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
    }
   
@Override

public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(imClonada, 0, 0, null);
    g.drawImage(logo, cordx, cordy, null);
    
    
}
  public void cambioColor(boolean c_azul, boolean c_verde, boolean c_rojo){
        imClonada = UtilsPractica5.seleccionarComponentes(imagen, c_azul, c_verde, c_rojo);
        this.repaint();
        
    }
  public void dibujarLogo(int x, int y) {
        this.cordx = x;
        this.cordy = y;
        this.repaint();
    }
    
}