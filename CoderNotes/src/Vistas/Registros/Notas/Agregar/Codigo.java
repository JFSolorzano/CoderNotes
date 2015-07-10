package Vistas.Registros.Notas.Agregar;

import com.alee.extended.transition.ComponentTransition;
import com.alee.laf.panel.WebPanel;
import java.awt.Cursor;

/**
 *
 * @author JSolorzano
 */
public class Codigo extends WebPanel {

    public Codigo(ComponentTransition componenteTransitorio) {
        
        initComponents();
        
        Siguiente.addActionListener(ae -> {
            
            componenteTransitorio.performTransition( new Descripcion( componenteTransitorio ) );
            
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Siguiente = new com.alee.laf.button.WebButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Codigo = new com.alee.laf.text.WebTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        Siguiente.setUndecorated ( true );
        Siguiente.setLeftRightSpacing ( 0 );
        Siguiente.setMoveIconOnPress (true);
        Siguiente.setCursor ( Cursor.getDefaultCursor () );
        //ContrasenaBoton.setIcon ( m.cargarImagen("/Material/Imagenes/Botones/iniContrasena.png",20,20) );
        //ContrasenaBoton.setPressedIcon ( m.cargarImagen("/Material/Imagenes/Botones/iniPContrasena.png",18,18));

        Codigo.setColumns(20);
        Codigo.setRows(5);
        Codigo.setInputPrompt("Ingresar Codigo Aqui!");
        Codigo.setInputPromptFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(Codigo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 740, Short.MAX_VALUE)
                .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(84, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.text.WebTextArea Codigo;
    private com.alee.laf.button.WebButton Siguiente;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
