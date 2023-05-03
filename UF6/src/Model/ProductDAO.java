/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Database.DbConnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *CRUD -CREATE-READ-UPDATE-DETE
 * @author jepa2698
 */
public class ProductDAO {
    //variable per conectar a la base de db 
    private final DbConnect dbConnect;

    public ProductDAO() {
        this.dbConnect = new DbConnect();
    }
    
    /**
     * return the prodcut where code=input
     * @param code
     * @return  product found , null if  don't exist
     */
    public Product selectWhereCode(String code) throws SQLException{
    
        Connection conn = dbConnect.getConnection();
        if (conn!=null){
        Statement st = conn.createStatement();
         String query = "select * from products where"
                 + "code ='" + code + "'" ;
        
          String query2 = "select * from products where code=?";
          PreparedStatement Pst = conn.prepareStatement(query2);
          Pst.setString(1,code);
          ResultSet cursor_rs = Pst.executeQuery();
          
          Product prod;
          if(cursor_rs.next()){
          
          prod = productFromResultSet(cursor_rs);
          
          }
          else{
          prod = null;
          }
          
          cursor_rs.close();
          Pst.close();
          conn.close();
          
          return prod;
          
        }else{
        
        return null;
        }
        
        
        

    }
    
    /**
     * null if connection isn't working 
     * 
     * @return all product database 
     */
    public List<Product> selectAll() throws SQLException{
    
        List <Product> result = new ArrayList<>();
        
   
            Connection conn = dbConnect.getConnection();
            if(conn!=null){
            
                Statement st = conn.createStatement();
                String query = "select * from products";
                System.out.println("Query-->" + query);//proves sql
                ResultSet cursor_rs = st.executeQuery(query);
                while(cursor_rs.next()){
                
                Product prod = productFromResultSet(cursor_rs);
                
                result.add(prod);
                
                }
          cursor_rs.close();
          st.close();
          conn.close();       
                
                
            
            }
            else
            {
            return null;
            }

    return null;
    }

    private Product productFromResultSet(ResultSet cursor_rs) throws SQLException {
       Product prod;
       int id = cursor_rs.getInt("id");
       String code = cursor_rs.getString("code");
       String name = cursor_rs.getString("name");
       int stock = cursor_rs.getInt("stock");
       
        double price = cursor_rs.getDouble("price");
        int category = cursor_rs.getInt("category_id");
       
       
    prod = new Product(id, code, name, stock, price, category);
               
       
        return prod;
    }
    
    public int insert (Product add ) throws SQLException{

        int result = 0;
        //get a connection and perform query
         Connection conn = dbConnect.getConnection(); 
         
            String query = "insert into products values (null, ?, ?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(query);
            
            
            st.setString(1, add.getCode());
            st.setString(2, add.getName());
            st.setInt(3, add.getStock());
            st.setDouble(4, add.getPrice());
            st.setLong(5, add.getCategory_id());
            result = st.executeUpdate();
               
        return result;
    
    
    
    
    
    
    
    
    
    }
    
    
}
