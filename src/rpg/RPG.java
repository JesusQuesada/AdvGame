/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import Ventanas.ventanaPrincipal;
import LibreriaSonido.Sonido;
/**
 *
 * @author dalvarezruiz
 */
public class RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventanas.ventanaPrincipal inicio = new ventanaPrincipal();
        inicio.setVisible(true);
        Sonido sound = new Sonido();
        sound.playAudio("/Audio/sound.wav");
        
        
    }
    
}
