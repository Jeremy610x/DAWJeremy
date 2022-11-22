/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Exercici4recursivitat {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

        System.out.println("Dime el numero minimo ");
        int num1=sc.nextInt();
        System.out.println("Dime el numero maximo");
        int num2 =sc.nextInt();
        
        int sumaTotal=sumaentredosnumeros(num1,num2);
        System.out.println("La suma es " + sumaTotal);
    
    
    }
    
    public static int sumaentredosnumeros (int minimo, int maximo ){
    int v1;
     if (minimo>maximo){
         
         v1=maximo;
         maximo=minimo;
         minimo=v1;
     }
        
        
        
    if (minimo==maximo){
        
        return minimo;
    
    }
    else if (maximo>minimo) {
    return maximo + sumaentredosnumeros(minimo,maximo-1);
    
    }    
        
    return -1;
    }  
    
    
}
