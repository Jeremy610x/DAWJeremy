package cat.proven.pokedex.model.persist;

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
public class PokemonTypeDao {

    private final DbConnect dbConnect;

    public PokemonTypeDao(DbConnect connect) {
        this.dbConnect = connect;
    }
    
    //TODO
    public PokemonType selectWhereName(String name) throws SQLException{
        
            PokemonType PokTyp;
        Connection conn = dbConnect.getConnection();
        if (conn!=null)
        {
             /*Statement st = conn.createStatement();
             String query = "select * from products where "
                     + "NAME = '" + code + "'";*/
             String query2 = "select * from pokemontypes where id=?";
             PreparedStatement Pst = conn.prepareStatement(query2);
             Pst.setString(1, name);
             ResultSet cursor_rs = Pst.executeQuery();
             if(cursor_rs.next()) //existe registro
             {
                 PokTyp = typeFromResultSet(cursor_rs);
             }
             else
             {
                 PokTyp = null;
             }
             cursor_rs.close();
             Pst.close();
             conn.close();
             return PokTyp;
        }
        else
        {
            return null; //null
        }

    }
   private PokemonType typeFromResultSet(ResultSet cursor_rs) throws SQLException{
            PokemonType PokTyp;

        int id = cursor_rs.getInt("id");
        String attack = cursor_rs.getString("attack");
        String name = cursor_rs.getString("name");

        PokTyp=new PokemonType(id, name, attack);
    return PokTyp;
    }
   

 public int insertType(PokemonType add) throws SQLException{
        Scanner sc = new Scanner(System.in);
        int result=0;
        try{
        Connection conn = dbConnect.getConnection();     

        //get a connection to database.
                //create a statement to perform queries.
           
            String query="insert into pokemontypes values(null,?,?)";             // String query="insert into pokemontypes values(null,?,?)";
            PreparedStatement st = conn.prepareStatement(query);
                //execute the query.
           st.setString(1, add.getName());
            st.setString(2, add.getAttack());
            result = st.executeUpdate();
            } catch (SQLException ex) {
            System.out.println("ERROR SQL.."+ex.getMessage());
            }       
        return result;
 }


     public List<PokemonType> selectAll() throws SQLException{
        //NO PERMITIDIDOS LOS SOUT
        List<PokemonType> result= new ArrayList<>();

        Connection conn = dbConnect.getConnection();     
        if(conn!=null){
        Statement st = conn.createStatement();//objecte per fer instrucciones
        String query= "select * from pokemontypes";//inst. query
            System.out.println("Query --> "+query); //prueba de consulta
        ResultSet cursor_rs=st.executeQuery(query);
        
        while(cursor_rs.next()){
        //Crear un producte
        PokemonType type= typeFromResultSet(cursor_rs);
        //Afegirlo a la llista
        result.add(type);
        }
        
        cursor_rs.close();
        st.close();
        conn.close();
        }
        else{
        return null;
        }
       
        return result;
        

       
}
     
 
    }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     



