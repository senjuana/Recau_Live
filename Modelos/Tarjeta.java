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
public class Tarjeta {
    private int idtarjeta;
    private String fechaRegis;
    private int IDProp;
    private int IDCar;
    private int Numero_Recau;

    public Tarjeta(int idtarjeta, String fechaRegis, int IDProp, int IDCar, int Numero_Recau) {
        this.idtarjeta = idtarjeta;
        this.fechaRegis = fechaRegis;
        this.IDProp = IDProp;
        this.IDCar = IDCar;
        this.Numero_Recau = Numero_Recau;
    }

    public int getIdtarjeta() {
        return idtarjeta;
    }

    public void setIdtarjeta(int idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public String getFechaRegis() {
        return fechaRegis;
    }

    public void setFechaRegis(String fechaRegis) {
        this.fechaRegis = fechaRegis;
    }

    public int getIDProp() {
        return IDProp;
    }

    public void setIDProp(int IDProp) {
        this.IDProp = IDProp;
    }

    public int getIDCar() {
        return IDCar;
    }

    public void setIDCar(int IDCar) {
        this.IDCar = IDCar;
    }

    public int getNumero_Recau() {
        return Numero_Recau;
    }

    public void setNumero_Recau(int Numero_Recau) {
        this.Numero_Recau = Numero_Recau;
    }

    @Override
    public String toString() {
        return "Terjeta{" + "idtarjeta=" + idtarjeta + ", fechaRegis=" + fechaRegis + ", IDProp=" + IDProp + ", IDCar=" + IDCar + ", Numero_Recau=" + Numero_Recau + '}';
    }
    
}
/*
+----------------------+-------------+------+-----+---------+----------------+
| Field                | Type        | Null | Key | Default | Extra          |
+----------------------+-------------+------+-----+---------+----------------+
| idtarjeta            | int(11)     | NO   | PRI | NULL    | auto_increment |
| fechaRegistro        | varchar(45) | NO   |     | NULL    |                |
| Propietario_idProp   | int(11)     | YES  | MUL | NULL    |                |
| Auto_idcar           | int(11)     | YES  | MUL | NULL    |                |
| Recaudadora_no-recau | int(11)     | YES  | MUL | NULL    |                |
+----------------------+-------------+------+-----+---------+----------------+
*/

