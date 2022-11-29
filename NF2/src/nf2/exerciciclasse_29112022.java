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
public class exerciciclasse_29112022 {
    public static void main(String[] args) {
        
        int [] numeros = new int [6];
        
        //demanar dades
        Scanner sc = new Scanner (System.in);
        for (int i = 0 ; i < numeros.length; i++){
            System.out.println("Introduce valor " + (i+1) + "-");
            numeros[i] = sc.nextInt();
                }
        Utilitats.mostrarArray(numeros);
        
        
    }
    
    
}
