/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2;

import java.util.Scanner;
import nf2.objectes.ArticleAlimentariRefrigerat;
import nf2.objectes.ArticleVestir;


/**
 *
 * @author jepa2698
 */
public class Supermercado {
    public static void main(String[] args) {
        
   
    ArticleAlimentariRefrigerat yogurt = new ArticleAlimentariRefrigerat(); 
    yogurt.setNom("Yogurt");
    yogurt.setFabricant("Danone");
    yogurt.setData("17/4/2023");
    yogurt.setCodeEAN("1234567890123");
    yogurt.setPreu(100);
    yogurt.setTemperaturaConservacio(5);
        System.out.println("PVP : " + yogurt.getPVP());
     Scanner sc = new Scanner (System.in);
        System.out.println("Dime la temperatura de conservacion");
        int temperatura = sc.nextInt();
        
        
        
        
        
        
    ArticleVestir dress = new ArticleVestir(); 
    dress.setNom("Vestido");
    dress.setFabricant("Zara");
    
    dress.setCodeEAN("1234567890123");
    dress.setPreu(100);

        System.out.println("PVP : " + dress.getPVP());
    
    
            }
    
    
}
