package Procesos;

import Procesos.Animacion.MargenTextField;
import Procesos.DB.Consulta;
import com.alee.laf.button.WebButton;
import com.alee.laf.text.WebTextField;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import org.imgscalr.Scalr;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author iCarlos & JSolorzano
 */
public class Utilidades {
    
    public BufferedImage cargarImagen ( String direccion, int ancho, int alto) throws IOException{
        
        URL recurso = Utilidades.class.getResource("/Recursos/Imagenes/"+direccion);
        
        return  Scalr.resize(ImageIO.read( recurso ), ancho, alto);
        
    }
    
    public BufferedImage cargarImagen ( String direccion) throws IOException{
        
        URL recurso = Utilidades.class.getResource("/Recursos/Imagenes/"+direccion);
        
        return  ImageIO.read( recurso );
        
    }
    
     public Icon cargarIcono( String archivo, int lado ) {
        
         ImageIcon imgIcono = new ImageIcon();
         Image imagen;

         try {
             imgIcono = new ImageIcon( getClass().getResource( "/Recursos/Imagenes/"+archivo ) );
             imagen = imgIcono.getImage().getScaledInstance( lado, lado, Image.SCALE_SMOOTH );
             imgIcono = new ImageIcon(imagen);

         } catch (Exception ex) {
             
             //todo

         } return imgIcono;
    }
     
     public BufferedImage textoImagen( String texto ) {

        BufferedImage imagen;
        byte[] bytes;
        
        try {
            
            BASE64Decoder decodificador = new BASE64Decoder();
            bytes = decodificador.decodeBuffer( texto );
            ByteArrayInputStream entrada;
            entrada = new ByteArrayInputStream( bytes );
            imagen = ImageIO.read( entrada );
            entrada.close();
            
            return imagen;
            
        } catch ( Exception e ) {
            
            return null;
            
        }
    }
     
     public String imagenTexto( String direccion, String tipo ) {
        
         String imageString = null;
        
         try {
            BufferedImage img = ImageIO.read(new File(direccion));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            try {
                ImageIO.write(img, tipo, bos);
                byte[] imageBytes = bos.toByteArray();

                BASE64Encoder encoder = new BASE64Encoder();
                imageString = encoder.encode(imageBytes);

                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return imageString;
        } catch (IOException ex) {
            
        }
        return imageString;
    }
     
     public void bordeMedioPersonalizado(JTextComponent txt){
     
         txt.setBackground(new Color(0, 0, 0, 0));
         txt.setBorder(new MargenTextField(
                 8,
                 6,
                 txt.getHeight(),
                 txt.getWidth(),
                 "Bordes/medio.png"
         ));
         
     }
     
     public void bordeCompletoPersonalizado(WebTextField txt){
     
         txt.setBackground(new Color(0, 0, 0, 0));
         txt.setBorder(new MargenTextField(
                 8,
                 6,
                 txt.getHeight(),
                 txt.getWidth(),
                 "Bordes/completo.png"
         ));
         
     }
     
     public void botonIconoTransparente(WebButton btn, String imagen, int cuadrado){
            
            btn.setUndecorated(true);
            btn.setLeftRightSpacing(0);
            btn.setMoveIconOnPress(true);
            btn.setIcon(cargarIcono(imagen, cuadrado));
                
     }
     
     public DefaultTableModel llenarTabla( String sentencia, Object[] datos ){
                 
         DefaultTableModel modelo = new DefaultTableModel();
         
         try {
             
             Consulta consulta = new Consulta();
             ResultSet resultado;
                          
             resultado = consulta.DML_DCL(sentencia, datos);
             ResultSetMetaData metaData = resultado.getMetaData();
             int columnas = metaData.getColumnCount();
             
             resultado.last();
             int filas = resultado.getRow();
             resultado.beforeFirst();
             
             ArrayList<Object []> registros = new ArrayList<>();
                
            while (resultado.next()) {

                for (int fila = 0; fila < filas; fila++){

                    Object[] registro = new Object[filas];

                    for ( int columna = 1; columna <= columnas; columna++ ){

                        registro[fila] = resultado.getObject( columna );

                    } filas --;

                    registros.add( registro );

                }

            } registros.stream().forEach(modelo::addRow);
                
                            
        } catch (SQLException ex) {
            
            //todo
        
        }
         
         return modelo;
         
    }
     
     public DefaultComboBoxModel llenarCombobox( String sentencia, Object [] datos ){
         
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         
         try {
         
             Consulta consulta = new Consulta();
             ResultSet resultado;
             
             resultado = consulta.DML_DCL(sentencia, datos);
             
             while ( resultado.next() ){
             
                 int id = Integer.parseInt( resultado.getObject( 1 ).toString() );
                 String contenido = resultado.getObject( 2 ).toString();
                 
                 modelo.addElement( new ComboBoxItem( contenido, id ) );
                 
             }
             
             if ( modelo.getSize() == 0 ){
                 
                 modelo.addElement("No hay elementos");
                 
             }
                                                   
         } catch (SQLException ex) {
         
             //todo
                         
         }
         
         return modelo;
         
    }
     
//     //Agregar Guion al campo de DUI
//    public static void Guion(JTextField txt){
//        if(txt.getText().trim().length()==7)txt.setText(txt.getText().trim() + "-");//Cuando en el TextBox se haya escrito el valor #7 se agregara autom. el guion
//        //Para quitarselo solo se hace esto: String DUIsinGuion = dui.replace("-","");
//    }
    
   
//    String aRemplazar="hola como estas";
//                Pattern p= Pattern.compile("[ao]");
//		Matcher m= p.matcher(aRemplazar);
//		if(m.find()){
//			String remplazado=m.replaceAll("");
//			System.out.println(remplazado); //imprime hl cm ests
//		}
    
}
