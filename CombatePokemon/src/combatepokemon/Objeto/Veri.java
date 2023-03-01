/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combatePokemon.Objeto;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Veri extends Pokemon {
    private boolean defensa;
    public Veri(String nombre) {
        super(nombre);
        this.CP=40;
        defensa=false;
    }

    @Override
    public int Atac() {
        return super.Atac();
    }

    @Override
    public void recibirImpacto(Pokemon punisher) {
        int ataque_punisher;
        if (punisher instanceof Electric)
        {
            Electric atacante = (Electric) punisher;
            ataque_punisher = atacante.Atac();
        }
        else
        {
            ataque_punisher = punisher.Atac();
        }
        
        System.out.println("Ataca con ---> " + ataque_punisher);
        if (punisher instanceof Electric)
        {
            System.out.println("Es de Electric");
            ataque_punisher *= 0.75;
            System.out.println("Ataca con ---> " + ataque_punisher);
        }
        if(defensa==true)
        {
            ataque_punisher = ataque_punisher/2;
        }
        this.CP -= ataque_punisher;
        if (this.CP<15)
        {
            defensa=true;
        }
        System.out.println(this.toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("ha petado el thread");
        }
    }
    
}
