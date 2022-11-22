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
public class imagenfractal {
    public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
        System.out.println("Dime el lado del cuadrado incicial - ");
        int lado= sc.nextInt();
        
        int perimetro_total = contarPerimetroFractal(lado);
        System.out.println("Perimetro total  " + perimetro_total);
    }

    private static int contarPerimetroFractal(int lado) {
     if (lado==0){
     return 0;
     }

     else if (lado>0){
     return 4*lado + 4*contarPerimetroFractal(lado/2);
     
             }
     
     return -1;
     
         
         }
   
    
}
