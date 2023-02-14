/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.objectes;

/**
 *
 * @author jepa2698
 */
public class entrenador extends PersonalEquipo{
protected boolean tiene_titulo;

    public entrenador(int id, String nombre) {
        super(id, nombre);
        this.edad = 40;
        this.tiene_titulo = true;
    }
    
    
    
    
    public void dirigirPartido()
    {
        System.out.println(nombre+ " dirijo partido");
    }
    
    public void entrenar()
    {
         System.out.println(nombre+ " entreno a los jugadores");
    }
    
    
        @Override
    public boolean equals(Object obj) {
        boolean igual= super.equals(obj); 
        if(!(obj instanceof entrenador))
        {
            return false;
        }
        else
        {
            return igual;
        }
    }
}
