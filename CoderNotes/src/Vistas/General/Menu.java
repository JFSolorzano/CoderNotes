package Vistas.General;

import Procesos.Utilidades;
import Vistas.Principal;
import com.alee.extended.transition.ComponentTransition;
import com.alee.extended.transition.TransitionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
        listeners();

        List<Avatar> opciones = new ArrayList<>();
        try {

            opciones.add(new Avatar("Lenguajes", utilidades.cargarImagen("Menu/lenguajes.png", 75, 75)));
            opciones.add(new Avatar("OS's", utilidades.cargarImagen("Menu/os.png", 75, 75)));
            opciones.add(new Avatar("Notas", utilidades.cargarImagen("Menu/notas.png", 75, 75)));
            MenuOpciones.setAvatars(opciones);
            MenuOpciones.setAvatarIndex(2);
            
            
            
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
        
        MenuOpciones.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                
                switch (MenuOpciones.getSelectedtitulo()) {
                    case "Lenguajes":
                        componenteTransitorioPrincipal.performTransition(new Vistas.Registros.Origenes.Ver());
                        break;
                    case "OS's":
                        componenteTransitorioPrincipal.performTransition(new Vistas.Registros.Origenes.Ver());
                        break;
                    case "Notas":
                        componenteTransitorioPrincipal.performTransition(new Vistas.Registros.Notas.Ver());
                        break;
                }
            
            }
        
        });
        
        MenuOpciones.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyPressed(KeyEvent e){
                
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    
                    switch (MenuOpciones.getSelectedtitulo()) {
                        case "Lenguajes":
                            componenteTransitorioPrincipal.performTransition(new Vistas.Registros.Origenes.Ver());
                            break;
                        case "OS's":
                            componenteTransitorioPrincipal.performTransition(new Vistas.Registros.Origenes.Ver());
                            break;
                        case "Notas":
                            componenteTransitorioPrincipal.performTransition(new Vistas.Registros.Notas.Ver());
                            break;
                    }
                    
                }
                
            }
            
        });
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraNavegacion = new com.alee.laf.panel.WebPanel();
        MenuOpciones = new panel.PanelAvatarChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(825, 408));
        setMinimumSize(new java.awt.Dimension(825, 408));

        MenuOpciones.setColorPrimario(new java.awt.Color(255, 255, 255));
        MenuOpciones.setColorSecundario(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarraNavegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(BarraNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MenuOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.panel.WebPanel BarraNavegacion;
    private panel.PanelAvatarChooser MenuOpciones;
    // End of variables declaration//GEN-END:variables
}
