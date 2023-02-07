/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.Objectes;

/**
 *
 * @author jepa2698
 */
public class Dofi {
    private int edad;
    private String raza;
    private int Velocitat;
    private int distancia_recorreguda;

    public Dofi(int edad, String raça) {      
        this.edad = edad;        
        this.raza = raza;
        this.distancia_recorreguda=0;
        if (this.raza.equalsIgnoreCase("fosc")){
        
         this.Velocitat = this.edad*10;
        }
        else if(this.raza.equalsIgnoreCase("austral")){
        
        this.Velocitat=this.edad*22;
        }
    }
    
    
    
}
