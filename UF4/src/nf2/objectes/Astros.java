/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.objectes;

/**
 *
 * @author jepa2698
 */
public class Astros {
    private int radioecuatorial;
    private int masa;
    private int gravedad;

    public Astros(int radioecuatorial, int masa, int gravedad) {
        
        this.radioecuatorial = radioecuatorial;
        this.masa = masa;
        this.gravedad = gravedad;
        
        
    }
    
    

    public int getRadioecuatorial() {
        return radioecuatorial;
    }

    public void setRadioecuatorial(int radioecuatorial) {
        this.radioecuatorial = radioecuatorial;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
    
    
    
}
