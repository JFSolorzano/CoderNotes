
package Procesos.DB;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * En esta clase se encuentran todas las operaciones que tienen relación con la base de datos
 * @author iCarlos & JSolorzano  
 */
public class Conexion {
    
    static HikariDataSource fuente;
    
    public static void abrir() {

        HikariConfig configuracion = new HikariConfig( "conexion.properties" );
        fuente = new HikariDataSource( configuracion );
                    
    }
    
    public static void cerrar() {
        
        fuente.close();
                
    }
    
    public void soltarConexion( Connection conexion ) throws SQLException{
        
       conexion.close();
        
    }
    
    public Connection tomarConexion() throws SQLException{
        
        Connection conexion = fuente.getConnection();
        return conexion;
        
    }
    
}
