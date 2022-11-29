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
public class exericicasa_4 {
    
    public static void main(String[] args) {
             
        int [] numeros = new int [5];
        
        //demanar dades
        Scanner sc = new Scanner (System.in);
        for (int i = 0 ; i < numeros.length; i++){
            System.out.println("Introduce valor " + (i+1) + "-");
            numeros[i] = sc.nextInt();
                }
        Utilitats.mostrarArray(numeros);
        
        int positivo=0, negativo=0;
        
        for(int index=0;index<numeros.length;index++){
            if(numeros[index]>0){
            positivo=positivo+numeros[index];
            
            }
        
            if(numeros[index]<0){
          negativo=negativo-numeros[index];
            }
        
            System.out.println("El suma de positivos es " + positivo);
            System.out.println("El suma de los negativos es  " + negativo);
   
    }
    }
}
