/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.objectes;

/**
 *
 * @author jepa2698
 */
public class masajista extends PersonalEquipo{
   
    protected String titulación;

    public masajista(int id, String nombre) {
        super(id, nombre);
        this.edad = 30;
        this.titulación ="Titulo en masaje personal";
    }

    public String getTitulación() {
        return titulación;
    }
    
    
    
    public void darMasaje()
    {
        System.out.println(nombre+ " doy masaje a los jugadores");
    }
    
    
    
    
    
    
}
