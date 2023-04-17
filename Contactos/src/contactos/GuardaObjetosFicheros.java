/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jepa2698
 */
public class GuardaObjetosFicheros {
    public static void main(String[] args) {
        GuardaObjetosFicheros app = new GuardaObjetosFicheros();
        app.run();
        
    
    
   }
    private void run(){
    List <Contactos> agenda = new ArrayList<>();
    
    
    cargarDatos(agenda);
    
    
    }
    
    private void cargarDatos(List<Contactos> agenda){
    
    
    
    agenda.add (new Contactos("name", 1));
    agenda.add (new Contactos("name2", 2));
    agenda.add (new Contactos("name3", 3));
    agenda.add (new Contactos("name4", 4));
    
    
    
    }
    
    
}
