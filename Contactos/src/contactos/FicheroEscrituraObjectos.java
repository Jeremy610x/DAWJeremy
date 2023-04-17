/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author jepa2698
 */
public class FicheroEscrituraObjectos {
    
    File fichero ;
    ObjectOutputStream oos;
    
    int cont_objecte;

    public FicheroEscrituraObjectos(String ruta_archivo)throws FileNotFoundException,IOException {
        fichero = new File(ruta_archivo);
        oos = new ObjectOutputStream(new FileOutputStream(fichero));
        cont_objecte = 0;
        
        
    }
    
    public void cerrarFichero() throws IOException{
    
    oos.close();
    
    
    
    }
    public void escribirObjectos(Contactos add) throws IOException{
    
    oos.writeObject(oos);
    cont_objecte++;
    
    }
    
    
    
    
    
    
}
