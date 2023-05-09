package cat.proven.pokedex.model.persist;


import cat.proven.pokedex.model.Genre;
import cat.proven.pokedex.model.Pokemon;
import cat.proven.pokedex.model.PokemonType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     public Pokemon selectWhereName(String code) throws SQLException
    {
        Pokemon poke;
        Connection conn = dbConnect.getConnection();
        if (conn!=null)
        {
            
             String query2 = "select * from pokemons where name=?";
             PreparedStatement Pst = conn.prepareStatement(query2);
             Pst.setString(1, code);
             
             ResultSet cursor_rs = Pst.executeQuery();
             if(cursor_rs.next()) //existe registro
             {
                 poke = fromResultSet(cursor_rs);
             }
             else
             {
                 poke = null;
             }
             cursor_rs.close();
             Pst.close();
             conn.close();
             return poke;
        }
        else
        {
            return null; //null
        }
    }
    
    public List<Pokemon> selectAll() throws SQLException
    { //NO PERMITODOS LOS SOUT
      List<Pokemon> result = new ArrayList<>();
      
      Connection conn = dbConnect.getConnection();
            if (conn!=null)
            {
               Statement st = conn.createStatement(); //objecte per fer instruc
               String query = "select * from pokemons"; //inst. SQL
                System.out.println("Query--->" + query); //proves de la SQL
               ResultSet cursor_rs = st.executeQuery(query);
               while(cursor_rs.next())
               {
                   //crear un producte
                   Pokemon poke = fromResultSet(cursor_rs);
                   //afegirlo a la llista;
                   result.add(poke);
               }
               cursor_rs.close();
               st.close();
               conn.close();
               return result;
            }
            else
            {
             return null;   //if not connext 
            }   
    }
    
    public int insertPokemon(Pokemon add) throws SQLException
    {
        Scanner sc = new Scanner (System.in);
        int result = 0;
        //get a connection and perform query

        Connection conn = dbConnect.getConnection();
        String query = "insert into pokemons values (?, ?, ?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(query);
        
        st.setInt(1, add.getId());
        st.setString(2, add.getName());
        st.setDouble(3, add.getHeight());       
        st.setDouble(4, add.getWeight());
        st.setString(5,add.getGenre().toString());
        PokemonType type = add.getTipo();
        st.setInt(6, type.getId());
        result = st.executeUpdate();
       
        return result;
    }  
    
    public Pokemon fromResultSet(ResultSet rs) throws SQLException {
    
    Pokemon poke;   
      int id = rs.getInt("id");
      
      String name = rs.getString("name");
      double height = rs.getDouble("height");
      double weight = rs.getDouble("weight");
////    Genre genre = rs.getString("genre");
        String gen=rs.getString("genre");
        Genre genero = Genre.valueOf(gen);
        int type_id = rs.getInt("type_id");
        PokemonType tipo = new PokemonType(type_id);
     
        
      poke = new Pokemon(id, name, height, weight, genero, tipo);
      return poke;
    }


    public List<Pokemon> selectWhereType(PokemonType tipo) {
        List<Pokemon> result = new ArrayList<>();
        //get a connection and perform query
        try ( Connection conn = dbConnect.getConnection()) {
            String query = "select * from pokemons where type_id=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setLong(1, tipo.getId());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pokemon poke = fromResultSet(rs);
                if (poke != null) {
                    result.add(poke);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return result;

    }
}
    

    
    

