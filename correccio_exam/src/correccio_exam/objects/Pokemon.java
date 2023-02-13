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
public class Pokemon {

    private String name;
    private int LifePoints;
    private int CombatPoints;

    //constructor
    public Pokemon(final String name, int LifePoints) {
        this.setName(name);
        this.setLifePoints(LifePoints);
        this.setCombatPoints(CombatPoints);
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    /**
     * hacemos la verificacion de que si el pokemon tiene mas de 1000 de vida
     * informe el error i ponga la vida a mil por defecto, si esta bien la vida
     * que le a puesto la vida sera la que a puesto el usuario
     *
     * @param LifePoints
     */
    public void setLifePoints(int LifePoints) {
        if (LifePoints > 1000) {
            System.err.println("ERROR AL PONER LOS PUNTOS DE VIDA: NO PUEDE SER MALLOR DE 1000");
            System.out.println("Ahora tiene 1000 de vida");
            this.LifePoints = 1000;
        } else {
            this.LifePoints = LifePoints;
        }
    }

    /**
     * hacemos un random para que el pokemon ataque de 100 a 200
     *
     * @param CombatPoints
     */
    public void setCombatPoints(int CombatPoints) {
        Random rd = new Random();
        CombatPoints = rd.nextInt(100) + 100;
        this.CombatPoints = CombatPoints;
    }

    //metodos
    /*
    *hacemos la funcion para consultar i mostrar el pokemon
     */
    @Override
    public String toString() {
        return "Pokemon{" + "name=" + name + ", LifePoints=" + LifePoints + ", CombatPoints=" + CombatPoints + '}';
    }

    /*
    *hacemos la funcion para consultar i mostrar el nombre
     */
    public String Mostrar_nombre() {
        return "Pokemon{" + "name=" + name + '}';
    }

    /*
    *hacemos la funcion para consultar i mostrar la vida
     */
    public String Mostrar_Vida() {
        return "Pokemon{" + "LifePoints=" + LifePoints + '}';
    }

    /*
    *hacemos la funcion para consultar i mostrar el ataque
     */
    public String Mostrar_Ataque() {
        return "Pokemon{" + "CombatPoints=" + CombatPoints + '}';
    }

    /*
    *hacemos la funcion para consultar i mostrar el ataque
     */
    private void critCombat(int CombatPoints) {
        CombatPoints = this.CombatPoints;
        System.out.println(this.name + " ataca amb força= " + CombatPoints);
    }

    /**
     * recibe el ataque de el pikachu i lo resta con la vida de el digimon
     *
     * @param Atac recibe el parametro de el ataque de el digimon
     * @return retorna false si no tiene vida i true si tiene
     */
    public boolean rebreAtac(int Atac) {
        LifePoints -= Atac;
        if (LifePoints <= 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * si pikachu tiene menos de 100 de via atacara el doble si no, atacara
     * normal
     *
     * @return retornara el ataque que hace el pikachu
     */
    public int atacar() {
        if (LifePoints < 100) {
            CombatPoints *= 2;
            critCombat(CombatPoints);
            return CombatPoints;
        } else {
            critCombat(CombatPoints);
            return CombatPoints;
        }
    }
}
