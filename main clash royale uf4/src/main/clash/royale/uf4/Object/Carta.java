/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package main.clash.royale.uf4.Object;

/**
 *
 * @author mabardaji
 */
public enum Carta {
    PEKKA("Super Pekka",7),PRINCIPE("El principe",5),
    MINERO("El minero",3),ESBIRROS("Los Esbirros",3),
    MAGO("El mago",5);
    
    private String name;
    private int elixir;
    private int arena;

    private Carta(String name, int elixir) {
        this.name = name;
        this.elixir = elixir;
        if (elixir==8)
                this.arena=10;
        else if (elixir==9)
                this.arena = 13;
        else
            {
                this.arena = elixir;
            }
        
    }

    public String getName() {
        return name;
    }

    public int getElixir() {
        return elixir;
    }

    public int getArena() {
        return arena;
    }

    public void setElixir(int elixir) {
       if (elixir==8)
       {
                this.arena=10;
                this.elixir=elixir;
       }        
        else if (elixir==9)
        {
                this.arena = 13;
                this.elixir=elixir;
        }
        else
            {
                this.arena = elixir;
                this.elixir=elixir;
            }
    }

    @Override
    public String toString() {
        return "Carta " + "name=" + name + ", elixir=" + elixir;
    }
    
    
    
    
    
    
}
