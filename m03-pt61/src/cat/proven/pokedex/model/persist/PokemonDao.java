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
    String genre = rs.getString("genre");
    String type = rs.getString("tipo");
     
        poke = new Pokemon(id, name, height, weight, genre.MALE, tipo);
        return poke;
 
    }
    
    
    
    
    
    
    
    
 public int insert (Pokemon pokemon) throws SQLException{
 
     int result = 0;
 
    try (Connection conn = dbConnect.getConnection()){
 
    String query = "insert into pokemon values (null,?,?,?,?,?)";
    PreparedStatement st = conn.prepareStatement(query);
    st.setLong(result, result);
 
 
 
 
 
 
 
 }
        return 0;
 
 
 
 
 
 
 }
    
    
  
    
    
    
    
    
    
    
    
    
}
