
package PQMODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class departamentoDAO implements Interfase_SW_DEPART{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex=new Conexion();
    int res;
    String msj;
    public List listarDEPART() {
        
        List<departamento> datos=new ArrayList<>();
        String sql="select * from departamento";
        try{
        con=conex.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            departamento u=new departamento();
            u.setId_departamento(rs.getInt("id_departamento"));
            u.setNombre(rs.getString("nombre"));
            datos.add(u);
                    
        }
        }catch (Exception e){
        }
        return datos;
        
        //To change body of generated methods, choose Tools | Templates.
    }
    public String add(int id_departamento, String nombre) {
        String sql="insert into departamento (nombre) values(?)";
        try{
           con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,nombre);
            res=ps.executeUpdate();
            if (res==1){
            msj="departamento agregado";
            }else {
            msj="ERROR";
            } 
        }catch (Exception e){
            
        }return msj;
        
        } 
    public String edit (String  id, String nombre){
       String sql="update departamento set nombre=? where id_departamento="+id;
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "DEPARTAMENTO ACTUALIZADO";
            } else {
                msj = "ERROR";
            }
        } catch (Exception e) {
        }
        return msj; 
    }

    @Override
    public String edit(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int edit(int id_departamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 } 
