package cat.proven.pokedex;

import cat.proven.menu.Menu;
import cat.proven.pokedex.model.Genre;
import cat.proven.pokedex.model.Pokemon;
import cat.proven.pokedex.model.PokemonModel;
import cat.proven.pokedex.model.PokemonType;
import java.sql.SQLException;
import java.util.List;
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
    public static void main(String[] args) throws SQLException {
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
    public void start() throws SQLException {
        boolean exit = false;  //set exit flag to false
        //control loop
        do {
            //display menu and read user's choice
            mainMenu.show();
            int action = mainMenu.getSelectedOptionActionCommand();

            //process user's choice: one control method for each functionality
            switch (action) {
                case 0:  //exit application
                    exit = doExit();
                    break;
                case 1:  //Add new pokemon
                    doAddPokemon();
                    break;
                case 2:  //Add Pokemon Type
                    doAddType();
                    break;
                case 3:  //List all pokemons
                 doListAllPokemon();
                    break;
                case 4:  //List pokemons by type
                    
                doListPokemonbyType();  
                    
                    break;
                case 5:  //[5] Remove a pokemon

                    break;
                case 6:  //[6] Change type attack name

                    break;
                case 7:  //[7] Show pokemon which evolutions to

                    break;
                case 8:  //[8] Remove type (only in empty)

                    break;
                case 9:
                doListAllTypes();
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
    public Pokemon doInputPokemon() {
//       Pokemon add = null;
//       String name = doInput("Name pokemon?: ");
//       
//       
//       return add;

        Pokemon poke_add = null;
//          PokemonType pt;
        try {
            String id_s = doInput("id : ");
            int id = Integer.parseInt(id_s);
            
            String name = doInput("name :");
            String sheight = doInput("height :");
            double height = Double.parseDouble(sheight);
            String sweight = doInput("weight :");
             double weight = Double.parseDouble(sweight);
            String sgenre = doInput("Genere :");
            Genre genere = Genre.valueOf(sgenre.toUpperCase());
            
       
            //pasar a mayusculas 
            String typeid_s = doInput("tipo : ");
            int typeid = Integer.parseInt(typeid_s);
            PokemonType tipo = new PokemonType(typeid);

            poke_add = new Pokemon(id, name, height, weight, genere, tipo);
        } catch (NumberFormatException ex) {
            poke_add = null;
        }
        return poke_add;

    }

    private void doAddPokemon() {
        Pokemon p = doInputPokemon();
        if (p != null) {
            int result;
            try {
                result = model.addPokemon(p);
                if (result == 1) {
                    System.out.println("Pokemon added...");
                } else {
                    System.out.println("Pokemon not added");
                }
            } catch (SQLException ex) {
                System.out.println("Error sql" + ex.getMessage());
            }
        }

    }
    
    
       private void doListAllPokemon() {
        try {
            List<Pokemon> pokemon = model.findAllPokemon();
            for (Pokemon show_poke : pokemon) {
                System.out.println(show_poke);
            }   
        } catch (SQLException ex) {
            System.out.println("doListAllPokemon - Error SQL" + ex.getMessage());
        }

    }
    


     
        private void doListAllTypes() {
        try {
            List<PokemonType> tipos = model.findAllPokemonTypes();
            for (PokemonType show_tipos : tipos) {
                System.out.println(show_tipos);
            }   
        } catch (SQLException ex) {
            System.out.println("doListAllTypes - Error SQL" + ex.getMessage());
        }

    }

    
    public PokemonType doInputTypePokemon()
    {
        PokemonType type_add = null;
//          PokemonType pt;
        try {
            //get a number formatter for our locale
//            String sid = doInput("id: ");
//            long id = Long.parseLong(sid);
            int id = 0;  //id is autoincrement
            String name = doInput("name: ");
            String attack = doInput("attack: " );
         
            type_add= new PokemonType(id, name, attack);
        } catch (NumberFormatException ex) {
            type_add= null;
        }
        return type_add;
    }
    
        private void doAddType() {
        PokemonType pt = doInputTypePokemon();
        if (pt!=null)
        {
           int result;
            try {
                result = model.addPokemonType( pt);
                if (result==1)
                {
                    System.out.println("Type added...");
                }
                else
                {
                    System.out.println("Type not added");
                } 
            } catch (SQLException ex) {
                System.out.println("Error sql" + ex.getMessage());
            }
        }
        }
        
        
      public void doListPokemonbyType() throws SQLException{
         
          Scanner sc = new Scanner (System.in);
           String sid = doInput("Type id : ");
          try{
            
              long id = Long.parseLong(sid);
              PokemonType typ = new PokemonType(0);
              List<Pokemon> result = model.findPokemonbyType(typ);
              if (result != null) {
               displayMultiple(result);
              } else {
               doAlert("Error getting data");
              }
          
        } catch (NumberFormatException ex) {
           doAlert("Invalid input");
       }    
      }
      
         public <T> void displayMultiple(List<T> data) {
        for (T t : data) { 
            System.out.println(t);
        }
   }
      
      
      }
        
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

