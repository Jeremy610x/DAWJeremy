/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combatpoke.Object;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public final class Aigua extends Pokemon{
    private int corassa;
    
    public Aigua(String nombre) {
        super(nombre);
        this.CP = 45;
        corassa=2;
    }



    @Override
    public void recibirImpacto(Pokemon punisher) {
       
        if(corassa>0)
        {
            corassa--;
            System.out.println("no me hace da�o");
        }
        else
        {
              int ataque_punisher = punisher.Atac();
              System.out.println("Ataca con ---> " + ataque_punisher);
              if (punisher instanceof Veri)
              {
                  System.out.println("Es de veri");
                  ataque_punisher *= 0.75;
                  System.out.println("Ataca con ---> " + ataque_punisher);
              }
              this.CP -= ataque_punisher;  
        }
        
        System.out.println(this.toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("ha petado el thread");
        }
    }
    
}
