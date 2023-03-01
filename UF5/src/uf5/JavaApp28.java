/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jepa2698
 */
public class JavaApp28 {
    public static void main(String[] args) {
        List<Integer> llista = new ArrayList<Integer>();
        
        System.out.println( llista. isEmpty());
        llista.add(7);
        llista.add(new Integer (5));
        llista.add(17);
        llista.add(2);
        System.out.println(llista.isEmpty());
        
        System.out.println("Numero de elements " + llista.size());
        
        for(Integer valor : llista ){
        
            System.out.println(valor );
        
        }
        
        System.out.println("Recoeer iterator");
        Iterator<Integer > iter = llista.iterator();        
        while(iter.hasNext()){
        
        Integer i = iter.next();
            System.out.println(i);//com integer
            //te la funcio implememntada
            //fer
            
        }
        
        
        System.out.println(" Recoorent llista metode get   ");
        Integer val;
        for (int i = 0; i < llista.size(); i++) {
          
            val = llista.get(i);
            System.out.println(val);
        }
        System.out.println("Afegeixo 100 a posicio 2 ");
        llista.set(2,100);
        for(Integer num : llista){
            System.out.println(num);
        }
        
        System.out.println("Afegeixo 1000 a posicio 2 i la resta es mou");
        System.out.println("Afegeixo 1000 a posicio 3 i la resta es mou");
        llista.add(2,1000);
        for(Integer num :llista){
            System.out.println(num);
        }
        llista.add(3,1000);

        System.out.println("to String :" + llista.toString());
        System.out.println("Index of busquem el 1000 i es trobaa " 
                + llista.lastIndexOf(100));
        
        System.out.println(" Las Index of busquem el 1000 i es troba" 
                + llista.lastIndexOf(1000) + " contains " + llista.contains(100) );
        
        
        
    }
}
