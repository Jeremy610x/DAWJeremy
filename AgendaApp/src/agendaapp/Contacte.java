/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaapp;

/**
 *
 * @author jepa2698
 */
public class Contacte {
    int num;
    char lletra;
    int years;
    String nom;

    public Contacte(int num, char lletra, int years, String nom) {
        this.num = num;
        this.lletra = lletra;
        this.years = years;
        this.nom = nom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public char getLletra() {
        return lletra;
    }

    public void setLletra(char lletra) {
        this.lletra = lletra;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Nom " + nom + " te el dni " + num + "-"+lletra+ " i te " + years + "anys";
    }

    
    
}
