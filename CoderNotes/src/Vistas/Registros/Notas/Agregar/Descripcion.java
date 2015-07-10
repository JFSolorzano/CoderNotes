/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Registros.Notas.Agregar;

import com.alee.extended.transition.ComponentTransition;
import com.alee.laf.panel.WebPanel;
import java.awt.Cursor;

/**
 *
 * @author JSolorzano
 */
public class Descripcion extends WebPanel {

    public Descripcion( ComponentTransition componenteTransitorio ) {
        
        initComponents();
        
        Aceptar.addActionListener(ae -> {
            
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new com.alee.laf.text.WebTextArea();
        Aceptar = new com.alee.laf.button.WebButton();

        setBackground(new java.awt.Color(255, 255, 255));

        Descripcion.setColumns(20);
        Descripcion.setRows(5);
        Descripcion.setInputPrompt("Ingresar la Descripcion del Codigo Aqui!");
        Descripcion.setInputPromptFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(Descripcion);

        Aceptar.setUndecorated ( true );
        Aceptar.setLeftRightSpacing ( 0 );
        Aceptar.setMoveIconOnPress (true);
        Aceptar.setCursor ( Cursor.getDefaultCursor () );
        //ContrasenaBoton.setIcon ( m.cargarImagen("/Material/Imagenes/Botones/iniContrasena.png",20,20) );
        //ContrasenaBoton.setPressedIcon ( m.cargarImagen("/Material/Imagenes/Botones/iniPContrasena.png",18,18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton Aceptar;
    private com.alee.laf.text.WebTextArea Descripcion;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
