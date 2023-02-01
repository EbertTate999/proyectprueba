/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PQMODELO;
import java.util.List;
public interface Interfase_SW_DEPART {
    public List listar();
    
    public String edit (String nombre);
    public int edit (int id_departamento);
    
}
