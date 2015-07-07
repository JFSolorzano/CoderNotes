package Vistas;

import Procesos.Animacion.Transiciones;
import Procesos.Utilidades;
import Vistas.Sesion.Ingreso;
import com.alee.extended.image.WebImage;
import com.alee.extended.transition.TransitionListener;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.rootpane.WebFrame;
import com.alee.utils.SwingUtils;
import javax.swing.JFrame;
import static com.apple.eawt.Application.getApplication;
import static com.apple.eawt.FullScreenUtilities.setWindowCanFullScreen;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JSolorzano
 */
public class Principal extends WebFrame {

    String OS = System.getProperty("os.name").toLowerCase();
    Ingreso ingreso;
    Timer transicion;

    public Principal() {

        this.ingreso = new Ingreso();
        this.transicion = new Timer();

        if (OS.startsWith("mac os x")) {

            setWindowCanFullScreen(Principal.this, true);
            getApplication().requestToggleFullScreen(Principal.this);

        } else {

            setExtendedState(JFrame.MAXIMIZED_BOTH);

        }
        initComponents();

        transicion.schedule(new TimerTask() {

            @Override
            public void run() {

                componenteTransitorio.performTransition(ingreso);
                transicion.cancel();

            }

        }, 5 * 1000);

        BufferedImage imagen = null;
        try {
            imagen = new Utilidades().cargarImagen("1.jpg");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        WebImage logo = new WebImage(imagen);

        componenteTransitorio.setTransitionEffect(Transiciones.corredorDesvanecimiento());
        componenteTransitorio.setContent(logo);
        componenteTransitorio.setPreferredSize(SwingUtils.max(logo, ingreso));

        try {
            Thread.sleep(4000);
            componenteTransitorio.performTransition(ingreso);

        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //    Modo Exclusivo
        //    GraphicsDevice dispositivo = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        //    dispositivo.setFullScreenWindow(Principal.this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componenteTransitorio = new com.alee.extended.transition.ComponentTransition();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        componenteTransitorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(componenteTransitorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(componenteTransitorio, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {

            new Principal().setVisible(true);

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.transition.ComponentTransition componenteTransitorio;
    // End of variables declaration//GEN-END:variables
}
