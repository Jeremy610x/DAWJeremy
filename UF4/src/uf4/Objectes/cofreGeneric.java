/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.Objectes;

/**
 *
 * @author jepa2698
 */
public abstract class cofreGeneric {
     protected int num_monedes;
    protected Carta carta1;
    
    
    protected abstract void abrirCofre();
    protected String  mostrar_cofre(){
    
    return "Monedes" + num_monedes + "Carta1" + carta1;}
}
