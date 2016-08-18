/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Modelos.Auto;
import java.util.List;
import java.sql.*;

/**
 *
 * @author senjuana
 */
public class IAutoD implements FDAOAuto{
    
    //int idcar, String modelo, String placas, String color
    final  String insert = "INSERT INTO Auto(modelo,placas,color,idprop) values (?,?,?,?)";
    final  String delete = "DELETE FROM Auto WHERE idcar  = ?";
    final  String update = "UPDATE Auto set modelo = ?, placas = ?,color = ?,idprop = ? WHERE idcar = ?";
    private Connection conn;

    public IAutoD(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public void insertar(Auto a) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        String id;
        try{
            stat = conn.prepareStatement(insert);
            stat.setString(1, a.getModelo());
            stat.setString(2, a.getPlacas());
            stat.setString(3, a.getColor());
            stat.setInt(4, a.getIdprop());
            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que no se guardara el query");
            }
            rs = stat.getGeneratedKeys();
            if(rs.next()){
                a.setIdcar(rs.getInt(1));
            }else{
                throw new DAOException("No se puede asignar un id a este query");
            }
        }catch(SQLException ex){
            throw new DAOException ("Error en sql",ex);
        }finally{
        if(rs!= null){
            try{
            rs.close();            
            }catch(SQLException ex){
                throw new DAOException("Error en sql",ex);
            }
                
        }
        }
        
    }

    @Override
    public void eliminar(Auto a) throws DAOException {
        PreparedStatement stat = null;
        try{
            stat = conn.prepareStatement(delete);
            stat.setInt(1,a.getIdcar());
            if(stat.executeUpdate() == 0){
                throw new DAOException("No se pudo eliminar");
            }
        }catch(SQLException ex){
            throw new DAOException("Error de sql",ex);
        }finally{
            if(stat!= null){
            try{
            stat.close();
            }catch(SQLException ex){
                throw new DAOException("Error en SQL",ex);
            }
            }
        }
    }
    
    @Override
    public void modificar(Auto a) throws DAOException {
        PreparedStatement stat = null;
        try{
            stat = conn.prepareStatement(update);
            stat.setString(1,a.getModelo());
            stat.setString(2,a.getPlacas());
            stat.setString(3,a.getColor());
            stat.setInt(4, a.getIdprop());
            stat.setInt(5,a.getIdcar());
            if(stat.executeUpdate()== 0){
                throw new DAOException("Puede que no se modificar el query");
            } 
        }catch(SQLException ex){
            throw new DAOException("Error en sql", ex);
        }finally{
            if(stat!=null){
                try{
                stat.close();
                }catch(SQLException ex){
                    throw new DAOException("Error en sql",ex);
                }
            }
        }
    }
    
    


//FALTA LA IMPLEMENTACION 
    @Override
    public List<Auto> obttenerTodos() throws DAOException {
       return null; 
    }

    @Override
    public Auto obtener(int id) throws DAOException {
    return null;
    }
    
    private Auto getconvert (ResultSet rs) throws SQLException{
        String modelo = rs.getString("modelo");
       return null; 
    } 
}
