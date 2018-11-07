/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiunico.usuario;

import Location.Ubicacion;

/**
 *
 * @author gabrielcarrion
 * @version  0.1
 */


public abstract class Usuario extends Object{

    /**
     * unico usuario
     */
    protected int id; 

    /**
     * nombre 
     */
    protected String nombre;

    /**
     * apellido
     */
    protected String passwd;

    /**
     * ubicacion actual 
     */
    protected String ubicacionActual;

    /**
     *mail de registro
     * celular del usuario
     * status actual del usuario
     */
    protected int celular;
    private String mail;
    private char status;

    /**
     * calificacion del usuario
     */
    protected int calificacionTotal;

    /**
     * cantidad de viajes del usuario
     */
    protected int numViajes;

    // Constructor con parametros

    /**
     *
     * @param id unico del usuario
     * @param nombre del usuario
     * @param passwd contraseña para autenticar
     * @param ubicacionActual del usuario
     * @param celular para contacto
     * @param mail mail de registro aplicacion
     * @param status disponibilidad del usuario
     * @param calificacionTotal del usuario de la aplicacion
     * @param numViajes del usuario
     */

    public Usuario(int id, String nombre, String passwd, String ubicacionActual, int celular, String mail, char status, int calificacionTotal, int numViajes) {
        this.id = id;
        this.nombre = nombre;
        this.passwd = passwd;
        this.ubicacionActual = ubicacionActual;
        this.celular = celular;
        this.mail = mail;
        this.status = status;
        this.calificacionTotal = calificacionTotal;
        this.numViajes = numViajes;
    }

    public void setStatus(char status) {
        this.status = status;
    }
   
    /*
    * setters  para las variables
    
    */
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setUbicacionActual(String ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCalificacionTotal(int calificacionTotal) {
        this.calificacionTotal = calificacionTotal;
    }

    public void setNumViajes(int numViajes) {
        this.numViajes = numViajes;
    }
    /*
    * getters de las variables
    *
    */
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

    public int getCelular() {
        return celular;
    }

    public String getMail() {
        return mail;
    }

    public int getCalificacionTotal() {
        return calificacionTotal;
    }

    public int getNumViajes() {
        return numViajes;
    }

    public char getStatus() {
        return status;
    }
    
    public void pedirTaxi(Ubicacion origen, Ubicacion Destino){
    // se pide
    }

    
}
