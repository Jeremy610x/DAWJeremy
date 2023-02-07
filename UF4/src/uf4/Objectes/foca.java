/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.Objectes;

/**
 *
 * @author jepa2698
 */
public class foca {
    private int peso;
    private int edat;
    private int resistencia;
    private int distancia_recorreguda;

    public foca(int peso, int edat) {
       this.setPeso(peso);
        if(edat>15){
        
            System.out.println("Edat no permitida" + edat);
            this.edat=15;
        }
                
        this.edat = edat;
    }

    public void setPeso(int peso) {
        this.peso = peso;
         if(peso>140){
            System.out.println("El peso maximo es de 140,la dejo asi");
        }else{
        this.peso = peso;
         }
    }
    
    
    
}
