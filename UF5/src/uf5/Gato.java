/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5;

/**
 *
 * @author jepa2698
 */
public class Gato {
     private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws  Exception {
        if (nombre.length()>=3) {
            
        this.nombre = nombre;
        }
        else{
        
        throw new Exception("Elgato debe tener al menos 3 caracteres");
        }
        
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) throws Exception {
         if (edad > 0)
         {this.edad = edad;}
        else {
            throw new Exception("La edad del gato no puede ser negativa ");
        }
        
    }

    @Override
    public String toString() {
        return "La Edad es " + edad + " y el nombre es " + nombre; 
    }  


}
