/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.Objectes;

/**
 *
 * @author jepa2698
 */
public class Articulos {
    private String nombre;
    private double precio;
    private final double IVA = 0.21;
    private int cuantosQuedan;
    private String setPrecio;

    public Articulos(String nombre,double precio,int cuantosQuedan,double impuesto){
    if (precio<0){
    
        System.out.println("Precio debe ser positivo");
    }
    if (cuantosQuedan<0){
    
        System.out.println("Numero existencias debe ser positiva");
    }
    if (nombre.isBlank()|| nombre.isEmpty()){
    
    
    
    }
    
    
    
    
    }
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    public String getSetPrecio() {
        return setPrecio;
    }

    public void setSetPrecio(String setPrecio) {
        this.setPrecio = setPrecio;
    }
    public void imprimir(){
        System.out.println(this.nombre + " Precio:" + this.precio + "euros"
                + " IVA : "+ this.setPrecio + " % + PVP " + precioConIva() + "euros");
    
    }
    public double getPVPDescuento(double descuento){
    
    return precioConIva() * (1 - descuento /100);
    }

    private double precioConIva() {
       return precio * (1 + IVA /100);
    }
    
}
