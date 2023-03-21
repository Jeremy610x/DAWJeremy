/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jepa2698
 */
public class CollectionSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Set<Integer> conjunt = new HashSet<Integer>();
        Set<Integer> conjunt_ord = new TreeSet<Integer>();
         Set<Integer> conjunt2 = new HashSet<Integer>();
        
        boolean add;
        
        add = conjunt.add(3);
        conjunt_ord.add(3);
        System.out.println("S'ha afegit el 3 ?" + add);
         add = conjunt.add(7);
         conjunt_ord.add(7);
     
        System.out.println("S'ha afegit el 7 ?" + add);
         add = conjunt.add(17);
         conjunt_ord.add(17);
         
        System.out.println("S'ha afegit el 17 ?" + add);
         add = conjunt.add(7);
         conjunt_ord.add(7);
         
        System.out.println("S'ha afegit el 7 ?" + add);
        for(Integer num : conjunt ){
        
            System.out.println(num);
        }
        
        System.out.println("Ordenat");
        for (Integer num : conjunt_ord){
            System.out.println(num);
        }
        
        
        
        
         
   
        add = conjunt2.add(7);
        add = conjunt2.add(100);
        add = conjunt2.add(150);
        
        conjunt.addAll(conjunt2); //union
        System.out.println("union poner todos"
        + "Los elementos del primer y del segundo conjunto");
        for(Integer valor : conjunt){
        
            System.out.println(valor);
        }
        conjunt2.retainAll(conjunt_ord);
        System.out.println("RetainAlll es igual al intersect");
        for(Integer valor : conjunt2 ){
            System.out.println(valor);
        }
        
        conjunt_ord.removeAll(conjunt2);
        System.out.println("remove all :  minus , tots els elements que"
        + " no es troben al segon conjunt");
        for(Integer valor: conjunt_ord){
        
            System.out.println(valor);
        }
        
        
        
        
        
    }
    
}
