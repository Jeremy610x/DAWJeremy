package cat.proven.pokedex.model.persist;


import cat.proven.pokedex.model.Genre;
import cat.proven.pokedex.model.Pokemon;
import cat.proven.pokedex.model.PokemonType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ProvenSoft
 */
public class PokemonDao {

    private final DbConnect dbConnect;

    public PokemonDao(DbConnect connect) {
        this.dbConnect = connect;
    }
    
    //TODO
    
    
    private Pokemon fromResultSet(ResultSet rs) throws SQLException {
    
    Pokemon poke;   
      long id = rs.getLong("id");
      String name = rs.getString("name");
      double height = rs.getDouble("height");
      double weight = rs.getDouble("weight");
////    Genre genre = rs.getString("genre");
        String gen=rs.getString("genre");
        Genre genero = Genre.valueOf(gen);
        PokemonType tipo = new PokemonType(id, name, name);
       
        
      poke = new Pokemon(id, name, height, weight, genero,tipo);
      return poke;
    }


    

    
    
}
