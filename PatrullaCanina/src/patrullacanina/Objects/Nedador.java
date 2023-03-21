/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrullacanina.Objects;
/**
 *
 * @author jepa2698
 */
public class Nedador extends Gos implements NedadorInterface{
    
    public Nedador(String nom, int energia, int hidratacio) {
        super(nom, energia =100, hidratacio=200);
    }
    public void nedar(){
    
    energia=-5;
    hidratacio=-10;
    System.out.println(nom + "esta nedant");
    
    
    }

    
public enum EstilNatacio{
    CROL,BRACA,PAPALLONA,ESQUENA;

}
 
    
    
    
    
    
    
    
    
    
    
    
    
}
