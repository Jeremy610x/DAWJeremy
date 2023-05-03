/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuf3jeremy;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author jepa2698
 */
public class CopyContacts {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //instantiate main class
        CopyContacts ap = new CopyContacts();
        //create test data
        List<Contacts> originalData = ap.loadData();
        //display original data
        System.out.println("Original data");
        ap.displayList(originalData);
        //ask file name
        System.out.print("Input public data file name: ");
        String publicFilename = scan.next();
       
        //write data to file
        
        int elemsWritten = ap.writeToFile(publicFilename, originalData);
        
        //show the number of elements written by console
      
        //TO DO
        
        //END TO DO
        
        
        //read data from file
        System.out.println("Read data");
        List<Contacts> readData = ap.readFromFile(publicFilename);
        //display read data
        ap.displayList(readData);
    }

    /**
     * displays a list of employee
     * @param data the list of employee to display
     */
    public void displayList(List<Contacts> data) {
        for (Contacts t : data) {
            System.out.println(t);
        }
    }
    
    /**
     * writes employee data to two files (public and private data)
     * @param pubFilename the file name to write public data
     * @param data the list to be written to file
     * @return the number of elements actually written to file
     */
    public int writeToFile(String pubFilename,  List<Contacts> data) {
        int counter = 0;
        //TODO write the list to file
         FicheroEscrituraObjetos fichero_escritura=null;
        
        loadData();
        try {
            fichero_escritura = new FicheroEscrituraObjetos("pubFilename");

            
            //recorro arraylist y cada objeto lo guardo en fichero salida
            for (Contacts anyadir : data) {
                fichero_escritura.escribirObjetos(anyadir);
            }
            System.out.println("objetos guardados" + fichero_escritura.getCont_objecte());
            fichero_escritura.cerrarFichero();
        } catch (IOException ex) {
            System.out.println("Error escribiendo fichero " + fichero_escritura.getNombreFichero() 
                    + ex.getMessage());
        }
        

        //END TODO
        return counter;
    }

    /**
     * reads a list of double from file
     * @param filename the file name to read from
     * @return the list of double read from file
     */
    private List<Contacts> readFromFile(String pubFilename) {
        List<Contacts> data = null;
        File file1 = new File(pubFilename);
        //comprovar si existe
        //si existe cargar al list
            //TODO read the list from file
          Object obj;  
            
      FicheroLecturaObjetos lectura_objetos=null;
        try {
            lectura_objetos = new FicheroLecturaObjetos("pubFilename");
            do{
            obj = lectura_objetos.leerObjeto();
            
                if (obj!=null) //no final de archivo
                    {
                    if (obj instanceof Contacts)
                        {       
                            Contacts c = (Contacts) obj;
                            System.out.println(c);
                           // System.out.println(obj);
                        }

                    }
            }while(obj!=null);
        
            System.out.println("contactos leidos..." + lectura_objetos.getCont_objectes());
            lectura_objetos.cerrarFichero();
        
        } catch (IOException ex) {  
            System.out.println("registros listado " + lectura_objetos.getCont_objectes());
            try {
                lectura_objetos.cerrarFichero();
            } catch (IOException ex1) {
                System.out.println("Error leyendo fichero " + lectura_objetos.getNombreFichero() 
                    + ex.getMessage());
            }
           
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada" + ex.getMessage());
        }
            
            
            
            
            
            
            
     
            

            //END TODO
        
        return data;
    }

    /**
     * loads test data
     * @return list of double with some data
     */
    public List<Contacts> loadData() {
        List<Contacts> data = new ArrayList<>();
        data.add(new Contacts("id1", "name01", 21));
        data.add(new Contacts("id2", "name02", 22));
        data.add(new Contacts("id3", "name03", 23));
        data.add(new Contacts("id4", "name04", 24));
        data.add(new Contacts("id5", "name05", 25));
        data.add(new Contacts("id7", "name06", 26));
        return data;
    }
    
}
