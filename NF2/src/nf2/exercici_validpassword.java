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
public class exercici_validpassword {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        String usuario,password;
        
        usuario= ponString("Pon tu email-");
        password = ponString("Pon tu password -");
        
        boolean valido = validarDatosEntrada(usuario,password);
        
        
        
  
        
        
        
    }
   private static String ponString(String pregunta) {
        Scanner sc = new Scanner (System.in);
        System.out.println(pregunta);
        String respuesta = sc.nextLine();
        return respuesta;
        //return sc.nextLine();        
        
    }
   private static boolean validarDatosEntrada(String usuario, String password){
   boolean valido=true;
   if (!usuario.contains("@")){
       
   
       System.out.println("No contiene la @");
       valido= false;
   }
    if (usuario.contains(" ")){
    
        System.out.println("usuario contiene espacios ");
       valido= false;
    }
    if (password.contains(" ")){
    
        System.out.println("usuario contiene espacios ");
        valido= false;
    }
     if (!usuario.endsWith("@proven.cat ")){
    
        System.out.println("Dominio mail incorrecto ");
        valido= false;
    }
     if(password.length()<8){
     
         System.out.println("Longitud password incorrecto");
         valido= false;
     }
     
   return valido;
   }
    
    
    
    
    
    
}
