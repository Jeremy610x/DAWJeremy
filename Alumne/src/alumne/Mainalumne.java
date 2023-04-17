/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumne;

import java.util.ArrayList;
import alumne.Alumne;
/**
 *
 * @author jepa2698
 */
public class Mainalumne {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        dadesalumnes();
        
        
        ArrayList<Alumne> listaalumnes = new ArrayList<Alumne >();
       listaalumnes.add(new Alumne ("Alumne1",18,"pass1"));
       listaalumnes.add(new Alumne ("Alumne2",18,"pass2"));
       listaalumnes.add(new Alumne ("Alumne3",18,"pass3"));
        listaalumnes.add(new Alumne ("Alumne4",18,"pass4"));
        listaalumnes.add(new Alumne ("Alumne5",18,"pass5"));
        
        
        
        
    }

    private static void dadesalumnes(ArrayList<Alumne> listaalumnes) {
        String nom;
        for (int i = 0; i < listaalumnes.size(); i++) {
            nom=listaalumnes.get(i).getNom();
            
        }
        
        
        
    }
}
