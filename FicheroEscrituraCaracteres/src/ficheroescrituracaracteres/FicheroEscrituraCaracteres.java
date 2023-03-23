/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheroescrituracaracteres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jepa2698
 */
public class FicheroEscrituraCaracteres {
  File fichero;
        BufferedWriter bw;
        FileWriter fw;
    
   
    
    public FicheroEscrituraCaracteres(String ruta_fichero) throws IOException {
    
        fichero = new File(ruta_fichero);
        fw = new FileWriter(fichero);
        bw = new BufferedWriter(fw);
    
    }
    
    public void escribirCaracter(char letra) throws IOException{
    
     bw.write(letra);
}
       public void cerrarFichero() throws IOException{
    
     bw.close();
}
          public String dameNombreFichero(){
    
     return fichero.getName();
}

}
