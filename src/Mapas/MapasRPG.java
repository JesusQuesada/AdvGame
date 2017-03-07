/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;

import java.util.Scanner;

/**
 *
 * @author JesusQuesada
 */
public class MapasRPG {
    int direccion;
    int nSector,nEventoAgresion, nEvento;
    Scanner sc = new Scanner(System.in);

    public MapasRPG() {
    }

    public MapasRPG(int direccion, int nSector, int nEventoAgresion, int nEvento) {
        this.direccion = direccion;
        this.nSector = nSector;
        this.nEventoAgresion = nEventoAgresion;
        this.nEvento = nEvento;
    }

    public int getDireccion() {
        return direccion;
    }

    public int getnSector() {
        return nSector;
    }

    public int getnEventoAgresion() {
        return nEventoAgresion;
    }

    public int getnEvento() {
        return nEvento;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void setnSector(int nSector) {
        this.nSector = nSector;
    }

    public void setnEventoAgresion(int nEventoAgresion) {
        this.nEventoAgresion = nEventoAgresion;
    }

    public void setnEvento(int nEvento) {
        this.nEvento = nEvento;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    
    
    public  void comprobarCardinales(String direccion){
        
    

    }
    
}
