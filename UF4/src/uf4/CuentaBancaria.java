/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4;

/**
 *
 * @author jupr7227
 */
public class CuentaBancaria {
    //---ATRIBUTOS----
    private String IBAN;
    private String titular;
    private double saldo;
    private  double [] movimiento;

    public CuentaBancaria(String IBAN, String titular) {
        //Esto es para validar el IBAN
        
        if(IBAN.isEmpty()){
            System.out.println("Datos incorrectos , esta vacio ");
        
        }
        else if (IBAN.isBlank()){
            System.out.println("Datos incorrectos, esta en Blanco");
        }
        else{
        this.IBAN = IBAN;
        
        //Esto es para validar el Titular
        }
           if(titular.isEmpty()){
            System.out.println("Datos incorrectos , esta vacio ");
        
        }
        else if (titular.isBlank()){
            System.out.println("Datos incorrectos, esta en Blanco");
        }
        else{
        this.titular = titular;
        }
        
     
        
        this.saldo = 0;
        this.movimiento = new double[100];
        
        
        
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double[] getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(double[] movimiento) {
        this.movimiento = movimiento;
    }
    public void imprimeDatos( ){
    
        System.out.println("El titular es " + this.titular + " con IBAN " + this.IBAN + " con un saldo de " + this.saldo);
        
    }
    public void imprmieIBAN(){
    
        System.out.println("El IBAN correspondiente es " +this.IBAN);
    }
    public void imprimeTitular(){
        System.out.println("El titular de la cuenta es " + this.titular);
    }
    public void imprimeSaldo(){
        System.out.println("El saldo de tu cuenta es " + this.saldo);
    }
    
 
}
