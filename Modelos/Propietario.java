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
public class Propietario {
    private int idprop;
    private String nombre;
    private String Apellido;
    private String Apellido2;
    private int edad;

    public Propietario(int idprop, String nombre, String Apellido, String Apellido2, int edad) {
        this.idprop = idprop;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Apellido2 = Apellido2;
        this.edad = edad;
    }
    
    
    public int getIdprop() {
        return idprop;
    }

    public void setIdprop(int idprop) {
        this.idprop = idprop;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Propietario{" + "idprop=" + idprop + ", nombre=" + nombre + ", Apellido=" + Apellido + ", Apellido2=" + Apellido2 + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
/*|idProp    | int(11)      | NO   | PRI | NULL    | auto_increment |
| nom       | varchar(100) | NO   |     | NULL    |                |
| apellido1 | varchar(100) | NO   |     | NULL    |                |
| apellido2 | varchar(100) | NO   |     | NULL    |                |
| edad      | int(11)      | NO   |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+*/

