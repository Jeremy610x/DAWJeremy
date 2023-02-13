package soluciop1nf1_pokemondigimon;

import java.util.InputMismatchException;
import java.util.Scanner;
import soluciop1nf1_pokemondigimon.objects.Digimon;
import soluciop1nf1_pokemondigimon.objects.Pokemon;
/**
 * Pokemon versus Digimon fight
 * @author Jose
 */
public class PokemonDigimon {

    public static void main(String[] args) {
        PokemonDigimon p = new PokemonDigimon();
        p.run();
    }

    private void run() {
        //read and instantiate fighters
        Pokemon pokemon = readPokemon();
        Digimon digimon = readDigimon();
        //fight
        boolean digimonAlive = true;  //digimon is alive flag
        boolean pokemonAlive = true;  //pokemon is alive flag
        do {
            int force;
            //pokemon attack
            force = pokemon.attack();
            digimonAlive = digimon.receiveAttack(force);
            if (digimonAlive) {
                //digimon attack
                force = digimon.attack();
                pokemonAlive = pokemon.receiveAttack(force);
            }
            //report state
            System.out.println(pokemon);
            System.out.println(digimon);
            //System.out.format("Pokemon> name:%s, lifePoints:%d\n", pokemon.getName(), pokemon.getLifePoints());
            //System.out.format("Digimon> name:%s, lifePoints:%d\n", digimon.getName(), digimon.getLifePoints());
        } while (pokemonAlive && digimonAlive);
        //report result
        if(pokemonAlive)
        {
            System.out.println("win pokemon" + pokemon);
        }
        else 
        {
             System.out.println("win digimon" + digimon);
        }
    }

    /**
     * creates a Pokemon, reads data from user and validate them
     * @return 
     */
    private Pokemon readPokemon() {
        Scanner sc = new Scanner(System.in);
        //read name
        System.out.print("Pokemon's name: ");
        String name = sc.nextLine();
        //read lifePoints

        int lifePoints = 0;
        do {
            System.out.print("Pokemon's lifePoints: ");
                lifePoints = sc.nextInt();
        } while (lifePoints<0);
        return new Pokemon(name, lifePoints);
    }

    /**
     * creates a Digimon, reas data from user
     * @return 
     */
    private Digimon readDigimon() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digimon's name: ");
        String nom = sc.nextLine();
        return new Digimon(nom);
    }

}
