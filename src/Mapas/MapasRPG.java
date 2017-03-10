/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;

import Ventanas.ventanaGeneral;
import java.util.Scanner;
import javax.swing.JLabel;
import 
/**
 *
 * @author JesusQuesada
 */
public class MapasRPG {

    ventanaGeneral gen = new ventanaGeneral();
    JLabel text = new JLabel();
   
    int nSector,nEvento;
    Scanner sc = new Scanner(System.in);

    public MapasRPG() {
    }

    public MapasRPG(int nSector, int nEvento) {
        this.nSector = nSector;
        this.nEvento = nEvento;
    }

    public int getnSector() {
        return nSector;
    }

    public int getnEvento() {
        return nEvento;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setnSector(int nSector) {
        this.nSector = nSector;
    }

    public void setnEvento(int nEvento) {
        this.nEvento = nEvento;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

}
