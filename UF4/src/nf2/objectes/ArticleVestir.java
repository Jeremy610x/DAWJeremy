/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.objectes;

/**
 *
 * @author jepa2698
 */
public class ArticleVestir extends Article{
    public double talla ;

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }
    @Override
    public double getPVP(){
    double factor= 1.0;
    
    if (talla >=20.0 && talla<30){
    
    factor = 0.9;
    
    }
    else if (talla >=30 && talla <40){
    
    factor = 0.8;
    }
    return factor * super.getPVP();
    
    
    }
    
    
    
    
    
}
