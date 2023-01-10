/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.vectorunidimesional;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author jepa2698
 */
public class ex1 {
    public static void main(String[] args) {
        final int FILES = 3;
        final int COLUM=2;
        int [] [] mapa = new int [FILES] [COLUM];
        
        //Primera fila = 0
        mapa[0] [0] = 4;
        mapa[0] [1] = 14;
        mapa[0] [2] = 24;
        mapa[0] [3] = 34;
        //SEGONA FILA
        mapa[1] [0] = 5;
        mapa[1] [1] = 15;
        mapa[1] [2] = 25;
        mapa[1] [3] = 35;
        //Tercera fila 
        mapa[2] [0] = 6;
        mapa [2] [1] = 16;
        mapa [2] [2] = 26;
        mapa [2] [3] = 36;
        
        System.out.println(Arrays.deepToString(mapa));
        
        for (int fila = 0; fila < mapa.length; fila++) {
           
        for (int col = 0; col < mapa[fila].length; col++) {
            System.out.println(mapa[fila][col] + "-");
        }
            System.out.println("");
        }
        
        int x,y;
        Scanner sc = new Scanner (System.in);
        System.out.println("Fica la fila que vols veure :");
        x = sc.nextInt();
        System.out.println("Fica columna");
        y = sc.nextInt();
        x--;
        y--;
        System.out.println("El valor de la coordenada introduida es " +mapa[x][y]);
                
    }
}
