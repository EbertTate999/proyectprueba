/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PQ_SW_DEPART;

import PQMODELO.departamento;
import PQMODELO.departamentoDAO;
import PQMODELO.empleadoDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author CABRERA-NEYRA
 */
@WebService(serviceName = "MI_SW_DEPART")
public class MI_SW_DEPART {

    /**
     * This is a sample web service operation
     */
    departamentoDAO dao=new departamentoDAO();
    
    @WebMethod(operationName = "listar")
    public List<departamento> listarDEPART() {
        List datos=dao.listarDEPART();
        return datos;
    };

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "id_departamento") int id_departamento, @WebParam(name = "nombre") String nombre) {
        String datos=dao.add(id_departamento, nombre);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Actualizar")
    public String Actualizar(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre) {
        String x=Integer.toString(id);
        
        String datos=dao.edit(x, nombre);
        
        return datos;
    }

    
    
}
