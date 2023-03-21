/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrullacanina.Objects;

/**
 *
 * @author jepa2698
 */
public class Gos {
    protected String nom;
    protected int energia;
    protected int hidratacio;

    public Gos(String nom, int energia, int hidratacio) {
        this.nom = nom;
        this.energia = energia;
        this.hidratacio = hidratacio;
    }

  

   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHidratacio() {
        return hidratacio;
    }

    public void setHidratacio(int hidratacio) {
        this.hidratacio = hidratacio;
    }
    
    public void bordar(){
    
    energia =-10;
    hidratacio=-20;
    
    }
     public void menjar(){
    
    energia =+200;
    
    }
    public void beure(){
    
    energia =+50;
    
    }
     public void rescatar(){
    
    energia =- 20;
    hidratacio =-30;
    
    }
     
     public void Gosnom (){
     
     if (nom.equals(nom)){
     
     
         System.out.println("Son considerats iguals");
     }
     else{
         System.out.println("No son considerats iguals");
     }

     }

    @Override
    public String toString() {
        return "El Gos "  + nom + " te de  energia  " + energia + " , i de  hidratacio te  " + hidratacio;
    }
    
    
    
    
    
}
