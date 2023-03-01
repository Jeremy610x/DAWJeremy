/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combatePokemon.Objeto;

/**
 *
 * @author mabardaji
 */
public final class Electric extends Pokemon{
    private int potenciador;
    public Electric(String nombre) {
        super(nombre);
        this.CP = 50;
        this.potenciador=2;
    }

    @Override
    public int Atac() {
        int ataque= super.Atac(); 
        if (ataque<5 && this.potenciador>0)
        {
            ataque+=5;
            this.potenciador--;
        }
        return ataque;
    }



    @Override
    public void recibirImpacto(Pokemon punisher) {
        int ataque_punisher = punisher.Atac();
        System.out.println("Ataca con ---> " + ataque_punisher);
        if (punisher instanceof Aigua)
        {
            System.out.println("Es de Aigua");
            ataque_punisher *= 0.75;
            System.out.println("Ataca con ---> " + ataque_punisher);
        }
        this.CP -= ataque_punisher;
        System.out.println(this.toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("ha petado el thread");
        }
    }
    
}
