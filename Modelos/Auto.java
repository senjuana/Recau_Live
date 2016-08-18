/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author senjuana
 */
public class Auto {
    private int idcar;
    private String modelo;
    private String placas;
    private String color;
    private int idprop;
    public Auto(int idprop, String modelo, String placas, String color) {
        this.idprop = idprop;
        this.modelo = modelo;
        this.placas = placas;
        this.color = color;
    }

    public int getIdprop() {
        return idprop;
    }

    public void setIdprop(int idprop) {
        this.idprop = idprop;
    }

    public int getIdcar() {
        return idcar;
    }

    public void setIdcar(int idcar) {
        this.idcar = idcar;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    @Override
    public String toString() {
        return "Auto{" + "idcar=" + idcar + ", modelo=" + modelo + ", placas=" + placas + ", color=" + color + '}';
    }
    
    
    
}
/*
idcar              | int(11)      | NO   | PRI | NULL    | auto_increment |
| modelo             | varchar(100) | NO   |     | NULL    |                |
| placas             | varchar(100) | NO   |     | NULL    |                |
| color  
*/