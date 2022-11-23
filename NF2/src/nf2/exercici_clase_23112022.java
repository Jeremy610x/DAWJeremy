/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2;

/**
 *
 * @author jepa2698
 */
public class exercici_clase_23112022 {
    
    public static void main(String[] args) {
        //definicio arrays
        int [] notes;
        int num_notas=7;
        
        
        notes = new int[num_notas];
        notes[0]=3;
        notes[1]=4;
        notes[2]=7;
        notes[5]=1;
        
        System.out.println("Array creat" +notes);
        
        System.out.println("Mostrar posicions array");
        for(int i=0;i < notes.length; i++){
            System.out.println("Posicio " + i+" conte - " +notes[i]);
        }
        
        
    }
    
    
    
}
