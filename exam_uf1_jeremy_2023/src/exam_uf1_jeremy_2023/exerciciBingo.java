/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_uf1_jeremy_2023;

import java.util.Random;

/**
 *
 * @author jepa2698
 */
public class exerciciBingo {
    public static void main(String[] args) {
  
     

    }
        
   public static void InicialitzarLlistaBoles (int[][] boles){
        for (int fila = 0; fila < boles.length; fila++) {
            for (int col = 0; col < boles[0].length; col++) {
                boles[fila][col]=-1;//posicions a -1
            
            }
        }
       }
    
    public static void MostrarLlistaBoles(int [][] boles){
        for (int fila = 0; fila < boles.length; fila++) {
         for (int col = 0; col < boles[fila].length; col++) {
                System.out.println(boles[fila][col]+ "*" + boles[fila][col]);} //muestra un asterizco
            if(fila < boles.length-1){
                
                System.out.println(" ");//mostra un espai en vegada d'un -1      
            }
            System.out.println("");
        }
    }
    
   public static boolean IntroduirBolaLlista(int[][]boles)
    {
        for (int fila = 0; fila < boles.length; fila++) {
            for (int col = 0; col < boles[fila].length; col++) {
                if(boles[fila][col]==-1) //
                {
                    return false;
                }
            }
        }
        return true;
    }
   
   
   public static void plenarCartro(int posicio){
   
   Random rd = new Random();
   posicio = rd.nextInt(90)+1; // posicio con valores aleatorios 1 al 90
   
   
   }
   

   
   
   
   
}
    
    
    
    
    
    
    

   
        
        
        
    
                
                
                
                
  

