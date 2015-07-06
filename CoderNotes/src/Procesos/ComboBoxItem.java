package Procesos;

public class ComboBoxItem {
    
    private final String contenido;
    private final int id;
 
    public ComboBoxItem( String contenido, int id ){
        
        this.contenido = contenido;
        this.id = id;
    
    }
 
    public int id(){
        
      return id;
    
    }
 
    public String contenido(){
      
        return contenido;
    
    }  
    
}
