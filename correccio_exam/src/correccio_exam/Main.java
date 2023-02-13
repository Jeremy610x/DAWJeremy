/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccio_exam;

import correccio_exam.objects.Digimon;
import correccio_exam.objects.Pokemon;

/**
 *
 * @author pomo6989
 */
public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Pokemon pokemon =new Pokemon("pikachu",300);
        System.out.println(pokemon.toString());
        Digimon digimon =new Digimon("digimon");
        System.out.println(digimon.toString());
        
        System.out.println("------------------------");
        do{
            //pokemon ataca
            digimon.rebreAtac(pokemon.atacar());
            //vida digimon
            System.out.println(digimon.Mostrar_Vida());
            //digimon ataca
            pokemon.rebreAtac(digimon.ataca());
            //vida pokemon
            System.out.println(pokemon.Mostrar_Vida());     
            System.out.println("*****************");
        }while(!(digimon.rebreAtac(0)==false || pokemon.rebreAtac(0)==false));
        if(digimon.rebreAtac(0)==false){
            System.out.println("A ganado= "+pokemon.Mostrar_nombre());
        }
        else{
            System.out.println("A ganado= "+digimon.Mostrar_nombre());
        }            
    }
}
