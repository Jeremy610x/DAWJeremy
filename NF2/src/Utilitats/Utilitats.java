/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilitats;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class Utilitats {
    /**
       * Pide un valor al usuario y solo lo devuelve si es positivo
       * @return valor positivo
       */
      public static int pedirValorPositivo()
      {
          Scanner sc = new Scanner(System.in);
          int valor;
          do{
          System.out.println("Pon un valor positivo");
          valor = sc.nextInt();
          }while(valor<=0);
          return valor;
      }

      public static int pedirValorPositivoFrase(String frase)
      {
          Scanner sc = new Scanner(System.in);
          int valor;
          
          do{
          System.out.println(frase);
          valor = sc.nextInt();
          }while(valor<=0);
          return valor;
      }
      
      /**
       * pedira un valor que tiene que estar comprendido entre 
       * n1 y n2
       * @param n1 primer valor
       * @param n2 segundo valor
       * @return el valor que devuelve siempre estara comprendido entre n1 y n2
       */
      public static int pedirValorEntreDosNumeros(int n1, int n2)
      {
          Scanner sc = new Scanner(System.in);
          int valor;
          int min, max;
          if(n1>n2)
          {
              max=n1;
              min=n2;
          }
          else
          {
              max=n2;
              min=n1;
          }
          do{
          System.out.println("Pon un valor entre " + min + " y " + max);
          valor = sc.nextInt();
          }while(valor<min || valor>max);
          return valor;
      }
      
    /**
     * funcion para saber si eres mayor de edad
     * @param a es la edad del ser vivo
     * @return true si es suyperior o igual a 18, false en otro caso
     */  
    public static boolean esMayorEdad(int a)
    {
        boolean mayor;
        if(a>=18)
            {
                //return true;
                mayor=true;
            }
        else
            {
                mayor=false;
                //return false;
            }
        
        
        return mayor;
    }
    
    public static void mostrarArray(int[] valores)
    {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Posicio " + i + " conte -> " + valores[i]);
            
        }
    }
    
    
    
    
}
