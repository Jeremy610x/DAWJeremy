package soluciop1nf1_pokemondigimon.objects;

import java.util.Random;

/**
 * Digimon implementation
 *
 * @author Jose
 */
public class Digimon {

    //attributes
    private String name;
    private int lifePoints;
    private boolean shield;
 //constants NO SON NECESSARIES, PERO NO ESTAN MALAMENT
    //DEFINIR-LES
    private static final int INITIAL_LIFE_POINTS = 600;
    private static final boolean INITIAL_SHIELD_STATE = true;
    private static final int MIN_COMBAT_POINTS = 30;
    private static final int MAX_COMBAT_POINTS = 200;

    public Digimon(String name) {
        this.name = name;
        this.lifePoints = INITIAL_LIFE_POINTS;
        this.shield = INITIAL_SHIELD_STATE;
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public boolean isShield() {
        return shield;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String frase = "Digimon nombre: " + name + " tiene de vida " + lifePoints + "...";
        return frase;
    }

    private void combatScream(int force) {
        System.out.format("digimon '%s' attacks with force %d\n", name, force);
    }

    public boolean receiveAttack(int force) {
        if (shield) {
            System.out.println("Escut desactivat");
            shield = false;
        } 
        else {
            if ((lifePoints - force)<0)
            {
                lifePoints = 0;
            }
            else
            {
                lifePoints = lifePoints - force;
            }
            //lifePoints = Math.max(lifePoints - force, 0);
        }
        return (lifePoints > 0);
    }

    public int attack() {
        Random rd = new Random();
        int force = rd.nextInt(MIN_COMBAT_POINTS, MAX_COMBAT_POINTS + 1);
        combatScream(force);
        return force;
    }

}
