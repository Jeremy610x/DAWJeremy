package cat.proven.pokedex;

import cat.proven.menu.Menu;
import cat.proven.pokedex.model.Pokemon;
import cat.proven.pokedex.model.PokemonModel;
import cat.proven.pokedex.model.PokemonType;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ProvenSoft
 */
public class PokedexUI {

    private final Menu mainMenu;
    private final Scanner uiReader;

    private final PokemonModel model;


    public PokedexUI() throws ClassNotFoundException {
        this.model = new PokemonModel();
        mainMenu = new MainMenu();
        uiReader = new Scanner(System.in);
        uiReader.useDelimiter("\n");
    }

    /**
     * Main method
     *
     * @param args argument for command line invocation (not necessari here)
     */
    public static void main(String[] args) {
        //instantiate presentation class
        PokedexUI ap;
        try {
            ap = new PokedexUI();
             //start interacting with user
            ap.start();
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada..." + ex.getMessage());
        }
       
        
    }

    /**
     * application logic entry point
     */
    public void start() {
        boolean exit = false;  //set exit flag to false
        //control loop
        do {
            //display menu and read user's choice
            mainMenu.show();
            int action = mainMenu.getSelectedOptionActionCommand();
            
            //process user's choice: one control method for each functionality
            switch (action) {
                case 0:  //exit application
                   exit =  doExit();
                    break;
                case 1:  //Add new pokemon
                    
                    break;                
                case 2:  //Add Pokemon Type
                    
                    break; 
                case 3:  //List all pokemons
                    
                    break;  
                case 4:  //List pokemons by type
                    
                    break; 
                case 5:  //[5] Remove a pokemon
                    
                    break; 
                case 6:  //[6] Change type attack name
                    
                    break;  
                case 7:  //[7] Show pokemon which evolutions to
                    
                    break; 
                case 8:  //[8] Remove type (only in empty)
                    
                    break;
                    
                default:  //default option
                    doDefault();
                    break;
            }
        } while (!exit);
        System.out.println("Saliendo de la aplicacion");
    }

    /* ============ CONTROL METHODS ============ */
    /**
     * asks for confirmation and exits application
     */
    public boolean doExit() {
        boolean confirm = doConfirm("Sure to exit? ");
        return confirm;
    }

    /**
     * process default action
     */
    public void doDefault() {
        //System.out.println("Unknown option!");
        System.out.println("Not implemented yet!");
    }

    /* ============ VIEW METHODS ============ */
    /**
     * displays a message to user
     *
     * @param message the message to display
     */
    public void doAlert(String message) {
        System.out.println(message);
    }

    /**
     * displays a message and gets ans answer from user
     *
     * @param message the message to display
     * @return user's answer
     */
    public String doInput(String message) {
        System.out.print(message);
        return uiReader.next();
    }

    /**
     * displays a message to user and asks for confirmation
     *
     * @param message the message to display
     * @return true is user confirms action, false otherwiser
     */
    public boolean doConfirm(String message) {
        final char yesAnswer = 'y';
        System.out.print(message);
        char answer = uiReader.next().toLowerCase().charAt(0);
        return (answer == yesAnswer);
    }
    
    /**
     * 
     * @return 
     */
    public Pokemon doInputPokemon()
    {
       Pokemon add = null;
       String name = doInput("Name pokemon?: ");
       
       
       return add;
    }

    public PokemonType doInputTypePokemon()
    {
        PokemonType type_add = null;
        
        return type_add;
    }
}
