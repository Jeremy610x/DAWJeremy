/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author jepa2698
 */
public class PruebaUnitaria {
    public static void main(String[] args) {
        Calculadora obj= new Calculadora();
        int resultado = obj.sumarNumeros(3, 3);
        int resultado1 = obj.restarNumeros(3, 3);
        int resultado2 = obj.dividirNumeros(3, 3);
        int resultado3 = obj.multiNumeros(3, 3);
        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}
