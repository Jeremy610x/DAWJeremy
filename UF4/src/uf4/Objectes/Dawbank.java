/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf4.Objectes;

import uf4.CuentaBancaria;
import java.util.Scanner;
/**
 *
 * @author jupr7227
 */
public class Dawbank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int opcion_menu;
        CuentaBancaria cuenta1= new CuentaBancaria(" pp88", "Federico");
       
      
        
        do{
             opcion_menu= menu();
             
             //switch
             switch(opcion_menu){
            case 1:
                
            {
            cuenta1.imprimeDatos();
            }
                break;
                
            case 2 :
                
            {
            cuenta1.imprmieIBAN();
            }
                break;
                
            case 3 :
                
            {
            cuenta1.imprimeTitular();
            }
                break;
                
            case 4 :
            {
            cuenta1.imprimeSaldo();
            }
                
                break;
            
            case 5 :
                break;
                
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            
             
             }
        }while(true);
        
        
        
    }
    
    /**
     * muestra men�, devuelve la opci�n que has escogido del men� el usuario(valida)
     * @return opcion escogida por el usuario
     * 
     */
    public static int menu()
    {
        int opcion;
        do
        {
        System.out.println("1. Datos de la cuenta. Mostrar� el IBAN, el titular y el saldo.\n" +
                            "2. IBAN. Mostrar� el IBAN.\n" +
                            "3. Titular. Mostrar� el titular.\n" +
                            "4. Saldo. Mostrar� el saldo disponible.\n" +
                            "5. Ingreso. Pedir� la cantidad a ingresar y realizar� el ingreso si es posible.\n" +
                            "6. Retirada. Pedir� la cantidad a retirar y realizar� la retirada si es posible.\n" +
                            "7. Movimientos. Mostrar� una lista con el historial de movimientos.\n" +
                            "8. Salir. Termina el programa.");
        Scanner sc = new Scanner(System.in);
        opcion = sc.nextInt();
        }while(opcion<1 || opcion>8);
        return opcion;
    }
    }
    

