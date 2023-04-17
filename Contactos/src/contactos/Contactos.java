/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contactos;

import java.io.Serializable;

/**
 *
 * @author jepa2698
 */
public class Contactos implements Serializable {
private String name;
private int age;

    public Contactos(String name, int age) {
        this.name = name;
        this.age = age;
    }

    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name" + name + "age= "  +age;
    }




}
