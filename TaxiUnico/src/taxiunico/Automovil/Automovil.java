/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiunico.Automovil;

/**
 *
 * @author gabrielcarrion
 */
public class Automovil {
    
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private int numPasajeros;
    private boolean empresa;
// Constructor con parametros

    /**
     *
     * @param marca 
     * @param modelo 
     * @param color
     * @param anio 
     * @param numPasajeros 
     * atributos del vehiculo
     * @param empresa indica si el auto pertenece a la empresa o no
     */
    public Automovil(String marca, String modelo, String color, int anio, int numPasajeros, boolean empresa) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.numPasajeros = numPasajeros;
        this.empresa = empresa;
    }
// Metodos de la clase
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public void setEmpresa(boolean empresa) {
        this.empresa = empresa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAnio() {
        return anio;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public boolean isEmpresa() {
        return empresa;
    }
    
}
