/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuf3jeremy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author mabardaji
 */
public class FicheroEscrituraObjetos {
    File fichero;
    ObjectOutputStream oos;
    int cont_objecte;

    /**
     * preparar variables per quant les vulgui utilitzar
     * @param ruta_archivo on es trobara el arxiu
     * @throws FileNotFoundException no existe el arxiu
     * @throws IOException error d'escriuta
     */
    public FicheroEscrituraObjetos(String ruta_archivo) throws FileNotFoundException, IOException {
        fichero = new File(ruta_archivo);
        oos = new ObjectOutputStream(new FileOutputStream(fichero));
        cont_objecte = 0;
    }
    
    public void cerrarFichero() throws IOException
    {
        oos.close();
    }
    
    
    public void escribirObjetos(Object add) throws IOException
    {
        oos.writeObject(add);
        cont_objecte++;
    }
    
    /**
     * retorna el nombre del fichero al que apunta
     * @return nombre fichero
     */
    public String getNombreFichero()
    {
        return fichero.getName();
    }

    public int getCont_objecte() {
        return cont_objecte;
    }
    
    
    
}
