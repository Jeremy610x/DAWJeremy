/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuf3jeremy;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class FilePrimSerializadosLectura {
    
     File fichero;
     FileInputStream fis;
     DataInputStream dis;

    public FilePrimSerializadosLectura(String ruta_fichero) throws FileNotFoundException {
        fichero = new File(ruta_fichero);
        fis = new FileInputStream(fichero);
        dis = new DataInputStream(fis); 
    }
     
    
    public int leerEntero() throws IOException
    {
       return dis.readInt();
    }

    public double leerDouble() throws IOException
    {
       return dis.readDouble();
    }    
    
    public String leerString() throws IOException
    {
        return dis.readUTF();
    }
    
    /**
     * Devuelve true si quedan bytes por leer
     * devuelve false si estamos al final
     * @return
     * @throws IOException 
     */
    public boolean BytesPorLeer() throws IOException
    {
        return dis.available()>0;
    }
    
    /**
     * cierra el bufferedwriter que apunta al fichero y lo libera    
     * @throws IOException error lectura escritura fichero
     */
    public void cerrarFichero() throws IOException
    {
        dis.close();
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
