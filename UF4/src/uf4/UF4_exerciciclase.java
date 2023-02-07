/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4;

import uf4.Objectes.vaso;
import uf4.Objectes.Botella;
/**
 *
 * @author jepa2698
 */
public class UF4_exerciciclase {
    public static void main(String[] args) {
  // funcionament màquina
        Botella bottle1= new Botella("Plastic", 500);
        Botella bottle = new Botella(); /*constructor*/
        
        System.out.println("Creo bottle");
        
        System.out.println(bottle.getMaterial());
        System.out.println(bottle.getCapacitat());
        System.out.println("-" + bottle.isAbierta());
        
        //Vaso glass = new Vaso(); /*constructor*/
        vaso glass1 = new vaso("Vidre");
        //Vaso glass2 = new Vaso("Alumini", 50);
        
        //System.out.println(bottle.getMaterial());
        bottle.setMaterial("Plastic");
        bottle.setAny_caducitat(2024);
        //bottle.material = "Vidre";
        //bottle.capacitat = 1000;
        System.out.println("Canvi material e informo caducitat");
        System.out.println(bottle.getMaterial());
        System.out.println(bottle.getCapacitat());
        System.out.println("-" + bottle.isAbierta());
        
        System.out.println(bottle.getAny_caducitat());
        //System.out.println(bottle.liquid_actual);
        
        bottle.setAny_caducitat(2000);
        System.out.println(bottle.getAny_caducitat());
    }
    
    
}
