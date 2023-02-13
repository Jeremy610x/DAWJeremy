package soluciop1nf1_pokemondigimon.objects;

import java.util.Random;

/**
 * Pokemon implementation
 *
 * @author Jose
 */
public class Pokemon {

    //attributes
    private final String name;
    private int lifePoints;
    private int combatPoints;
    //constants NO SON NECESSARIES, PERO NO ESTAN MALAMENT
    //DEFINIR-LES
    private static final int LIFE_POINTS_DOUBLE_FORCE = 100;
    private static final int MAX_LIFE_POINTS = 1000;
    private static final int MIN_COMBAT_POINTS = 100;
    private static final int MAX_COMBAT_POINTS = 200;

    public Pokemon(String name, int lifePoints) {
        this.name = name;
        if (lifePoints < 0) {  //validate positive value
            lifePoints = 0;
        }
        if (lifePoints > MAX_LIFE_POINTS) {  //validate upper limit
            lifePoints = MAX_LIFE_POINTS;
        }
        this.lifePoints = lifePoints;
        Random rd = new Random();
        this.combatPoints = (rd.nextInt(MIN_COMBAT_POINTS, MAX_COMBAT_POINTS + 1));
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getCombatPoints() {
        return combatPoints;
    }

    public void setCombatPoints(int combatPoints) {
        this.combatPoints = combatPoints;
    }

    @Override
    public String toString() {
        

        String frase = "Pokemon nombre: " + name + " tiene de vida " + lifePoints +  "...";
        return frase;
    }

    private void combatScream(int force) {
        System.out.format("pokemon '%s' attacks with force %d\n", name, force);
        //otra manera de hacer println
    }

    public boolean receiveAttack(int force) {
        if (lifePoints - force<0)
        {
            lifePoints = 0;
        }
        else{
            lifePoints = lifePoints - force;
        }
        //otra opción lifePoints = Math.max(lifePoints - force, 0);
        return (lifePoints > 0);
    }

    public int attack() {
        int force = lifePoints;
        if (lifePoints <= LIFE_POINTS_DOUBLE_FORCE)
        {
            force *= 2;
        }
        // otra solucion multiplicar por 1 o 2 force *= (lifePoints >= LIFE_POINTS_DOUBLE_FORCE) ? 1 : 2;
        combatScream(force);
        return force;
    }

}
