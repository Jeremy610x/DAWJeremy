/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.clash.royale.uf4.Object;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public abstract class CofreGeneric {
    
    protected int num_monedas;
    protected Carta carta1;
    
    
    protected abstract void obrirCofre();
    
    protected String mostrar_cofre()
    {
        return "Monedas " + num_monedas + " Carta1... " + carta1;
    }
    
    protected int trobarMonedes(int min, int max)
    {
        Random rd = new Random();
        int monedes = rd.nextInt(min, (max+1));
        return monedes;
        
    }
}
