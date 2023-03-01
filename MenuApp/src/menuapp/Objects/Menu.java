/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuapp.Objects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jepa2698
 */
public class Menu {
    private String title;
    List<OptionItem> options_menu; // null

    public Menu(String title) {
        this.title = title;
        options_menu = new ArrayList<>();
        
        
    }
    
    /**
     * Añade a la nueva opcion el array de opciones 
     * @param afegir opcion añadir 
     */
     public void AddOption(OptionItem afegir){
    
     options_menu.add(afegir);
    }
    public int NUmeroOptionMenu(){
    
    return options_menu.size();
    }
    
    
    
    




}
