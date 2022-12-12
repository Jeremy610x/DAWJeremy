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
public class exercici1_arraysStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon una frase");
        String frase = sc.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
        
        String [] paraules = frase.split(" ");
        
        for (int i = 0; i < paraules.length; i++) {
            System.out.println(paraules[i]);
        }
        
       
    }
    
}
