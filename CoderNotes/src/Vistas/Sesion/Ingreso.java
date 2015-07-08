
package Vistas.Sesion;

import Procesos.Utilidades;
import Vistas.General.Menu;
import com.alee.extended.transition.ComponentTransition;
import java.awt.Cursor;
import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author JSolorzano
 */
public class Ingreso extends JPanel {

    Utilidades utilidades;
    ComponentTransition componenteTransitorioPrincipal;
//    List<String> nombreImagenes;
//    ArrayList<JComponent>imagenesTransitadas;
//    ArrayList<JComponent> fondos;
//    Random random = new Random();
//    Timer tiempoFondo;
//    int anchoPantalla, altoPantalla;
//    Dimension pantallaCompleta;
    
    public Ingreso( ComponentTransition componenteTransitorioPrincipal ) {
        
        Ingreso.this.utilidades = new Utilidades();
        Ingreso.this.componenteTransitorioPrincipal = componenteTransitorioPrincipal;
        initComponents();
        componentesPersonalizados();
        listeners();
        try {
            
            Logo.setImage(utilidades.cargarImagen("logo.png", 105, 100));
        
        } catch (IOException ex) {
            //
        }
            //Inicializacion de los niveles
//        Ingreso.this.anchoPantalla = Principal.anchoPantalla;
//        Ingreso.this.altoPantalla = Principal.altoPantalla;
//        Ingreso.this.pantallaCompleta = Principal.pantallaCompleta;
//        Ingreso.this.tiempoFondo = new Timer();
                
//        Ingreso.this.nombreImagenes = Arrays.asList("1.jpg", "2.jpg", "5.jpg", "4.jpg", "3.jpg");
//        Ingreso.this.fondos = new ArrayList<>();
//        Ingreso.this.imagenesTransitadas = new ArrayList<>();
            
            
//        //Damos valor a las dimensiones del panel
//        ingresoPanel.setBounds(
//                0,
//                ( ( altoPantalla/2 ) - ( altoPantalla - 75 ) ),
//                anchoPantalla,
//                ( altoPantalla/3 ) 
//        );
            
            //Cargamos las imagenes al array
//        cargarImagenes();
            
            //Inicializamos los componenetes
       
//        //Runnable que cambiara el fondo cada 5 segundos
//        Runnable cambiar = () -> {
//            cambiarFondo();
//        };
//
//        //Configuraciones del runnable
//        ScheduledExecutorService servicio = Executors.newSingleThreadScheduledExecutor();
//        servicio.scheduleAtFixedRate(cambiar, 0, 5, TimeUnit.SECONDS);
        repaint();
                        
    }
    
    private void componentesPersonalizados(){
    
       utilidades.botonIconoTransparente(UsuarioBoton, "Botones/usuario.png", 20);
       utilidades.botonIconoTransparente(ContrasenaBoton, "Botones/contrasena.png", 20);
       utilidades.botonIconoTransparente(Ingresar, "Botones/siguiente.png", 20);
        
        utilidades.bordeMedioPersonalizado(Usuario);
        utilidades.bordeMedioPersonalizado(Contrasena);
              
    }
    
    private void listeners(){
    
        Ingresar.addActionListener( ae -> {
            
            //Hacer la transicion a el Menu
            componenteTransitorioPrincipal.performTransition(new Menu( componenteTransitorioPrincipal ));
        
        });
    
        
    }
    
    
    
//    private void cargarImagenes(){
//    
//        //Recorremos el arreglo con el nombre de las imagenes
//        nombreImagenes.forEach(( String imagen) -> {
//            
//            try {
//                
//                //Agregamos al arreglo fondos las imagenes
//                fondos.add( new WebImage( utilidades.cargarImagen(imagen, anchoPantalla, altoPantalla) ) );
//            
//            } catch (IOException ex) {
//                //Error
//            }
//        
//        } );
//    
//    }
    
//    private void cambiarFondo(){
//    
//        
//        
//        if ( !fondos.isEmpty() ){
//            
//            componenteTransitorioLocal.performTransition( operarFondo( fondos, imagenesTransitadas ) );
//            
//        }   else{
//            
//            componenteTransitorioLocal.performTransition( operarFondo( imagenesTransitadas, fondos ) );
//            
//        }             
//    
//    }
    
//    WebImage operarFondo( ArrayList<JComponent> listaPrincipal, ArrayList<JComponent> listaSecundaria ){
//        
//        int item = random.nextInt( listaPrincipal.size() );
//        JComponent imagen = listaPrincipal.get( item );
//        WebImage fondo = (WebImage) imagen;
//        listaSecundaria.add( imagen );
//        listaPrincipal.remove(item);
//        System.out.println("OperarFondo "+item);
//               
//        return fondo;
//    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ingresar = new com.alee.laf.button.WebButton();
        Usuario = new com.alee.laf.text.WebTextField();
        OlvideContrasena = new com.alee.extended.label.WebLinkLabel();
        Contrasena = new com.alee.laf.text.WebPasswordField();
        ContrasenaBoton = new com.alee.laf.button.WebButton();
        UsuarioBoton = new com.alee.laf.button.WebButton();
        Logo = new com.alee.extended.image.WebImage();

        setBackground(new java.awt.Color(255, 255, 255));

        Ingresar.setUndecorated ( true );
        Ingresar.setLeftRightSpacing ( 0 );
        Ingresar.setMoveIconOnPress (true);
        Ingresar.setCursor ( Cursor.getDefaultCursor () );
        //ContrasenaBoton.setIcon ( m.cargarImagen("/Material/Imagenes/Botones/iniContrasena.png",20,20) );
        //ContrasenaBoton.setPressedIcon ( m.cargarImagen("/Material/Imagenes/Botones/iniPContrasena.png",18,18));

        Usuario.setForeground(new java.awt.Color(51, 51, 51));
        Usuario.setDoubleBuffered(true);
        Usuario.setDrawBorder(false);
        Usuario.setDrawFocus(false);
        Usuario.setFont(new java.awt.Font("Roboto Condensed", 0, 15)); // NOI18N
        Usuario.setHideInputPromptOnFocus(false);
        Usuario.setInputPrompt("Usuario");
        Usuario.setInputPromptFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        Usuario.setInputPromptForeground(new java.awt.Color(102, 102, 102));

        OlvideContrasena.setForeground(new java.awt.Color(0, 153, 153));
        OlvideContrasena.setText("Olvide mis datos...");
        OlvideContrasena.setFont(new java.awt.Font("Roboto Condensed", 0, 15)); // NOI18N
        OlvideContrasena.setVisitedForeground(new java.awt.Color(153, 0, 153));

        Contrasena.setForeground(new java.awt.Color(51, 51, 51));
        Contrasena.setDrawBorder(false);
        Contrasena.setDrawFocus(false);
        Contrasena.setEchoChar('■');
        Contrasena.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Contrasena.setHideInputPromptOnFocus(false);
        Contrasena.setInputPrompt("Contrasena");
        Contrasena.setInputPromptFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        Contrasena.setInputPromptForeground(new java.awt.Color(102, 102, 102));

        UsuarioBoton.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OlvideContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContrasenaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsuarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsuarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContrasenaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OlvideContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.alee.laf.text.WebPasswordField Contrasena;
    private com.alee.laf.button.WebButton ContrasenaBoton;
    private com.alee.laf.button.WebButton Ingresar;
    private com.alee.extended.image.WebImage Logo;
    private com.alee.extended.label.WebLinkLabel OlvideContrasena;
    public com.alee.laf.text.WebTextField Usuario;
    public com.alee.laf.button.WebButton UsuarioBoton;
    // End of variables declaration//GEN-END:variables
}
