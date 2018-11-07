/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viaje;

import Location.Ubicacion;
import java.util.ArrayList;
import java.util.List;
import taxiunico.Automovil.Automovil;
import taxiunico.usuario.Cliente;

/**
 *
 * @author gabrielcarrion
 */
public class Viaje {
    
    private double costo;
    private double distancia;
    private Ubicacion origen;
    private Ubicacion destino;
    private Automovil autoDesignado;
    private List<Cliente> clienteList= new ArrayList<Cliente>();   
    private int pasajeros;

    /**
     *
     * @param costo de la carrera
     * @param distancia del viaje
     * @param origen de partida
     * @param destino a donde 
     * @param autoDesignado del conductor
     * @param pasajeros cantidad de pasajeros en el auto
     */
    public Viaje(double costo, double distancia, Ubicacion origen, Ubicacion destino, Automovil autoDesignado, int pasajeros) {
        this.costo = costo;
        this.distancia = distancia;
        this.origen = origen;
        this.destino = destino;
        this.autoDesignado = autoDesignado;
        this.pasajeros = pasajeros;
    }
    /**
    * metodos de la clase
     */
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Ubicacion getOrigen() {
        return origen;
    }

    public void setOrigen(Ubicacion origen) {
        this.origen = origen;
    }

    public Ubicacion getDestino() {
        return destino;
    }

    public void setDestino(Ubicacion destino) {
        this.destino = destino;
    }

    public Automovil getAutoDesignado() {
        return autoDesignado;
    }

    public void setAutoDesignado(Automovil autoDesignado) {
        this.autoDesignado = autoDesignado;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    public double calculaCosto(){
        int costo=0;
        //placeholder;
        return costo;
    
    }
    
    public void escogeRuta(Ubicacion origen, Ubicacion destino){
    
        // vamos a escoger!!
    }
}
