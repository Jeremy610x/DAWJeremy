/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2;

import java.util.Scanner;


/**
 *
 * @author jepa2698
 */
public class exercici4_string_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe la frase ");
        String frase = sc.nextLine();
        
        frase = frase.toUpperCase();
        int [] vocales = new int  [5]; 
        
        for (int i = 0; i < frase.length(); i++) {
          
            switch (frase.charAt(i)) {
                case 'A':
                    vocales[0] = vocales [0]+1;
                    break;
                case 'E':
                    vocales [1]++;
                    break;
                case 'I':
                    vocales [2]++;
                    break;
                case 'O':
                    vocales [3]++;
                    break;
                case 'U':
                    vocales [4]++;
                    break;
                default:
                    break;
            
            
          
          
        
    
        
        
        
    }
        }
        
 
                     
        Utilitats.Utilitats.mostrarArray(vocales);
            
            char[] letras = ['A','E','I','O','U'];
            
            
            for (int i = 0; i < vocales.length; i++) {
                System.out.println("Numero de "  + letras[i] + "-" +vocales[i]);
            }
            
    
    }
    
}
