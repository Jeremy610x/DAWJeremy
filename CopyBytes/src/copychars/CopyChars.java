/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copychars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import copychars.FicheroEscrituraCaracteres;
import copychars.FicheroLecturaCaracteres;
/**
 *
 * @author bardaji
 */
public class CopyChars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //instantiate main class
        CopyChars ap = new CopyChars();
        //create test data
        List<Character> originalData=new ArrayList<>();
        
        inputOriginalData(originalData);
        
        //display original data
        System.out.println("Original data");
        ap.displayCharArray(originalData);
        //ask file name
        System.out.print("Input file name: ");
        String fileToWrite = scan.next();
        //write data to file
        int charsWritten = ap.writeCharsToFile(fileToWrite, originalData);
        System.out.println("Number of chars written: "+charsWritten);
        String fileToRead = fileToWrite; //file to read from is the same where data were writter previously
        //read data from file
        System.out.println("Read data");
        List<Character> readData = ap.readCharsFromFile(fileToRead);
        //display read data
        ap.displayCharArray(readData);
    }


    /**
     * displays all array list by console
     * @param data the array of char to display
     */
    public void displayCharArray(List<Character> data) {
        //TODO write the array to file
        try {
            FicheroLecturaCaracteres lectura =
                    new FicheroLecturaCaracteres("");
        
            do
            {
                Character = lectura.LeerCaracter();
                Character = (char) lectura;
                
            }while(lectura!=-1);
            
            lectura.cerrarFichero();
            System.out.println("Lectura de ArrayCaracter");
        } catch (FileNotFoundException ex) {
             System.out.println("Fichero no existe... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error lectura fichero" + ex.getMessage());
        }
        
        
        
        
        
        
        
        //END TODO
        
    }
    
    /**
     * writes an array of char to file
     * @param filename the file name to write to
     * @param data the data to write to file
     * @return the number of chars actually written to file
     */
    public int writeCharsToFile(String filename, List<Character> data) {
        int counter = 0;
        //TODO write the array to file
       
        
        
        
        
        
        
        //END TODO
        return counter;
    }

    /**
     * reads an array of char from file
     * @param filename the file name to read from
     * @return array of char read from file
     */
    private List<Character> readCharsFromFile(String filename) {
        List<Character> data=new ArrayList<>();
        int counter = 0;
         //TODO read from file into List
         //if not exist filename, you must write "No file exists"
      
            //END TODO
        
        return data;
    }

    /**
     * Input initial data into List
     * @param originalData 
     */
    private static void inputOriginalData(List<Character> originalData) {
        originalData.add('a');
        originalData.add('p');
        originalData.add('r');
        originalData.add('o');
        originalData.add('v');
        originalData.add('o');
        originalData.add(' ');
        originalData.add('s');
        originalData.add('i');
        originalData.add(' ');
        originalData.add('a');
        originalData.add('q');
        originalData.add('u');
        originalData.add('e');
        originalData.add('s');
        originalData.add('t');
        originalData.add('a');
        originalData.add(' ');
        originalData.add('f');
        originalData.add('r');
        originalData.add('a');
        originalData.add('s');
        originalData.add('e');
        originalData.add(' ');
        originalData.add('s');
        originalData.add('u');
        originalData.add('r');
        originalData.add('t');
        originalData.add(' ');
        originalData.add('p');
        originalData.add('e');
        originalData.add('r');
        originalData.add(' ');
        originalData.add('p');
        originalData.add('a');        
        originalData.add('n');
        originalData.add('t');
        originalData.add('a');
        originalData.add('l');  
        originalData.add('l');
        originalData.add('a');  
        originalData.add('.');
        originalData.add('\n');  
    }
    
}
