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
public class Recaudadora {
    private int numero_recau;
    private String domicilio;
    private String telefono;

    public Recaudadora(int numero_recau, String domicilio, String telefono) {
        this.numero_recau = numero_recau;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getNumero_recau() {
        return numero_recau;
    }

    public void setNumero_recau(int numero_recau) {
        this.numero_recau = numero_recau;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Recaudadora{" + "numero_recau=" + numero_recau + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
}
/*
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| no-recau  | int(11)      | NO   | PRI | NULL    | auto_increment |
| domicilio | varchar(150) | NO   |     | 0       |                |
| telefono  | varchar(50)  | NO   |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
*/