/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.vectorunidimesional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class ex4_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        
        System.out.println("Dime el valor n");        
      final int FILES=sc.nextInt();
        System.out.println("Dime el valor M");
        final int COLUM=sc.nextInt();
        
        int [][] tabla = new int [FILES][COLUM];
        
        Random rd = new Random ();
        //FIles
        for (int files = 0; files < tabla.length; files++) {
            
            //COLUM
            for (int colum = 0; colum < tabla[files].length; colum++) {
                tabla[files][colum]=rd.nextInt(10)+1;
            }
        }System.out.println(Arrays.deepToString(tabla));
        int cont5=0;
        int contmayor5=0;
        int menor5=0;
        for (int files = 0; files < tabla.length; files++) {            
            for (int colum = 0; colum < tabla[files].length; colum++) {
              if(tabla[files][colum]==5)
              {
                  
                  cont5++;
              }
              else if (tabla[files][colum]<5){
              
              menor5++;
              }
              else if (tabla[files][colum]>5){
              
              contmayor5++;
              }
              
              
              
            }
            System.out.println("Igual a " +cont5);
            
            System.out.println("Superior a " +contmayor5);
            
            System.out.println("Menor a " +menor5);
            }
        
    }
    
}
