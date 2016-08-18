/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;
import Modelos.Auto;
import java.util.List;


/**
 *
 * @author senjuana
 */
public interface FDAOAuto {
    void insertar(Auto a) throws DAOException;
    void eliminar(Auto a) throws DAOException;
    void modificar(Auto a) throws DAOException;
    
    List<Auto> obttenerTodos()throws DAOException;
    Auto obtener (int id)throws DAOException;
}
