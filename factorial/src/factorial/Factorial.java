/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author jepa2698
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
     int valor = 5;
         
         System.out.println(valor + "! = " + factorial(valor));
         
     }
     
     
     
     
     public static int factorial(int n) throws InterruptedException
     {
         int resultado;
         //1 o mes casos base (que no es crida a ella mateixa i que ja dona 
         //un resultat)
         if(n==1)
         {
             
             System.out.println("caso base 1: retorno 1");
             Thread.sleep(1000);
             return 1;
         }
         else if (n==0)
         {
             
             System.out.println("case base 0: retorno 1");
             Thread.sleep(1000);
             return 1;
         } 
//         if (n<=1)
//         {
//             return 1;
//         }
         //1 o mes crides recursives, es cridar-se a ella mateixa, pero variant
         //el valor dels parametre de la crida i potser alguna operació
         else //if n>1 
         {
             System.out.println("crido a " + n + "*factorial(" + (n-1) + ")");
             Thread.sleep(1000);
             resultado = n * factorial(n-1);
             Thread.sleep(1000);
             System.out.println("factorial("+ n +") retorna " + resultado);
            return resultado;
         }//return 0;
     }

}