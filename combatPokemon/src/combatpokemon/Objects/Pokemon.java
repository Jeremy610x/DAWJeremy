/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combatpokemon.Objects;

/**
 *
 * @author jepa2698
 */
public class Pokemon {
    protected final String NomPokemon;
    protected int CP;
    protected boolean Viu;

    public Pokemon(String NomPokemon, int CP, boolean Viu) {
        this.NomPokemon = NomPokemon;
        this.CP = CP;
        this.Viu = Viu;
    }

    
    public String getNomPokemon() {
        return NomPokemon;
    }

    @Override
    
    public String toString() {
       return   (NomPokemon +"Nom del pokemon es  i el CombatPoint es " + CP );
 
    }   
    public int getCP() {
        return CP;
    }

    public boolean isViu() {
        return Viu;
    }

    
}
