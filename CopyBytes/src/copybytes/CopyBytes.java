/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopyBytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyBytes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //instantiate main class
        CopyBytes ap = new CopyBytes();
        //create test data
        ArrayList<Byte> originalData = new ArrayList<Byte>();
        for (int i = 1; i <= 10; i++) {
            originalData.add((byte) (i*5));
        }

        //display original data
        System.out.println("Original data");
        ap.displayByteArray(originalData);
        //ask file name
        System.out.print("Input file name: ");
        String fileToWrite = scan.next();
        //write data to file
        int bytesWritten = ap.writeBytesToFile(fileToWrite, originalData);
        System.out.println("Number of bytes written: "+bytesWritten);
        String fileToRead = fileToWrite; //file to read from is the same where data were writter previously
        //read data from file
        System.out.println("Read data");
        List<Byte> readData = ap.readBytesFromFile(fileToRead);
        //display read data
        ap.displayByteArray(readData);
    }

    /**
     * displays an array of byte
     * @param data the array of byte to display
     */
    public void displayByteArray(List<Byte> data) {
        //TODO display List
       
        
        
        
        
        //END TODO
    }

    /**
     * writes an array of byte to file
     * @param filename the file name to write to
     * @param data the data to write to file
     * @return the number of bytes actually written to file
     */    
    public int writeBytesToFile(String filename, List<Byte> data) {
         int counter = 0;
        //TODO write the array to file
        //END TODO
        return counter;
    }

    /**
     * reads an array of bytes from file
     * @param filename the file name to read from
     * @return thge array of byte read from file
     */
    private List<Byte> readBytesFromFile(String filename) {
        List<Byte> data = new ArrayList<>();
        int counter = 0;
         //TODO read the array from file
        
            //END TODO
        
        return data;
    }
}
