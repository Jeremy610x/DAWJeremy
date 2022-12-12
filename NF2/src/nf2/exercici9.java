/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2;

import java.util.Random;

/**
 *
 * @author jepa2698
 */
public class exercici9 {
    public static void main(String[] args) {

    int [] dados = new int[6];
        int contTirada=0;
        float frecuencia=0;
        //todas las posiciones estan a 0
        for (int i = 0; i < dados.length; i++) {
            dados[i] = 0;

        }
        do{
        int tirada = simularlanzamiento();
        dados[tirada - 1] = dados[tirada - 1] + 1;
        contTirada++;
        }while (contTirada<10000);
        //Utilitats.Utilitats.mostrarArray(dados);
        for (int i = 0; i < dados.length; i++) {
            frecuencia = (float)dados[i]/contTirada;
            System.out.println((i+1) + " ha sortit " + frecuencia);
        }
    }

    /**
     * Tira el dado y devuelve el valor del dado
     *
     * @return
     */
    private static int simularlanzamiento() {
        Random rd = new Random();
        int lanzamiento = rd.nextInt(6) + 1;
        System.out.println(lanzamiento);
        return lanzamiento;
    }
    
    
    
    
    
}
