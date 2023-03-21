/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PruebasFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jepa2698
 */
public class PruebasFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        prubasficheros();
        
      
        mostrarficherosDocumentos();
        leerfichero();
        
        
        
    }

    private static void mostrarRutas(File fichero) {
        System.out.println("getParent " + fichero.getParent());
        System.out.println("getName " + fichero.getName());
        System.out.println("getAbsolutePATH() "+ fichero.getAbsolutePath());
        System.out.println("exists() " + fichero.exists());
        System.out.println("isDirectory()" + fichero.isDirectory());
        System.out.println("isFile()" + fichero.isFile());
        System.out.println("length() " + fichero.length() );
        
    }

    private static void mostrarficherosDocumentos() {
          
    File dir = new File("C:\\Users\\jepa2698\\Documents");
    File[] lista = dir.listFiles();
    System.out.println("Contenido de " + dir.getAbsolutePath() + " :");
// Recorremos el array y mostramos el nombre de cada elemento
        for (int i = 0; i < lista.length; i++) {
        File f = lista[i];
        if (f.isDirectory()) {
        System.out.println("[DIR] " + f.getName());
        } else {
        System.out.println("[ARX] " + f.getName());
        }
        }
      
    }

//    private static void crearCarpeta(File carpeta_crear) {
//        if(carpeta_crear)
//      
//    }

    private static void prubasficheros() {
        File archivoAbs = new File("C:\\Users\\jepa2698\\Documents\\NetBeansProjects\\Provafichero\\src\\Fotos\\barcelona.jpg");
        File carpetaAbs = new File("C:\\Users\\jepa2698\\Documents\\NetBeansProjects\\Provafichero\\src\\Fotos");
        File archivoRel = new File("Fotos\\barcelona.jpg");
        
        
        mostrarRutas(archivoAbs);
        System.out.println("**************");
        mostrarRutas(archivoRel);
        
        
        mostrarficherosDocumentos();
        
    }

    private static void leerfichero() {
        File fichero_leer = new File ("ficheros\\datos.txt");
        String linea;
        Scanner lectorArchivo;
        try {
            lectorArchivo = new Scanner (fichero_leer);
            
            while(lectorArchivo.hasNextLine()){
            linea= lectorArchivo.nextLine();
               
            
            
            System.out.println("Frase leida-->" + linea );
            //IMPORTANT SEMPRE S'HA DE TANCAR EL ARXIU
            }
            lectorArchivo.close();
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero " + fichero_leer.getName()+ " no existe " + ex.getMessage());
        }
    }
    
   
     
    
    
    
    
    
    
}
