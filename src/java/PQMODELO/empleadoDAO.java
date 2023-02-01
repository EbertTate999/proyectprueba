
package PQMODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class empleadoDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex=new Conexion();
    int res;
    String msj;
    public List listarEMPL() {
        
        List<empleado> datos=new ArrayList<>();
        String sql="select * from empleado";
        try{
        con=conex.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            empleado u=new empleado();
            u.setId_empleado(rs.getInt("id_empleado"));
            u.setApellidos(rs.getString("apellidos"));
            u.setNombre(rs.getString("nombres"));
            u.setTelefono(rs.getString("telefono"));
            u.setDireccion(rs.getString("direccion"));
            u.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
            u.setObservaciones(rs.getString("observaciones"));
            u.setSueldo(rs.getString("sueldo"));
            u.setId_departamento(rs.getInt("id_departamento"));
            datos.add(u);
                    
        }
        }catch (Exception e){
        }
        return datos;
    }
    
}
