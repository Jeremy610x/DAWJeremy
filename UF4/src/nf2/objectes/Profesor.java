/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.objectes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jepa2698
 */
public class Profesor extends Persona{
    private int cod ;
    private String depto;
    private ArrayList modulos;
    private String horario;

   
    public Profesor(int cod, String depto, ArrayList modulos, String horario, String dni, String nombre, String direccion, int telefono) {
        super(dni, nombre, direccion, telefono);
        this.cod = cod;
        this.depto = depto;
        this.modulos = modulos;
        this.horario = horario;
    }
    
    @Override
    public void mostrarPersona(){
    super.mostrarPersona();
    
        System.out.println("Codigo"+ this.cod);
        System.out.println("Departamento" + this.depto);
        System.out.println(" Horario" + this.horario);
        System.out.println("Modulos");
        for (Iterator it = this.modulos.iterator(); it.hasNext();) {
            System.out.println("\tModulo:" +  it.next());
            
        }
    
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public ArrayList getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList modulos) {
        this.modulos = modulos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
    
    
    
    
    
}
