/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class exericici630_11_2022 {
    public static void main(String[] args) {
        
      
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon tamany array");
        int tamany = sc.nextInt();
        System.out.println("Pon valor array");
        int valor= sc.nextInt();
        int [] numeros = new int [tamany];
        
        for(int index = 0;index < numeros.length;index++){
        numeros[index]=valor;
    
    
    }
        System.out.println("Muestro array");
        Utilitats.mostrarArray(numeros);
        
       
        
    }
}
