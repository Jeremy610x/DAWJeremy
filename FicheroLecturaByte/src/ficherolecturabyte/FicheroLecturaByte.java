/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficherolecturabyte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author jepa2698
 */
public class FicheroLecturaByte {

    /**
     * @param args the command line arguments
     */
   File fichero;
   FileInputStream fis;

    public FicheroLecturaByte(String ruta_archivo) throws FileNotFoundException {
        
        fichero = new File(ruta_archivo);
        fis = new FileInputStream(fichero);
        
        
    }
   public void cerrarFichero() throws IOException{
   
   fis.close();
   
   }
   
   public String dameNombreFichero(){
       return fichero.getName();
   }
   
   public int leerByte() throws IOException{
   
       int x = fis.read();
       
       return x ;
   
   }
   
}
