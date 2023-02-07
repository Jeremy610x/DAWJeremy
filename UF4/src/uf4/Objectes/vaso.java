/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.Objectes;

/**
 *
 * @author jepa2698
 */
public class vaso {
    /*atributs objecte*/
   private String material; /*de que esta feta la Vaso*/
   private int capacitat; /*capacitat maxima Vaso*/ 
   private boolean  ple; /*true si esta al limite*/
   private int volum_actual; /*liquid que conte la Vaso*/
   
   //constructors
//   public Vaso() {
//       
//       this.capacitat = 100; //no crido al set, perque no he creat el setCapacitat 
//       this.setPle(false);
//       this.setVolum_actual(0);
//       this.setMaterial("Vidre");
//       
//    }

    public vaso(String material) {
        this.setMaterial(material);
        this.capacitat = 100;
        this.setPle(false);
        this.setVolum_actual(0);
    }

//    public Vaso(String material, int capacitat) {
//        this.setMaterial(material);
//        this.capacitat = capacitat;
//    }
   
    
   //getters
   
    public String getMaterial() {
        return material;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public boolean isPle() {
        return ple;
    }

    public int getVolum_actual() {
        return volum_actual;
    }

    //setters

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPle(boolean ple) {
        this.ple = ple;
    }

    public void setVolum_actual(int volum_actual) {
        this.volum_actual = volum_actual;
        if (volum_actual<0)
        {
            this.volum_actual = 0;
            //NOOOO
            //volum_actual=0;
        }
    }
   
    //metodo llenarVaso
    //reciba un entero 
    //actualize el volum_actual
    //siempre que no se pase de la capacidad
    

    
    
    
          
}
