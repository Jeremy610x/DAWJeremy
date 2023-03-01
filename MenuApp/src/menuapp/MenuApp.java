/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuapp;

import menuapp.Objects.Menu;
import menuapp.Objects.OptionItem;

/**
 *
 * @author jepa2698
 */
public class MenuApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Menu Fifa = new Menu("Fifa 23");
            
            
            
            
            Fifa.AddOption(new OptionItem("Settings"));
            System.out.println("Numero de opciones añadidas" + Fifa.NUmeroOptionMenu());
            
            
    }
    
}
