package cat.proven.pokedex;

import cat.proven.menu.Menu;
import cat.proven.menu.Option;

/**
 * @author ProvenSoft
 */
public class MainMenu extends Menu {

    public MainMenu() {
        super("Pokedex main menu");
        addOption(new Option("Exit", "exit"));
        addOption(new Option("Add new pokemon", "pokemon/add"));
        addOption(new Option("Add new pokemon type", "type/add"));
        addOption(new Option("List all pokemons", "pokemon/all"));
        addOption(new Option("List pokemons by type", "pokemon/type"));
        addOption(new Option("Remove a pokemon", "pokemon/remove"));
        addOption(new Option("Change type attack name", "type/attack/modify"));
        addOption(new Option("Show pokemon which evolutions to", "pokemon/evolution"));
        addOption(new Option("Remove type and all pokemon of this type ", "type/remove"));
        addOption(new Option("List all types", "pokemon/all"));
    }
}
