/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiunico.usuario;

/**
 *
 * @author gabrielcarrion
 */
public class Cliente extends Usuario {
    
  
    
    private int card;

    public Cliente(int id, String nombre, String passwd, String ubicacionActual, int celular, String mail, char status, int calificacionTotal, int numViajes) {
        super(id, nombre, passwd, ubicacionActual, celular, mail, status, calificacionTotal, numViajes);
    }

    
    public void setCard(int card) {
        this.card = card;
    }

    public int getCard() {
        return card;
    }
    
}
