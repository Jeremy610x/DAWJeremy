/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combatpoke;

import combatpoke.Object.Aigua;
import combatpoke.Object.Veri;

/**
 *
 * @author mabardaji
 */
public class CombatePokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aigua water = new Aigua("Squirtle");
        Aigua water2 = new Aigua("Mudkip");
        Veri poison = new Veri("Golbat");
        
        while(water.getCP()>0 && poison.getCP()>0)
        {
            water.recibirImpacto(poison);
            if(water.getCP()>0)
            {
                poison.recibirImpacto(poison);
            }
        }
        
        if(water.getCP()>0)
        {
            System.out.println("ha ganado" + water.getNombre());
        }
        else
        {
            System.out.println("ha ganado" + poison.getNombre());
        }
//        
//        if(water.equals(s))
//        {
//            System.out.println("iguales");
//        }
//        else
//        {
//            System.out.println("diferentes");
//        }

//        water.recibirImpacto(poison);
//        water.recibirImpacto(water2);
    }
    
}
