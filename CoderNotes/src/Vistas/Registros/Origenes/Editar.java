
package Vistas.Registros.Origenes;

import Procesos.Utilidades;
import java.io.IOException;


/**
 *
 * @author JSolorzano
 */
public class Editar extends javax.swing.JPanel {

    Utilidades utilidades;    
    
    public Editar() {
        
        Editar.this.utilidades = new Utilidades();
        
        initComponents();
        
        componentesPersonalizados();
    }
    
    private void componentesPersonalizados(){
        
        try {
            
            NombreImagen.setImage( utilidades.cargarImagen("Iconos/binario.png",25,25) );
            utilidades.bordeCompletoPersonalizado(Nombre);
            
        } catch (IOException ex) {
            //
        }
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraNavegacion = new com.alee.laf.panel.WebPanel();
        Contenido = new com.alee.laf.panel.WebPanel();
        Nombre = new com.alee.laf.text.WebTextField();
        NombreImagen = new com.alee.extended.image.WebImage();
        Descripcion = new com.alee.extended.image.WebImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        webTextArea1 = new com.alee.laf.text.WebTextArea();
        Editar = new com.alee.laf.button.WebButton();
        Cancelar = new com.alee.laf.button.WebButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(825, 500));
        setMinimumSize(new java.awt.Dimension(825, 500));

        Contenido.setBackground(new java.awt.Color(255, 255, 255));

        Nombre.setForeground(new java.awt.Color(51, 51, 51));
        Nombre.setDoubleBuffered(true);
        Nombre.setDrawBorder(false);
        Nombre.setDrawFocus(false);
        Nombre.setFont(new java.awt.Font("Roboto Condensed", 0, 15)); // NOI18N
        Nombre.setHideInputPromptOnFocus(false);
        Nombre.setInputPrompt("Nombre ej. Java");
        Nombre.setInputPromptFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        Nombre.setInputPromptForeground(new java.awt.Color(102, 102, 102));

        NombreImagen.setMaximumSize(new java.awt.Dimension(25, 25));
        NombreImagen.setMinimumSize(new java.awt.Dimension(25, 25));
        NombreImagen.setPreferredSize(new java.awt.Dimension(25, 25));

        Descripcion.setMaximumSize(new java.awt.Dimension(25, 25));
        Descripcion.setMinimumSize(new java.awt.Dimension(25, 25));
        Descripcion.setPreferredSize(new java.awt.Dimension(25, 25));

        webTextArea1.setColumns(20);
        webTextArea1.setRows(5);
        webTextArea1.setInputPrompt("Descripcion");
        webTextArea1.setInputPromptFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        webTextArea1.setInputPromptForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(webTextArea1);

        Editar.setText("Agregar");

        Cancelar.setText("Cancelar");

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(NombreImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ContenidoLayout.createSequentialGroup()
                                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombreImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraNavegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.panel.WebPanel BarraNavegacion;
    private com.alee.laf.button.WebButton Cancelar;
    private com.alee.laf.panel.WebPanel Contenido;
    private com.alee.extended.image.WebImage Descripcion;
    private com.alee.laf.button.WebButton Editar;
    public com.alee.laf.text.WebTextField Nombre;
    private com.alee.extended.image.WebImage NombreImagen;
    private javax.swing.JScrollPane jScrollPane1;
    private com.alee.laf.text.WebTextArea webTextArea1;
    // End of variables declaration//GEN-END:variables
}
