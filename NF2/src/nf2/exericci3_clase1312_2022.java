/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class exericci3_clase1312_2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
     String nombre, apell1, apell2;
     
     nombre= ponString("Pon tu nombre");
     apell1= ponString("Pon tu primer apellido");
     apell2= ponString("Pon tu segundo apellido");
        System.out.println(nombre+apell1+apell2);
        String nombreUsuario = nombre.substring(0,3) 
                + apell1.substring(0,3)     + apell2.substring(0,3);
        System.out.println(nombreUsuario.toUpperCase());
    }
    

    private static String ponString(String pregunta) {
        Scanner sc = new Scanner (System.in);
        System.out.println(pregunta);
        String respuesta = sc.nextLine();
        return respuesta;
        //return sc.nextLine();        
        
    }
    
}
