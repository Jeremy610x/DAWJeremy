package cat.proven.pokedex.model;

import cat.proven.pokedex.model.persist.DbConnect;
import cat.proven.pokedex.model.persist.PokemonDao;
import cat.proven.pokedex.model.persist.PokemonTypeDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class PokemonModel {
    
 private final PokemonTypeDao pokemontypedao;
 private final PokemonDao pokemondao;
//        private final PokemonDao pokemondao;
        
    private DbConnect dbConnect=null;
    public PokemonModel() throws ClassNotFoundException {
                DbConnect.loadDriver();
        dbConnect = new DbConnect();
        pokemontypedao=new PokemonTypeDao(dbConnect);
        pokemondao= new PokemonDao(dbConnect);
    
    }

    
    //TODO
      public List<PokemonType> findAllPokemonTypes() throws SQLException{
    return pokemontypedao.selectAll();
   }
  
    
    
    //InsertTYPE
    public int addPokemonType(PokemonType add) throws SQLException{
    //Validacions per saber si tinc que insertarlo
    //si no passen no l'inserto
    int result=0;
    Boolean dataValid=true;
    
    //bloc de comprobacions
    if(add!=null){
    String name =add.getName();
    if(name==null){
        dataValid=false;
    }
    
    else{//code no es null
    //Compruebo que el codigo no esete insertado ya (code es unico y daria error)
    PokemonType pt = pokemontypedao.selectWhereName(name);
    
    if(pt!=null){
    dataValid=false;
    }
    
    }
  }
    
    else{//(add!=null)
    dataValid= false;
    }
    
    //comprobacio que el id de category existeixi tambe
    //fi comprobacions
    
        //insert o no
        if(dataValid==true){
        result=pokemontypedao.insertType(add);
        }
        else{
        result=0;
        }
        
        return result;
    }
   
      
      public int addPokemon(Pokemon pokemon) throws SQLException{
    //Validacions per saber si tinc que insertarlo
    //si no passen no l'inserto
    int result=0;
    Boolean dataValid=true;
    
    //bloc de comprobacions
    if(pokemon!=null){
    String name =pokemon.getName();
    if(name==null){
        dataValid=false;
    }
    
    else{//code no es null
    //Compruebo que el codigo no esete insertado ya (code es unico y daria error)
    Pokemon pd = pokemondao.selectWhereName(name);
    
    if(pd!=null){
    dataValid=false;
    }
    
    }
  }
    
    else{//(add!=null)
    dataValid= false;
    }
    
    //comprobacio que el id de category existeixi tambe
    //fi comprobacions
    
        //insert o no
        if(dataValid==true){
        result=pokemondao.insertPokemon(pokemon);
        }
        else{
        result=0;
        }
        
        return result;
    }
      
      
      public List<Pokemon> findAllPokemon() throws SQLException{
      
      return pokemondao.selectAll();
      
      
      }
      
      public Pokemon findPokemonName(String name) throws SQLException{
      Pokemon c = null;
      if (name !=null){
      
      c = pokemondao.selectWhereName(name);
      }
      return c;
      
      
      
      }
//      
      public List<Pokemon> findPokemonbyType(PokemonType tipo)throws SQLException{
        List<Pokemon> result = null;
        if ( tipo!= null) {
           result = pokemondao.selectWhereType(tipo);
       }
       return result;
      }
    
      }
   
    
        


    
        

