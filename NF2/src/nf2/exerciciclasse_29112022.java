/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2;

import java.util.Scanner;
import Utilitats.Utilitats;
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
        
        int minimo, maximo;
        minimo=numeros[0];
        maximo=numeros[0];
        for(int index=0;index<numeros.length;index++){
            if(numeros[index]>maximo){
            
            maximo=numeros[index];
            }
        
            if(numeros[index]<minimo){
            
            minimo = numeros[index];
            }
        
            System.out.println("El maximo es " + maximo);
            System.out.println("El minimo es " + minimo);
        
        
        
        }
        
    }
    
    
}
