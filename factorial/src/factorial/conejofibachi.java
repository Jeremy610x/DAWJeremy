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
public class conejofibachi {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in); 
 
        System.out.println("Dime cuantos conejos Fibonacci hay ");
        int mes=sc.nextInt();
        int conejos = ConejosFibonacci(mes);
        
     System.out.println("En el mes " + mes+ "tendras " + conejos + " conejos!");
 
 }   
 public static int ConejosFibonacci(int mes){
int resultado; 
if(mes<=1){
return 1;
}     
else if(mes>1){
    resultado = ConejosFibonacci(mes-1) + ConejosFibonacci(mes-2);
    return resultado;
}     
     
     
 return -1;//numero no valido
 }   
    
   
}
