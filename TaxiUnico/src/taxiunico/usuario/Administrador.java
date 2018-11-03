/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiunico.usuario;

import java.util.ArrayList;
import java.util.List;
import taxiunico.Automovil.Automovil;

/**
 *
 * @author gabrielcarrion
 */
public class Administrador extends Usuario {
    
    public Administrador(int id, String nombre, String passwd, String ubicacionActual, int celular, String mail, char status, int calificacionTotal, int numViajes) {
        super(id, nombre, passwd, ubicacionActual, celular, mail, status, calificacionTotal, numViajes);
    }
    private List<Automovil> autoList= new ArrayList<Automovil>(); 
    private List<Conductor> conducList= new ArrayList<Conductor>(); 
    private List<Cliente> clientList= new ArrayList<Cliente>(); 

private void registrarConduc(Conductor condu){
    //trsag
}    


private void registrarAuto(Automovil auto){
//rsag
}

private void infoClient(){
//
}
}
