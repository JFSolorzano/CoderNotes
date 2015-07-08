package Procesos.Animacion;

import Procesos.Utilidades;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class MargenTextField implements Border {

    private BufferedImage imagen;
    private int fondo;
    private int izquierda;

    /**
     * Este metodo permite cambiar el borde de una caja de texto.
     * @param izquierda
     * @param fondo
     * @param alto
     * @param archivo
     * @param ancho
     */
    public MargenTextField(int izquierda, int fondo, int alto, int ancho, String archivo) {
        try {
            
            this.imagen = new Utilidades().cargarImagen(archivo);
            this.fondo = fondo;
            this.izquierda = izquierda;
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public MargenTextField(int izquierda, int fondo, String archivo) {
        try {
            
            this.imagen = new Utilidades().cargarImagen( archivo );
            this.fondo = fondo;
            this.izquierda = izquierda;
        
        } catch (IOException ex) {
            Logger.getLogger(MargenTextField.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(
                imagen, 
                x, 
                y + height - ( imagen.getHeight() ),
                c
        );
    }

    @Override
    public Insets getBorderInsets(Component c) {
        
        return new Insets(0, izquierda, fondo, 0);
    
    }

    @Override
    public boolean isBorderOpaque() {
        
        return false;
    
    }

}
