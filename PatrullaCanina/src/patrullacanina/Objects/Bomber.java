/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrullacanina.Objects;

/**
 *
 * @author jepa2698
 */
public class Bomber extends Gos implements ApagarFocs{

    public Bomber(String nom, int energia, int hidratacio) {
        super(nom, energia, hidratacio);
    }
    
    
    @Override
    
    public void apagarFoc(){
    energia=-20;
    hidratacio=-20;
    System.out.println(nom + "esta apagant foc");
    
    
    }
    
   
    
    

   
    
    





    
}
