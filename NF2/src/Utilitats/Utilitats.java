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
        for (int i = 0; i <= (valores.length-1); i++) {
            System.out.println("index " + i +  "posicio" + (i+1) + " conte -> " + valores[i]);
            
        }
    }
    
    public static void mostrarArray_Integer(Integer[] valores)
    {
        for (int i = 0; i <= (valores.length-1); i++) {
            System.out.println("posicio" + (i+1) + ":" + valores[i]);
            
        }
    }   
    
        /**
     * te pedira un string y lo retorna
     * @param pregunta el texto que se mostrara en pantalla
     * @return la palabra introducida
     */
    public static String ponString(String pregunta) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pregunta);
        String respuesta = sc.nextLine();
        return respuesta;
        //return sc.nextLine();
    }
    
    
    public static void mostrarArray2D(int[][] mapa)
    {
            for (int fila = 0; fila < mapa.length; fila++) {
            //mapa.length em dona les files
                for (int col = 0; col < mapa[fila].length; col++) 
                {
                    //mapa[0].length dona les columnes existents
                System.out.print(mapa[fila][col] + "-");
                }
            System.out.println("");
        }
    }
    
    
    
    
}
