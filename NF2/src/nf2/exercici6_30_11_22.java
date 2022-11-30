/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2;

import java.util.Scanner;
import Utilitats.Utilitats;
/**
 *
 * @author jepa2698
 */
public class exercici6_30_11_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon valor minimo ");
        int minimo = sc.nextInt();
        System.out.println("Pon valor maximo ");
        int maximo= sc.nextInt();
        int [] numeros = new int [maximo-minimo+1];
        
        final int  TAMANY = maximo-minimo+1;
        int [] valores = new int[TAMANY];
        
        for (int i =0;i<valores.length;i++){
        valores [i]=minimo;
        ++minimo;
        
        
        
        }
        System.out.println("Muestro array");
        
        Utilitats.mostrarArray(valores);
        
        
        
        
        
        
        
        
    }
}
