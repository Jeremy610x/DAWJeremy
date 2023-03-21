/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrullacanina.Objects;

/**
 *
 * @author jepa2698
 */
public class Policia extends Gos {

    public Policia(String nom, int energia, int hidratacio) {
        super(nom, 200,100);
        
    }

    public void  detenir(){
    
    energia =-5;
    hidratacio=-10;
        System.out.println(nom + "esta detenint");
    
    
    }

    @Override
    public String toString() {
        return "Policia{" + '}';
    }

    

    

    
}
