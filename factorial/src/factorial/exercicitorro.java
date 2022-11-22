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
public class exercicitorro {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quants dies portes menjants torrons");
        int dia = sc.nextInt();
        
        int trozos= Contarcalories(dia);
        System.out.println(trozos);
        
    
    }
    public static int Turron(int dia ){
    
    if (dia==0){
    
        return 0 ;
    }         
    else if (dia==1){
    
    return 4;
    }
    else if (dia%3==0){
    
    return 1+Turron(dia-1);
    }
    
     
    else if (dia>1){
    
    return 4+Turron(dia -1);
    }
    
    
    
    
    return -1;
    
    
     }
        public static int Contarcalories(int dia ){
    
    int calories=91;
    
     if (dia==0){
    
        return 0 ;
    }         
    else if (dia==1){
    
    return 4*calories;
    }
    else if (dia%3==0){
    
    return (1*calories) +Contarcalories(dia-1);
    }

     
    else if (dia>1){
    
    return (4* calories) +Contarcalories(dia -1);
    }
    
    
    
    return -1;
    
    
     }
    
    
    
}
