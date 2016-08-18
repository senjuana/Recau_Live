/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Modelos.Propietario;
import java.util.List;
/**
 *
 * @author senjuana
 */
public interface FDAOPropietario {
    void insertar(Propietario p) throws DAOException;
    void eliminar(Propietario p) throws DAOException;
    void modificar(Propietario p) throws DAOException;
    
    List<Propietario> obttenerTodos()throws DAOException;
    Propietario obtener (int id)throws DAOException;
}
