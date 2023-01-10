/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.vectorunidimesional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class ex5_ {
    public static void main(String[] args) {
        final int ALUMNOS=4;
        final int NOTAS=5;
        int [][] nota_alumnos = new int [ALUMNOS][NOTAS];
        
        Random rd = new Random ();
        
        for (int files = 0; files < ALUMNOS; files++) {
            for (int colum = 0; colum < NOTAS; colum++) {
                nota_alumnos[files][colum]=rd.nextInt(10)+1;
            }
        }
        System.out.println(Arrays.deepToString(nota_alumnos));
        int minima;
        for (int i = 0; i < ALUMNOS; i++) {
            if(minima>nota_alumnos[i][j])
        
                }
         
        }
        
        
        
        
    }
}
