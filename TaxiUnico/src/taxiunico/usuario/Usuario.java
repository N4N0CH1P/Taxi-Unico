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
    protected int id; // id unico al usuario
    protected String nombre;
    protected String passwd;
    protected String ubicacionActual;
    protected int celular;
    private String mail;
    private char status;
    protected int calificacionTotal;
    protected int numViajes;

    // Constructor con parametros

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
