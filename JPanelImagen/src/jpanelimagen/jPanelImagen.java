/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author hdomgar0208
 */
public class jPanelImagen extends JPanel implements Serializable
{
    private imagenFondo imagenFondo;
    public jPanelImagen()
    {
       
        
    }

    public imagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(imagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if (imagenFondo!=null) {
            if (imagenFondo.getRutaImagen()!=null && imagenFondo.getRutaImagen().exists()) {
            ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
            Graphics2D g2d = (Graphics2D)g;
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
            g.drawImage(imageIcon.getImage(), 0, 0, null);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
        }
        }
        
        
    }


    
  
   
}
