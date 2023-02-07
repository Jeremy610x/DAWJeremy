/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.vectorunidimesional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class ex5_ {
    public static void main(String[] args) {
        final int ALUMNOS =4;
        final int NOTAS =5;
        int[][] notas_alumnos = new int[ALUMNOS][NOTAS];

         Random rd=new Random();
        
        for (int files = 0; files < ALUMNOS; files++) {
            for (int colum = 0; colum < NOTAS; colum++) {
                notas_alumnos[files][colum]=rd.nextInt(10)+1;
            }
        }
        
        Utilitats.Utilitats.mostrarArray2D(notas_alumnos);
        int minima;
        for (int i = 0; i < ALUMNOS; i++) { //files
            
            minima=notas_alumnos[i][0];
            for (int j = 0; j < NOTAS; j++) { //columna per obtenir alumne
                if(minima>notas_alumnos[i][j])
                {
                    minima = notas_alumnos[i][j];
                }
            }
            //aqui han acabat les notes del alummne i
            System.out.println("La nota minima de " +(i+1) + " es " + minima);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("De que alumno quieres saber la nota");
        int alum = sc.nextInt();
        
        mostrarDatosAlumno(notas_alumnos,alum);

    }

    /**
     * Funcion que nos da las notas minimas y maximas de un alumno en concreto
     * @param notas_alumnos tablas de notas 
     * @param alum alumno escogido.
     */
    private static void mostrarDatosAlumno(int[][] notas_alumnos, int alum) {
        int minima , maxima;
        double media;
        int col;
        minima = notas_alumnos[alum][0];
        maxima = notas_alumnos[alum][0];
        media=0;
        
 
    }
    
}
