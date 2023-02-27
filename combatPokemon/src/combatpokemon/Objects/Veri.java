/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combatpokemon.Objects;

import AccionesCombate.Atac;
import java.util.Random;

/**
 *
 * @author jepa2698
 */
public class Veri  extends Pokemon implements Atac {
 
    public Veri(String NomPokemon, int CP, boolean Viu) {
        super(NomPokemon, CP, Viu);
        CP=40;
        Viu=true;
    }
 private void defensa( ){
 boolean defensa = false;
 if(CP<15){
     defensa=true;
     int aumentDef= atac()/2;
     
 
 }
 }

    @Override
    public int atac() {
    
        Random rd = new Random();
        int nivell_atac= rd.nextInt(0,10);
        return nivell_atac;
    }
    
    public int recibirImpacto(){
    
         atac();
         
        return 0;
    }

    
    
    
    }

   
    
    

