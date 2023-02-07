/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4;

import uf4.Rectangulo;

/**
 *
 * @author mabardaji
 */
public class RectanguloMain {
    public static void main(String[] args) {
        Rectangulo rectangle = new 
        Rectangulo(0, 0, 5, 5);
        
        //perimetro
        //calculo lado
        
        calcularPerimetro(rectangle);
        
//        rectangle.setX1(2);
//        rectangle.setY1(3);
//        rectangle.setX2(7);
//        rectangle.setY2(9);
        
  //      calcularPerimetro(rectangle);
        
        
        rectangle.imprime();
       // Rectangulo rectangle_erroneo= new Rectangulo(7, 7, 2, 2);
        
    }

    /**
     * calcula el perimetro y lo muestra por pantalla
     * @param rectangle 
     */
    private static void calcularPerimetro(Rectangulo rectangle) {
        int base = rectangle.getX2()-rectangle.getX1();
        int lado = rectangle.getY2()-rectangle.getY1();
        int perimetro = (base*2) + (lado*2);
        System.out.println("(" + rectangle.getX1()
        + "," + rectangle.getY1() + ") y (" 
        + + rectangle.getX2()
        + "," + rectangle.getY2() + ") perimetro" 
        + perimetro);
    }
    

    
    
}
