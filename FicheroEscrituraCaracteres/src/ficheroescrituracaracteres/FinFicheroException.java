/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroescrituracaracteres;

/**
 *
 * @author jepa2698
 */
public class FinFicheroException extends Exception{

    public FinFicheroException(String nombre) {
        super("final de fichero" + nombre);
        
    }
    
}
