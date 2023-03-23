/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroescrituracaracteres;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author jepa2698
 */
public class FicheroLecturaCaracteres {
    File fichero;
    BufferedReader br;
    FileReader fr;

    public FicheroLecturaCaracteres(String ruta_fichero) throws FileNotFoundException {
        fichero = new File(ruta_fichero);
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);
        
        
    }

    public FicheroLecturaCaracteres() {
    }
    public void prepararLecturaCaracteres(String ruta_fichero) throws FileNotFoundException  
    {
    
    fichero = new File(ruta_fichero);
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);
    
    }
    
    public char leerCaracterChar() throws IOException,FinFicheroException{
    
        int codigo_ascii= br.read();
        
        if(codigo_ascii==-1){
        
        throw new FinFicheroException(fichero.getName());
        }
        
        return (char)codigo_ascii;
    
    }
    
    public  void cerrarFichero(){
    
    
    
    
    
    }
    
}
