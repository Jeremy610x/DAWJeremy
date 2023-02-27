/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class exercici2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        boolean dato_correcto=true;   
        do{
        try{
        dato_correcto=metodocalculo();
                
        }
        catch(InputMismatchException ex){
            System.out.println("Debes poner un numero entero, no una letra");
             dato_correcto= false;
             sc.nextLine();
        }
        catch(ArithmeticException e){
            System.out.println("No debes poner 0 de valor ");
             dato_correcto=false;
             sc.nextLine();
        }
        }while(dato_correcto==false);
        System.out.println("Final programa");
    }

    private static boolean metodocalculo() {
                 Scanner sc = new Scanner (System.in);  

                    System.out.println("Dime un valor entero (A)");
                    int a = sc.nextInt();
                    System.out.println("Dime el segundo valor entero (B)");
                    int b = sc.nextInt();
                    double calc =a/b;  
                    System.out.println("El resultado es " + calc);
                    return true;
    }
    }

        
        
    
    

