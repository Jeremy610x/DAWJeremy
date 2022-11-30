/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2;
import Utilitats.Utilitats;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author jepa2698
 */
public class exercici8_array {
    
    public static void main(String[] args) {
       
        int []valor_aleatorios = new int [10];
        Random rd = new Random();
        int cont=0;
        Scanner sc = new Scanner (System.in);
        int aleatori = rd.nextInt(1,51);
        for (int i = 0; i < valor_aleatorios.length; i++) {
            valor_aleatorios[i] = aleatori;
        }
        System.out.println("Muestro array");
        Utilitats.mostrarArray(valor_aleatorios);
        
        System.out.println("Pon valor R");
        int R = sc.nextInt();
        
        for (int index = 0; index < valor_aleatorios.length; index++) {
            if(valor_aleatorios[index]>=R){
            
            cont++;
            }
        }
        System.out.println("Hay " +cont+ " valores superiores o iguales a " +R);
    }
    
}
