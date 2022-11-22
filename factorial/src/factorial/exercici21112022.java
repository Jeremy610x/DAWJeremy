/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author jepa2698
 */
public class exercici21112022 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("Cuantes aranyes tens?");
        int aranyes = sc.nextInt();
        
        int potes=contarPotes(aranyes);
        System.out.println("Son en total " + potes);
        
        potes=contarpotesMutants(aranyes);
        
        System.out.println(aranyes + "mutants tenen" + potes + "potes 10");
    
    
    }
    public static int contarPotes(int aranyes){
    
        if(aranyes==0)
        {
        return 0;
        }
        if (aranyes==1)
        {
        return 8;
        }
        else if (aranyes>=1)
        {
        return 8+contarPotes(aranyes-1);
        }
               
        return -1;
        
    }
    
    private static int contarpotesMutants(int aranyes){
    
    if (aranyes==0){
    return 0;
    }
    else if (aranyes%2!=0){
    return 8+contarpotesMutants(aranyes-1);
       
    }
    else if (aranyes==0){
    
    return 6+contarpotesMutants(aranyes-1);
    }
    
    return -1;
    }
    
    
}
