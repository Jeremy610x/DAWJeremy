/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jepa2698
 */
public class BMI {
    double weight;
    double height;

    public BMI() {
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    
    
    public double bmiCalc(){
    
    
    return(double) weight/(height*height);
    
    }
    
}
