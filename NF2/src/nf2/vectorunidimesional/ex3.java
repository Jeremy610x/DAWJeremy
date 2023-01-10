/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.vectorunidimesional;

import java.util.Arrays;

/**
 *
 * @author jepa2698
 */
public class ex3 {
    public static void main(String[] args) {
        
        final int FILES =10;
        final int COLUM =10;
        
        int tauler [][] = new int [FILES] [COLUM];
        
        for (int files = 0; files < tauler.length; files++) {
            for (int colum = 0; colum < tauler[files].length; colum++) {
                tauler[files][colum]= (files+1)*(colum+1);
                
        
    }
        }System.out.println(Arrays.deepToString(tauler));
    
    }
}
