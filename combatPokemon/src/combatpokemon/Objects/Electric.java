/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combatpokemon.Objects;

import java.util.Random;

/**
 *
 * @author jepa2698
 */
public final class Electric extends Pokemon{
    
    public Electric(String NomPokemon, int CP, boolean Viu) {
        super(NomPokemon, CP, Viu);
        CP=50;
        Viu=true;
    }
    public void Potenciador (int atac, int propietat){
    propietat=2;
    if (atac<=4){
    atac=atac+5;
    propietat = propietat--;
    }
    
    
    }
    
 
    
    
}
