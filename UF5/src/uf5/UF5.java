/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jepa2698
 */
public class UF5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        try{
//        
//        int num=5,num2=0;
//        double div =num/num2;       
//        System.out.println(div);
//        }
//        catch(Exception e ){
//        
//            System.out.println("Exception generada en main " + e.getMessage());
//            e.printStackTrace();// dintre mostra el volcat que passa sempre per defecte java
//        }
//        
        
   //int [] valores = new int [3];
     // for (int i = 0; i < 10; i++) {
     //    System.out.println(valores[i]);
     // }
        
        //Scanner sc = new Scanner (System.in);
        //System.out.println("Dame un numero entero");
        //int valor = sc.nextInt();
        
        
        try{
        metodopedirEntero();
        }
        catch(InputMismatchException ex){
        
            System.out.println("No has puesto un entero.Estoy ....");
        }
        pausa1segundo();
       
        System.out.println("Fin del programa");
       }

    public static void metodopedirEntero (){
        Scanner sc = new Scanner (System.in);
        boolean dato_correcto=true;   
         do{
         try{
             System.out.println("Pon un entero");
            int valor = sc.nextInt();
             dato_correcto=true;
         }
         catch(InputMismatchException e1){
             System.out.println("Debes poner un entero y has puesto otro valor");
             dato_correcto= false;
             sc.nextLine();
         }

         catch(Exception ex )
                {
                System.out.println("Error indeterminado " + ex.getMessage());
                //System.out.println(ex.getMessage());
                dato_correcto = false;
                sc.nextLine();
                }
     }while(dato_correcto==false);
        System.out.println("Final programa");
   

}

    private static void pausa1segundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Pausa interrumpida");
        }
    }
}