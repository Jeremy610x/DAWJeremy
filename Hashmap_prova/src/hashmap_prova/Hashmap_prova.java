/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap_prova;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 *
 * @author jepa2698
 */
public class Hashmap_prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Map<String,Integer> lletres = new HashMap<>();
    Map<String,Integer> lletres_ord = new TreeMap<>();
    //afegir item al dictionari (hashmap)
    
    //put
    lletres.put("A",1);
    lletres.put("B",2);
    lletres.put("C",3);
    lletres.put("D",4);
    lletres.put("E",5);
    lletres.put("F",6);
    lletres.put("I",9);
    lletres.put("H",8);
    lletres.put("Z",26);
    lletres.put("M",13);
    
    lletres_ord.put("A",1);
    lletres_ord.put("B",2);
    lletres_ord.put("C",3);
    lletres_ord.put("D",4);
    lletres_ord.put("E",5);
    lletres_ord.put("F",6);
    lletres_ord.put("I",9);
    lletres_ord.put("H",8);
    lletres_ord.put("Z",26);
    lletres_ord.put("M",13);
    
    

    
        //recorrer Hashmap v1 amb iterator
        
        Set<Map.Entry<String,Integer>> set = lletres.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();
        
        while(iterator.hasNext()){
        
        Map.Entry<String,Integer> entry = iterator.next();
        String key = entry.getKey();
        Integer valor = entry.getValue();
            System.out.println("(" + key + ")=>[" + valor+"]");
        
        
        
        }
    //recorrer conjunt amb les claus
    Set <String> keys = lletres.keySet();
        for (String clave : keys) {
        Integer valor = lletres.get(clave);
          System.out.println("foreach(" + clave + ")=>" + valor+"");
        }
        
    
    Integer valor_recuperado = lletres.get("F");
        System.out.println("F->" + valor_recuperado);
        valor_recuperado = lletres.get("M");
        System.out.println("M->" + valor_recuperado);
    
        //Foreach
        for(Map.Entry<String,Integer> entrada : lletres.entrySet()){
        
            System.out.println("foreach2[" + entrada.getKey() + "]=>" + entrada.getValue());
        }

        //borrar
        lletres.remove("I");
        System.out.println("Despues de borrar la I");
          for(Map.Entry<String,Integer> entrada : lletres.entrySet()){
        
            System.out.println("foreach2[" + entrada.getKey() + "]=>" + entrada.getValue());
        }
        //cambiar 
        lletres.replace("Z", 27);
        System.out.println("Cambio valor Z");
          for(Map.Entry<String,Integer> entrada : lletres.entrySet()){
        
            System.out.println("foreach2[" + entrada.getKey() + "]=>" + entrada.getValue());
        }
          //
        lletres.putIfAbsent("G", 2);
        System.out.println("PutIfAbsent prova");
          for(Map.Entry<String,Integer> entrada : lletres.entrySet()){
        
            System.out.println("putifabsent[" + entrada.getKey() + "]=>" + entrada.getValue());
        }
          
          
        System.out.println("values()------------------");
        Collection<Integer> valores = lletres.values() ;
        ArrayList<Integer> lista_valores = new ArrayList<Integer>(valores);
        for(Integer valor: lista_valores){
        
            System.out.println(valor);
        }
    //Map<char,int> lletres = new HashMap<>();
    
    
        System.out.println("Treemap exmple");
             for(Map.Entry<String,Integer> entrada : lletres_ord.entrySet()){
        
            System.out.println("foreach_lletres-ord[" + entrada.getKey() + "]=>" + entrada.getValue());
        }

    
    
    
    
    
    
    
    }
    
}
