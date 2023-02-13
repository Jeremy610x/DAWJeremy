/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccio_exam.objects;

import java.util.Random;

/**
 *
 * @author pomo6989
 */
public class Digimon {

    private String name;
    private int LifePoints;
    private boolean shield;

    //contructor
    /**
     * Hacemos un constructor para poner el nombre de el digimon i le pasamos
     * que de vida tenga 600 i el escudo lo tenga activado
     *
     * @param name
     */
    public Digimon(String name) {
        this.name = name;
        LifePoints = 600;
        shield = true;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return LifePoints;
    }

    public boolean isShield() {
        return shield;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //metodos
    
    /*
    *hacemos la funcion para consultar i mostrar el digimon
     */
    @Override
    public String toString() {
        return "Digimon{" + "name=" + name + ", LifePoints=" + LifePoints + ", shield=" + shield + '}';
    }

    /*
    *hacemos la funcion para consultar i mostrar el nombre
     */
    public String Mostrar_nombre() {
        return "Digimon{" + "name=" + name + '}';
    }

    /*
    *hacemos la funcion para consultar i mostrar la vida
     */
    public String Mostrar_Vida() {
        return "Digimon{" + "LifePoints=" + LifePoints + '}';
    }

    /*
    *hacemos la funcion para consultar i mostrar el escudo si esta activado o no
     */
    public String Mostrar_Escudo() {
        return "Digimon{" + "shield=" + shield + '}';
    }

    /**
     *
     * @param Atac recivimos el ataque del pokemon en la variable atac i lo
     * restamos con la vida de el digimon, si tiene escudo el escudo se pondra
     * en false significando que ya no tiene escudo i el proximo ataque restara
     * la vida de el digimon
     * @return true si tiene vida i false si no tiene
     */
    public boolean rebreAtac(int Atac) {
        if (shield == true) {
            System.out.println("Escut desactivat");
            shield = false;
        } else {
            LifePoints -= Atac;
        }
        if (LifePoints <= 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * hacemos un random para hacer que ataque con la fuerza entre 30 i 200
     *
     * @return retorna el ataque
     */
    public int ataca() {
        Random rd = new Random();
        int atacar = rd.nextInt(170) + 30;
        System.out.println(this.name + " ataca amb força= " + atacar);
        return atacar;
    }
}
