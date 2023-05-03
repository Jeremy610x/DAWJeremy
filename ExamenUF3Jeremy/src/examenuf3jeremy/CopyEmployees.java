/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuf3jeremy;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
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

/**
 *
 * @author jepa2698
 */
public class CopyEmployees {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //instantiate main class
        CopyEmployees ap = new CopyEmployees();
        //create test data
        List<Employee> originalData = ap.loadData();
        //display original data
        System.out.println("Original data");
        ap.displayList(originalData);
        //ask file name
        System.out.print("Input public data file name: ");
        String publicFilename = scan.next();
        System.out.print("Input private data file name: ");
        String privateFilename = scan.next();
        //write data to file
        int elemsWritten = ap.writeToFile(publicFilename, privateFilename, originalData);
        //TO DO show the numbers of items save

        //END TO DO
        
        //read data from file
        System.out.println("Read data");
        List<Employee> readData = ap.readFromFile(publicFilename, privateFilename);
        //display read data
        ap.displayList(readData);
    }

    /**
     * displays a list of employee
     * @param data the list of employee to display
     */
    public void displayList(List<Employee> data) {
        for (Employee t : data) {
            System.out.println(t);
        }
    }
    
    /**
     * writes employee data to two files (public and private data)
     * @param pubFilename the file name to write public data
     * @param privFilename the file name to write private data
     * @param data the list to be written to file
     * @return the number of elements actually written to file
     */
    public int writeToFile(String pubFilename, String privFilename, List<Employee> data) {
        int counter = 0;
        //TODO write the list to file
        try {
            //DataOutputStream dos = new DataOutputStream(
                    //new FileOutputStream("myData2.txt"))) 
            FilePrimSerializadosEscritura filewrite
                    = new FilePrimSerializadosEscritura("pubFilename");
              
            for (int i = 0; i < data.size(); i++) {
               
                filewrite.escribirString(data.add(i));
            }    
            filewrite.cerrarFichero();
        } catch (IOException e) {
            System.out.println("Error  entrada y salida datos");
        }
        //END TODO
        return counter;
    }

    /**
     * reads a list of double from file
     * @param filename the file name to read from
     * @return the list of double read from file
     */
    private List<Employee> readFromFile(String pubFilename, String privFilename) {
        List<Employee> data = null;
        File file1 = new File(pubFilename);
        File file2 = new File(privFilename);
        if (file1.exists() && file1.canRead() && file2.exists() && file2.canRead()) {
            data = new ArrayList<>();
            //TODO read the list from file

            
            try {
            
            FilePrimSerializadosLectura fileLector =
                    new FilePrimSerializadosLectura("pubFilename");
            while (fileLector.leerString()> 0) {                
                String d = fileLector.leerString();
                data.add(d);
            }
        } catch (EOFException e) {
            System.out.println("Error leyendo final fichero" + e.getMessage());
            
        } catch (IOException e) {
            System.out.println("Error IO exception entrada y salida datos" + e.getMessage());
        }
        //display read data
        for (String  elem : data) {
            System.out.println(elem);
        }
            
            
            
            //END TODO
        }
        return data;
    }

    /**
     * loads test data
     * @return list of double with some data
     */
    public List<Employee> loadData() {
        List<Employee> data = new ArrayList<>();
        data.add(new Employee(1, "name01", 21, 1001.0));
        data.add(new Employee(2, "name02", 22, 1002.0));
        data.add(new Employee(3, "name03", 23, 1003.0));
        data.add(new Employee(4, "name04", 24, 1004.0));
        data.add(new Employee(5, "name05", 25, 1005.0));
        data.add(new Employee(6, "name06", 26, 1006.0));
        return data;
    }
    
}
