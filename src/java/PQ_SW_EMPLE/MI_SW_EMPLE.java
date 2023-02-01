/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PQ_SW_EMPLE;

import PQMODELO.empleado;
import PQMODELO.empleadoDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author CABRERA-NEYRA
 */
@WebService(serviceName = "MI_SW_EMPLE")
public class MI_SW_EMPLE {

    empleadoDAO dao=new empleadoDAO();
    
    @WebMethod(operationName = "listar")
    public List<empleado> listarEMPL() {
        List datos=dao.listarEMPL();
        return datos;
    };
}
