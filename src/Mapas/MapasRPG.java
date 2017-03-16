/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;

import Ventanas.ventanaGeneral;
import java.util.Scanner;
import javax.swing.JLabel;
/**
 *
 * @author JesusQuesada
 */
public class MapasRPG {
    
    
    //public void  sector1(){
      int T,btns;  
      public String [][] maps = new String[30][30];  

    public MapasRPG() {
        
        maps[0][0] = "<html><p>Al entrar en el bosque ves un reflejo a lo lejos de lo que parece ser un lago. Por encima de los árboles ves humo, posiblemente los restos de una hoguera reciente. Entre los árboles ves una cabaña al abrigo de la ladera de la montaña.</p></html>";
        maps [0][1] ="Inspeccionar el lago";
        maps [1][0] ="Inspeccionar la hoguera";
        maps [1][1] ="Inspeccionar la cabaña";
        
//        maps[1][0][0][0] = "<html><p>El manantial parece tener un objeto en el fondo. A su lado ves un camino.</p></html>";
//        maps [0][2][0][0] ="Te zambulles en el agua";
//        maps [0][0][1][0] ="Intentas alcanzarlo con una rama";
//        maps [0][0][0][1] ="Sigues por el camino";
    }
      
      
      
      
//      public String  btn1="Inspeccionar el lago (m2.sector2())";
//      public String  btn2="Inspeccionar la hoguera (m3.sector3())";
//      public String  btn3 ="Inspeccionar la cabaña (m4.sector4())";
         
    //}
    

//    ventanaGeneral gen = new ventanaGeneral();
//    JLabel text = new JLabel();
//   
//    int nSector,nEvento;
//    Scanner sc = new Scanner(System.in);
//
//    public MapasRPG() {
//    }
//
//    public MapasRPG(int nSector, int nEvento) {
//        this.nSector = nSector;
//        this.nEvento = nEvento;
//    }
//
//    public int getnSector() {
//        return nSector;
//    }
//
//    public int getnEvento() {
//        return nEvento;
//    }
//
//    public Scanner getSc() {
//        return sc;
//    }
//
//    public void setnSector(int nSector) {
//        this.nSector = nSector;
//    }
//
//    public void setnEvento(int nEvento) {
//        this.nEvento = nEvento;
//    }
//
//    public void setSc(Scanner sc) {
//        this.sc = sc;
//    }

}
