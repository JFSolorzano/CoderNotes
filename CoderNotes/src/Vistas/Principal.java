package Vistas;

import Procesos.Animacion.Transiciones;
import Vistas.Sesion.Ingreso;
import com.alee.extended.transition.ComponentTransition;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.rootpane.WebFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


/**
 *
 * @author JSolorzano
 */
public class Principal extends WebFrame {

    String OS = System.getProperty("os.name").toLowerCase();
    Ingreso ingreso;
    public static Dimension pantallaCompleta;
    public static int anchoPantalla, altoPantalla;
    Component centroPantalla;

    public Principal() {
        
        //Inicializacion de variables
        Principal.pantallaCompleta = Toolkit.getDefaultToolkit().getScreenSize();        
        Principal.anchoPantalla = pantallaCompleta.getSize().width;
        Principal.altoPantalla = pantallaCompleta.getSize().height;

        //Verificacion de OS
//        if (OS.startsWith("mac os x")) {
//
//            setWindowCanFullScreen( Principal.this, true );
//            getApplication().requestToggleFullScreen( Principal.this );
//
//        } else {
//
//            setExtendedState(WebFrame.MAXIMIZED_BOTH);
//
//        }
        
        //Expandir aplicacion a pantalla completa
//        this.setExtendedState(WebFrame.MAXIMIZED_BOTH | this.getExtendedState());
        
        //Cargar Componentes de la vista
        initComponents();
        
        this.ingreso = new Ingreso( componenteTransitorio );
        Principal.cambiarTamano( Principal.this , componenteTransitorio, 300, 275 );
        
        //Centramos y evitamos resize
        this.center();
        this.setResizable(false);
                
        //Configuraciones para el componente transitorio       
        componenteTransitorio.setTransitionEffect( Transiciones.desvanecimiento());
        componenteTransitorio.performTransition( ingreso );
        
        //    Modo Exclusivo para Videojuegos
        //    GraphicsDevice dispositivo = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        //    dispositivo.setFullScreenWindow(Principal.this);
        
        //Pintamos el fondo de blanco
        getContentPane().setBackground(Color.WHITE);
        
        //Agregamos los listeners a los componentes
        listeners();
        
        //Iniciamos la aplicacion sobre todo lo demas
        toFront();
    }

    private void listeners(){
        
        Principal.this.addComponentListener(new ComponentAdapter() {
            
            @Override
            public void componentShown(ComponentEvent e){
                //Asignamos el valor del medio de la pantalla
                centroPantalla = e.getComponent();
            
            }
            
        });
                
    }
    
    public static void cambiarTamano( WebFrame frame, ComponentTransition ct,  int ancho, int alto ){
    
        frame.setSize( ancho, alto );
        ct.setBounds( 0, 0, ancho, alto );
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componenteTransitorio = new com.alee.extended.transition.ComponentTransition();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        componenteTransitorio.setBackground(new java.awt.Color(255, 255, 255));
        componenteTransitorio.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        getContentPane().add(componenteTransitorio, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {

            WebLookAndFeel.install();
            new Principal().setVisible(true);

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.transition.ComponentTransition componenteTransitorio;
    // End of variables declaration//GEN-END:variables
}
