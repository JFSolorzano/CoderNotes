package Vistas.General;

import Procesos.Utilidades;
import Vistas.Principal;
import com.alee.extended.transition.ComponentTransition;
import com.alee.extended.transition.TransitionAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import panel.Avatar;


/**
 *
 * @author JSolorzano
 */
public class Menu extends javax.swing.JPanel {

    Utilidades utilidades;
    ComponentTransition componenteTransitorioPrincipal;

    public Menu(ComponentTransition componenteTransitorioPrincipal) {

        Principal.principal.center();

        Menu.this.componenteTransitorioPrincipal = componenteTransitorioPrincipal;
        Menu.this.utilidades = new Utilidades();

        initComponents();

        List<Avatar> opciones = new ArrayList<>();
        try {

            opciones.add(new Avatar("Lenguajes", utilidades.cargarImagen("Menu/lenguajes.png", 75, 75)));
            opciones.add(new Avatar("OS's", utilidades.cargarImagen("Menu/os.png", 75, 75)));
//            MenuOpciones.setAvatars(opciones);

            
            
        } catch (IOException ex) {
            //
        }

    }

    private void listeners() {

        componenteTransitorioPrincipal.addTransitionListener(new TransitionAdapter() {
            @Override
            public void transitionStarted() {

            }

        });
        
//        MenuOpciones.addMouseListener(new () {
//            @Override
//            public void mouseClick(){
//            
//            }
//        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
