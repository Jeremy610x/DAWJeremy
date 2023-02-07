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
public class Alumno extends Persona {
    private int exp;
    private String ciclo;
    private int curso;
    private ArrayList notas;

    public Alumno(int exp, String ciclo, int curso, ArrayList notas, String dni, String nombre, String direccion, int telefono) {
        super(dni, nombre, direccion, telefono);
        this.exp = exp;
        this.ciclo = ciclo;
        this.curso = curso;
        this.notas = notas;
    }
    @Override
    public void mostrarPersona(){
    
    
    super.mostrarPersona();
    
        System.out.println("Num. expediente" + this.exp);
        System.out.println("Ciclo " + this.ciclo);
        System.out.println("Curso" + this.curso);
        System.out.println("Notas: ");
        for (Iterator it = this.notas.iterator(); it.hasNext();) {
            System.out.println("\tNota" + it.next());
            
        }
    
    
    
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public ArrayList getNotas() {
        return notas;
    }

    public void setNotas(ArrayList notas) {
        this.notas = notas;
    }
    
}
