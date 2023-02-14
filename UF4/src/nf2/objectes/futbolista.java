/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.objectes;

/**
 *
 * @author jepa2698
 */
public class futbolista extends PersonalEquipo{
 
  protected int goles;

    public futbolista(int id, String nombre) {
        super(id, nombre);
        this.edad=20;
        this.goles = 0;
    }

    public int getGoles() {
        return goles;
    }
    
    
    
    
    
    public void jugarPartido()
    {
        System.out.println(nombre+ " jugando el partido");
        this.salary += 1000;
        System.out.println("Aumento el sueldo.... " + salary);
    }
    
    public void entrenar()
    {
        System.out.println(nombre+ " entreno fuerte para el partido");
    }

    @Override
    public boolean equals(Object obj) {
        boolean igual= super.equals(obj); 
        if(!(obj instanceof futbolista))
        {
            return false;
        }
        else
        {
            return igual;
        }
    }
    
    
    
    
    
}
