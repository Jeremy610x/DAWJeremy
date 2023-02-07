/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.objectes;

/**
 *
 * @author jepa2698
 */
public class ArticleAlimentariRefrigerat  extends ArticleAlimentari{
    private double temperaturaConservacio;

    public double getTemperaturaConservacio() {
        return temperaturaConservacio;
    }

    public void setTemperaturaConservacio(double temperaturaConservacio) {
        this.temperaturaConservacio = temperaturaConservacio;
    }
    
    public boolean sePudrira(int temperatura){
    if (temperatura>this.temperaturaConservacio){
    
    return false;
    }
    else {
    
    return true;
    }
    }
}
