/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt1uf4.Objectes;

import java.util.Random;

/**
 *
 * @author jepa2698
 */
public class Digimon {
    
    private String name;
    private int lifePoints;
    private final  boolean shield;

    public Digimon(String name, int lifePoints,boolean shield) {
        this.name = name;
        this.lifePoints = 600;
        this.shield=true;
       
        
        
        
      
         
      

       }



    public void setName(String name) {
        this.name = name;  //editar nombre 
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public boolean isShield() {
        return shield;
    }
    
     private boolean rebreAtac( int data_atac ){
    boolean  rebutatac = false; 
    
    this.lifePoints -= data_atac;
       
    if(this.lifePoints<0){    
    return false;           //mort  
    }
    
    else if (this.lifePoints >0){
        
    return true;   //viu
    }
    else if (this.shield){
         System.out.println("Escut desactivat");
    }
    return rebutatac;
 
    }
    
    private void atacar(){
     
    Random rd = new Random ();
    int randdigi = rd.nextInt(30,200); // random del valor 
    
        
        System.out.println(this.name +"i  la força amb que ataca  " + randdigi);  

    }
    
    
    
    

  
    
    
    
}
