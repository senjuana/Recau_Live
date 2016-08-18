/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Modelos.Tarjeta;
import java.util.List;

/**
 *
 * @author senjuana
 */
public interface FDAOTarjeta {
     void insertar(Tarjeta t) throws DAOException;
    void eliminar(Tarjeta t) throws DAOException;
    void modificar(Tarjeta t) throws DAOException;
    
    List<Tarjeta> obttenerTodos()throws DAOException;
    Tarjeta obtener (int id)throws DAOException;
}
