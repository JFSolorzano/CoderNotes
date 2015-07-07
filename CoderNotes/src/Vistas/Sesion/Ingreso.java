
package Vistas.Sesion;

import Procesos.Utilidades;
import com.alee.extended.image.WebImage;
import com.alee.extended.transition.TransitionListener;
import com.alee.laf.panel.WebPanel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JComponent;

/**
 *
 * @author JSolorzano
 */
public class Ingreso extends WebPanel {

    Utilidades utilidades;
    List<String> nombreImagenes;
    ArrayList<JComponent>imagenesTransitadas;
    ArrayList<JComponent> fondos;
    Random random = new Random();
    Timer tiempoFondo;
    
    public Ingreso() {
        
        this.tiempoFondo = new Timer();      
        this.utilidades = new Utilidades();        
        this.nombreImagenes = Arrays.asList("1.jpg", "2.jpg", "5.jpg", "4.jpg", "3.jpg");
        this.fondos = new ArrayList<>();
        this.imagenesTransitadas = new ArrayList<>();
                
        nombreImagenes.forEach(( String imagen) -> {
            
            try {
                
                fondos.add( new WebImage( utilidades.cargarImagen( imagen ) ) );
            
            } catch (IOException ex) {
                //Error
            }
        
        } );
        
        initComponents();        
        
        componenteTransitorio.addTransitionListener ( new TransitionListener ()
        {
            
            @Override
            public void transitionFinished ()
            {
                tiempoFondo.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        cambiarFondo();
                    }
                    
                }, 5*1000);
            }

            @Override
            public void transitionStarted() {
                System.out.println("Transicion Iniciada");
            }
            
        } );
        
    }
    
    void cambiarFondo(){
    
        if ( !fondos.isEmpty() ){
            
            componenteTransitorio.performTransition( operarFondo( fondos, imagenesTransitadas ) );
            
        }   else{
            
            componenteTransitorio.performTransition( operarFondo( imagenesTransitadas, fondos ) );
            
        }             
    
    }
    
    WebImage operarFondo( ArrayList<JComponent> listaPrincipal, ArrayList<JComponent> listaSecundaria ){
        
        int item = random.nextInt( nombreImagenes.size() );
        JComponent imagen = listaPrincipal.get( item );
        WebImage fondo = (WebImage) imagen;
        listaSecundaria.add( imagen );
        listaPrincipal.remove(item);
               
        return fondo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componenteTransitorio = new com.alee.extended.transition.ComponentTransition();
        webPanel3 = new com.alee.laf.panel.WebPanel();
        Contrasena2 = new com.alee.laf.text.WebTextField();
        Usuario2 = new com.alee.laf.text.WebTextField();
        OlvideContrasena2 = new com.alee.extended.label.WebLinkLabel();

        webPanel3.setBackground(new java.awt.Color(51, 51, 51));

        Contrasena2.setInputPrompt("Contrasena");

        Usuario2.setInputPrompt("Usuario");

        OlvideContrasena2.setForeground(new java.awt.Color(255, 255, 255));
        OlvideContrasena2.setText("Olvide Mi Contrsena");
        OlvideContrasena2.setVisitedForeground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout webPanel3Layout = new javax.swing.GroupLayout(webPanel3);
        webPanel3.setLayout(webPanel3Layout);
        webPanel3Layout.setHorizontalGroup(
            webPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, webPanel3Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addGroup(webPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OlvideContrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(webPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(webPanel3Layout.createSequentialGroup()
                            .addComponent(Contrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, webPanel3Layout.createSequentialGroup()
                            .addComponent(Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)))))
        );
        webPanel3Layout.setVerticalGroup(
            webPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OlvideContrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout componenteTransitorioLayout = new javax.swing.GroupLayout(componenteTransitorio);
        componenteTransitorio.setLayout(componenteTransitorioLayout);
        componenteTransitorioLayout.setHorizontalGroup(
            componenteTransitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, componenteTransitorioLayout.createSequentialGroup()
                .addContainerGap(669, Short.MAX_VALUE)
                .addComponent(webPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        componenteTransitorioLayout.setVerticalGroup(
            componenteTransitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componenteTransitorioLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(webPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(componenteTransitorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(componenteTransitorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.text.WebTextField Contrasena;
    private com.alee.laf.text.WebTextField Contrasena1;
    private com.alee.laf.text.WebTextField Contrasena2;
    private com.alee.extended.label.WebLinkLabel OlvideContrasena;
    private com.alee.extended.label.WebLinkLabel OlvideContrasena1;
    private com.alee.extended.label.WebLinkLabel OlvideContrasena2;
    private com.alee.laf.text.WebTextField Usuario;
    private com.alee.laf.text.WebTextField Usuario1;
    private com.alee.laf.text.WebTextField Usuario2;
    private com.alee.extended.transition.ComponentTransition componenteTransitorio;
    private com.alee.laf.panel.WebPanel webPanel1;
    private com.alee.laf.panel.WebPanel webPanel2;
    private com.alee.laf.panel.WebPanel webPanel3;
    // End of variables declaration//GEN-END:variables
}
