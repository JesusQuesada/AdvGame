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

    public String[][] cargarJuego() {
        
        maps [0][0] ="<html><p>Al entrar en el bosque ves un reflejo a lo lejos de lo que parece ser un lago. Por encima de los árboles ves humo, posiblemente los restos de una hoguera reciente. Entre los árboles ves una cabaña al abrigo de la ladera de la montaña.</p></html>";
        maps [0][1] ="Inspeccionar el lago";
        maps [1][0] ="Inspeccionar la hoguera";
        maps [1][1] ="Inspeccionar la cabaña";
        
        maps [2][0] ="<html><p>El manantial parece tener un objeto en el fondo. A su lado ves un camino.</p></html>";
        maps [2][1] ="Te zambulles en el agua";
        maps [1][2] ="Intentas alcanzar el objeto con una rama";
        maps [2][2] ="Sigues por el camino";
        
        maps [3][0] ="<html><p>Al llegar compruebas que todavía quedan algunos rescoldos en la hoguera y parece tener algo clavado justo en el centro. A unos metros ves un camino.</p></html>";
        maps [3][1] ="Aprovechas las brasas para entrar en calor";
        maps [1][3] ="Te diriges hacia el camino";
        maps [3][3] ="null";
        
        maps [4][0] ="<html><p>La cabaña está situada en la ladera de la montaña y entre una y otra ves un camino que serpentea hasta la cima. Al otro lado ves un pozo.</p></html>";
        maps [4][1] ="Examinas el pozo";
        maps [1][4] ="Examinas la cabaña";
        maps [4][4] ="Te diriges hacia la cima de la montaña";
        
        maps [5][0] ="<html><p>Te zambulles en el agua y cuando estás a punto de alcanzar el objeto, algo te agarra la pierna y tira de ti. Intentas escapar pero no lo consigues y cada vez tienes menos fuerzas. No puedes aguantar la respiración más tiempo y decides dejar de resistirte y afrontar tu destino.</p><br></br><p>FIN</p></html>";
        maps [5][1] ="null";
        maps [1][5] ="null";
        maps [5][5] ="null";
        
        return maps;
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
