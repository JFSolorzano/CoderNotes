package Procesos.DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iCarlos & JSolorzano
 */
public class Consulta extends Conexion{
    
    int timeout = 1;
    /**
     * Data Definition Language (DDL) -> CREATE, ALTER, DROP; GRANT, REVOKE, ANALYZE, AUDIT, COMMENT
     *
     * @param consulta
     * @return
     * @throws java.sql.SQLException  */
    public boolean DDL( String consulta ) throws SQLException{

        Connection conexion = super.tomarConexion();
        
        if( conexion.isValid( timeout ) ){

            Statement sentencia;
            sentencia = conexion.createStatement();
            boolean ejecucion = sentencia.execute( consulta );
            sentencia.close();
            
            return ejecucion;

        } else{
            
            //TODO: no hay conexion
            return false;
        
        }

    }
        
    /**
     * Data Manipulation Language (DML) -> INSERT, DELETE, UPDATE
     * 
     * @param consulta
     * @param parametros
     * @return 
     * @throws java.sql.SQLException 
     */
    public int DML( String consulta, Object [] parametros ) throws SQLException{
        
        Connection conexion = super.tomarConexion();
        
        if ( conexion.isValid( timeout ) ){
                
            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement( consulta );
            int longitud = parametros.length;

            for ( int posicion =1 ; posicion < longitud ; posicion++ ){

                sentencia.setObject( posicion, parametros[ posicion-1 ] );

            }   return sentencia.executeUpdate();

        } else return -1;
        
    }
    
    /**
     * Data Manipulation Language (DML) & (DCL)-> SELECT, CALL, LOCK TABLE, MERGE
     * 
     * @param consulta
     * @param parametros
     * @return 
     * @throws java.sql.SQLException 
     */
    public ResultSet DML_DCL( String consulta, Object [] parametros ) throws SQLException{
        
        Connection conexion = super.tomarConexion();
        
        if ( conexion.isValid( timeout ) ){
                
            PreparedStatement sentencia;
            sentencia = conexion.prepareStatement( consulta );
            int longitud = parametros.length;

            if (longitud >= 1){

                for ( int posicion = 1 ; posicion < longitud ; posicion++ ){

                    sentencia.setObject( posicion, parametros[ posicion-1 ] );

                }

            }   return sentencia.executeQuery();

        } else {
            //TODO: open conection
            return null;
        }

    }
    
     /**
     * Callable Statement
     * 
     * @param consulta
     * @param parametros
     * @return 
     * @throws java.sql.SQLException 
     */
    public int CallableStatement( String consulta, Object [] parametros ) throws SQLException{
        
        Connection conexion = super.tomarConexion();
        
        if ( conexion.isValid( timeout ) ){
                
            CallableStatement cstm;
            cstm = conexion.prepareCall(consulta, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            for(int i = 0; i < parametros.length;i++){
                
                cstm.setObject(i+1, parametros[i]);
                
            }   return cstm.executeUpdate();

        } else return -1;

    }
    
    /**
     * Callable Statement With Output
     * 
     * @param consulta
     * @param parametros
     * @param objetosadevolver
     * @return 
     * @throws java.sql.SQLException 
     */
    public Object[] CallableStatementWithOutput( String consulta, Object [] parametros , int objetosadevolver) throws SQLException{
        
        Connection conexion = super.tomarConexion();
        
        if ( conexion.isValid( timeout ) ){
            
            Object[] res = new Object[objetosadevolver];
            CallableStatement cstm;
            cstm = conexion.prepareCall(consulta, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            for(int i = 0; i < parametros.length;i++){
                
                cstm.setObject(i+1, parametros[i]);
                
            }
            for(int x = 0; x < objetosadevolver;x++){
                
                cstm.registerOutParameter(x+1+parametros.length, java.sql.Types.OTHER);
                
            }
            if(cstm.executeUpdate() > 0){
                
                for(int x = 0; x < objetosadevolver;x++){
                    
                    res[x] = cstm.getObject(x+1+parametros.length);
                    
                }
                
            }   return res;

        } else return null;

    }
}
