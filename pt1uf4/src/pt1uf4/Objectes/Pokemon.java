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
public class Pokemon {
    private final String name;
    private int lifePoints;
    private int combatPoints;

    public Pokemon(String name, int lifePoints,int combatPoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        
        if(lifePoints>1000){
        
            this.lifePoints=1000;   // vida per defecte 1000   
        }
        else{
        this.lifePoints= lifePoints;
       
        }      
    }

    public void setCombatPoints(int combatPoints) {
        this.combatPoints = combatPoints;
    }

  

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getCombatPoints() {
        Random rd = new Random();
        int rand = rd.nextInt(100,200); // aleatorio entre 100 i 200
        return combatPoints + rand; // combat ponts mas el random  hecho anteriormente
    }
    
    private void critCombat( int parametre){
    
        System.out.println(this.name + " pokemon a l'atac amb força "  + parametre);
    
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
    return rebutatac;
    }
    
      private int Atacar(){
      
      return 0;
      }

 @Override
    public String toString() {
        return ( name + " pokemon a l'atac amb força "  + lifePoints );
    }
}
    
    
    

