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
public class exercici5recusivitat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un numero para invertirlo - ");
        int numero=sc.nextInt();
        
      
        invertirnum(numero);
         
        
        
    }
    
    public static int invertirnum (int valor){
    
    if (valor<10){
    
        System.out.println(valor);
    }
    
    else{
    
        System.out.print(valor%10+"-");
        invertirnum(valor/10);
    }
    
  
    
    return -1;
    }
    
    
}
