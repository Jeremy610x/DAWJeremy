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
public class virustriplex {
      public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Quants dies vols que calculi els virus");
          int virus=sc.nextInt();
          
          int dies=mostravirus(virus);
          System.out.println("Son "+dies);
          
          
          
          
      }
      
      public static int mostravirus (int dia){
      
      if(dia==1){
      return 1;
      }
      if (dia>1){
       
      return 3*mostravirus(dia-1);
      }
      
      return -1;
          
      } 
    
}
