/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiunico.usuario;

import Location.Ubicacion;
import taxiunico.Automovil.Automovil;

/**
 *
 * @author gabrielcarrion
 */
public class Conductor extends Usuario{
    
 

    public Conductor(int id, String nombre, String passwd, String ubicacionActual, int celular, String mail, char status, int calificacionTotal, int numViajes) {
        super(id, nombre, passwd, ubicacionActual, celular, mail, status, calificacionTotal, numViajes);
    }
    
    private int rfc;
    private Automovil autoAsignado;
    public Ubicacion destino;

    public Conductor(int rfc, Automovil autoAsignado, Ubicacion destino, int id, String nombre, String passwd, String ubicacionActual, int celular, String mail, char status, int calificacionTotal, int numViajes) {
        super(id, nombre, passwd, ubicacionActual, celular, mail, status, calificacionTotal, numViajes);
        this.rfc = rfc;
        this.autoAsignado = autoAsignado;
        this.destino = destino;
    }

    public int getRfc() {
        return rfc;
    }

    public void setRfc(int rfc) {
        this.rfc = rfc;
    }

    public Automovil getAutoAsignado() {
        return autoAsignado;
    }

    public void setAutoAsignado(Automovil autoAsignado) {
        this.autoAsignado = autoAsignado;
    }

    public Ubicacion getDestino() {
        return destino;
    }

    public void setDestino(Ubicacion destino) {
        this.destino = destino;
    }
    
    
    
}
