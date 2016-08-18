/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Modelos.Recaudadora;
import java.util.List;

/**
 *
 * @author senjuana
 */
public interface FDAORecaudadora {
    void insertar(Recaudadora r) throws DAOException;
    void eliminar(Recaudadora r) throws DAOException;
    void modificar(Recaudadora r) throws DAOException;
    
    List<Recaudadora> obttenerTodos()throws DAOException;
    Recaudadora obtener (int id)throws DAOException;
}
