package Procesos.DB;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author iCarlos & JSolorzano
 */
public class CRUD extends Consulta{
    
    public int crear( String consulta, Object [] parametros ) throws SQLException{
        
        return super.DML( consulta, parametros );
    
    }
    
    public int editar( String consulta, Object [] parametros ) throws SQLException{
    
        return super.DML( consulta, parametros );
    
    }
    
    public int eliminar( String consulta, Object [] parametros ) throws SQLException{
    
        return super.DML( consulta, parametros );
    
    }
    
    public ResultSet consultar( String consulta, Object [] parametros ) throws SQLException{
        return super.DML_DCL( consulta, parametros );
    }
    
}
