/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuf3jeremy;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class FilePrimSerializadosEscritura {
    
     File fichero;
     FileOutputStream fos;
     DataOutputStream dos;

     /** preparar els objectes perque sempre apuntin al fitxer de la ruta*/
     
     public FilePrimSerializadosEscritura(String ruta_fichero) throws FileNotFoundException {
        fichero = new File(ruta_fichero);
        fos = new FileOutputStream(fichero);
        dos = new DataOutputStream(fos); 
    }
     
    
    public void escribirEntero(int add) throws IOException
    {
       dos.writeInt(add);
    }

    public void escribirDouble(double add) throws IOException
    {
       dos.writeDouble(add);
    }    
    
    public void escribirString(String add) throws IOException
    {
        dos.writeUTF(add);
    }
    
    /**
     * cierra el bufferedwriter que apunta al fichero y lo libera    
     * @throws IOException error lectura escritura fichero
     */
    public void cerrarFichero() throws IOException
    {
        dos.flush();
        dos.close();
    }
    
     /**
     * retorna el nombre del fichero al que apunta
     * @return nombre fichero
     */
    public String dameNombreFichero()
    {
        return fichero.getName();
    }    
    
}
