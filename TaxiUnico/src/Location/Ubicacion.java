/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

/**
 *
 * @author gabrielcarrion
 */
public class Ubicacion {
    
    
    public String calle;

    public String colonia ;

  
    public int numero ;

  
    public String ciudad;

    
    public String estado;

    public int CP ;


    /**
     *
     * @param calle hacia donde se va
     * @param colonia sector
     * @param numero exterior
     * @param ciudad 
     * @param estado de la Republica
     * @param CP codigo postal
     */
    public Ubicacion(String calle, String colonia, int numero, String ciudad, String estado, int CP) {
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
        this.ciudad = ciudad;
        this.estado = estado;
        this.CP = CP;
    }
//Metodos de la clase
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }
    
}
