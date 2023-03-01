/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combatpoke.Object;


import java.util.Random;

public abstract class Pokemon implements AccionesCombate{
    protected final String nombre;
    protected int CP;
    protected boolean vivo;

    public Pokemon(String nombre) {
        this.nombre = nombre;
        //this.CP = CP;
        this.vivo = true;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        String devolver;
        devolver = "nombre=" + nombre + ", CP=" + CP ;
        
        
        if (CP>0)
        {
            devolver=devolver + " vivo";
        }
        else
        {
              devolver = devolver + " muerto";
        }
        String rallas_vida=" ";
        for (int i = 0; i < CP; i++) {
            rallas_vida = rallas_vida + "=";
        }
        
        return devolver + rallas_vida;
    }


    public int getCP() {
        return CP;
    }


    public boolean isVivo() {
        return vivo;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        

        if (!(obj instanceof Pokemon)) {
            return false;
        }
        final Pokemon other = (Pokemon) obj; //asgines a other la variable obj pero amb forma Pokemon
        return this.nombre.equalsIgnoreCase(other.nombre);
    }

    @Override
    public int Atac()
    {
        Random rd = new Random();
        int ataque = rd.nextInt(0, 10);
        
        return ataque;
    };

    
}