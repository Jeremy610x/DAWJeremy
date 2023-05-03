/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showcountriesjdbcmysql;

import Database.DBConnect;
import Model.Country;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jepa2698
 */
public class ShowCountriesJdbcMySql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ShowCountriesJdbcMySql app = new ShowCountriesJdbcMySql();
        app.run();
        
    }

    private void run() throws IOException  {
       boolean exit = false;
        try {
            //load the driver (only once).
            DBConnect.loadDriver();
            do {
                int optNumber = promptMenu();
                switch (optNumber) {
                    case 0 -> exit = true;
                    case 1 -> printAllCountries();
                    case 2 -> printAllCountriesAndMetadata();
                    case 3 -> insertANewCountry();
                    case 4 -> modifyACountry();
                    case 5 -> deleteACountry();
                    default -> System.out.println("Bad option!");
                }
            } while (!exit);
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada " + ex.getMessage());
        }
    }

    private int promptMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] options = {
            "Quit", "Print all countries", "Print all countries and metadata",
            "Insert a new country", "Modify a country", "Delete a country",};
        for (int i = 0; i < options.length; i++) {
            System.out.format("[%d]. %s\n", i, options[i]);
        }
        System.out.print("Choose a test to execute: ");
        int op;
        try {
            op = Integer.parseInt((reader.readLine()));
        } catch (NumberFormatException | IOException e) {
            op = -1;
        }
        return op;
    }
/**
 * Mostrar todos los paises 
 */
    private void printAllCountries() {
        System.out.println("Listing all countries.......");
        //get connection a database
       try{
        Connection conn = DBConnect.getConnection();
        if(conn!=null){
        
        //crear statement per crear kes queries 
        
        Statement stmt = conn.createStatement();
        //execute query and obtains results
            String query = "SELECT * from countries where id <= 200";          
            ResultSet resCursor = stmt.executeQuery(query);
          
            //write headers
            
            System.out.println("");
                System.out.format("%s\t%-15s\t%-15s\t%-10s\t%-10s\t%-10s\t%s\n",
                            "id",
                            "name", "capital",
                            "surface", "inhabitants",
                            "pib", "life expectancy");
                System.out.println("");
            // res.close();
            // stmt.close();
            //fetch . iterate cursor
            while(resCursor.next()) //<= FETCH
            {
            
            int id =resCursor.getInt("id");
            String name = resCursor.getString("name");
            String capital = resCursor.getString("capital");
            double surface = resCursor.getDouble("surface");
            int inhabitants = resCursor.getInt("inhabitants");
            double pib = resCursor.getDouble("pib");
            int lifeexpectancy = resCursor.getInt("lifeexpectancy");
            
            
            Country pais  = new Country(id,name,capital,surface , inhabitants , pib,lifeexpectancy);
                System.out.println(pais);
            
            
            
            
            }
        
            System.out.println("Country listed.....");
            resCursor.close();
            stmt.close();
        } else{
            System.out.println("Error en conexion");
        }
       }catch (SQLException ex){
                
       System.out.println("Error conexion dql ..." + ex.getMessage());
                             
       }
        
    }

    private void printAllCountriesAndMetadata() {
          System.out.println("Executing: " + (new Exception()).getStackTrace()[0].getMethodName());
        try ( Connection conn = DBConnect.getConnection() ) { //get a connection to database.
            if (conn != null) {
                //create a statement to perform queries.
                Statement stmt = conn.createStatement();
                //execute the query and get a resultset.
                String query = "SELECT * FROM countries WHERE lifeexpectancy > 77";
                ResultSet res = stmt.executeQuery(query);
                //get and write metadata.
                ResultSetMetaData rsmd = res.getMetaData();
                int numCol = rsmd.getColumnCount();
                System.out.println("Number of columns: " + rsmd.getColumnCount());
                System.out.println("Label \t Name \t Type \t Type name \t Auto increment \t Null \t Precision");
                for (int i = 0; i < numCol; i++) {
                    System.out.print(rsmd.getColumnLabel(i + 1) + " \t ");
                    System.out.print(rsmd.getColumnName(i + 1) + " \t ");
                    System.out.print(rsmd.getColumnType(i + 1) + " \t ");
                    System.out.print(rsmd.getColumnTypeName(i + 1) + " \t ");
                    System.out.print(rsmd.isAutoIncrement(i + 1) + " \t ");
                    System.out.print(rsmd.isNullable(i + 1) + " \t ");
                    System.out.print(rsmd.getPrecision(i + 1) + " \t ");
                    System.out.println("");
                }
                //write headers.
                System.out.println("");
                for (int i = 0; i < numCol; i++) {
                    System.out.print(rsmd.getColumnLabel(i + 1) + "\t");
                }
                System.out.println("");
                //iterate the resultset and write the rows.
                while (res.next()) {
                    //convert data to java format.
                    int id = res.getInt("id");
                    String name = res.getString("name");
                    String capital = res.getString("capital");
                    double surface = res.getDouble("surface");
                    int inhabitants = res.getInt("inhabitants");
                    double pib = res.getDouble("pib");
                    int lifeexpectancy = res.getInt("lifeexpectancy");
                    //instantiate a country object.
                    Country country = new Country(id, name, capital, surface, inhabitants, pib, lifeexpectancy);
                    //write data.
                    System.out.format("%d\t%-15s\t%-15s\t%8.0f\t%10d\t%8.2f\t%d\n",
                            country.getId(),
                            country.getName(), country.getCapital(),
                            country.getSurface(), country.getInhabitants(),
                            country.getPib(), country.getLifeexpectancy());
                }
                System.out.println("");
                //close resources.
                res.close();
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

    private void insertANewCountry() {
        System.out.println("Insert a new Country");
        try{
            Connection conn = DBConnect.getConnection();
            if(conn!=null){
            
            
            Statement stmt = conn.createStatement();
            
            String query = "INSERT INTO COUNTRIES VALUES( "+
                    "101,'AndorraI','Andorra2000',"
                    +"1000,25,3,90)";
            
                System.out.println("sql-->" + query);
            
            int numRowsAffected = stmt.executeUpdate(query);
                System.out.println(numRowsAffected + "inserted...");
                
            stmt.close();
            conn.close();
            }
            else{
                System.out.println("Conexion incorrecta Insert .....");
            
            }
        
        
        
        }catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        
        
        
        }
        
        
     
    }

    private void modifyACountry() {
        System.out.println("Modificar Country");
        try{
        Scanner sc = new Scanner (System.in);    
        Connection conn = DBConnect.getConnection();
            if(conn!=null){
             Statement stmt = conn.createStatement();
            System.out.println("Dime el ID para cambiarlo");
             int newid = sc.nextInt();
             sc.nextLine();//para borrar el return 
             System.out.println("Dime el nombre para cambiar el pais");
             String newname = sc.nextLine();
            
            String query = "UPDATE COUNTRIES"+" SET NAME = '"+ newname +
                    "' WHERE ID =" + newid;
                System.out.println("sql-->" + query);
            int numRowsAffected = stmt.executeUpdate(query);
                System.out.println("Modificando paises ...." + numRowsAffected);
            
            stmt.close();
            conn.close();
                
        }
        }catch(SQLException ex ){
            System.out.println("Eror en la modiifcacion del country" + ex.getMessage());
        
        }
        
        
    }

    private void deleteACountry() {
        System.out.println("Delete Country ....");
        try {
         Connection conn = DBConnect.getConnection();
            if(conn!=null){
             Statement stmt = conn.createStatement();
            
            String query = "delete from countries where id = 101";
            
            int numRowsAffected = stmt.executeUpdate(query);
            System.out.println("eliminado paises.... " + numRowsAffected);     
            
            stmt.close();
            conn.close();
            }    
            
          
        }catch (SQLException ex)  
        {
         System.out.println("Error en elimanar country..." + ex.getMessage());
        }
 }
    
}
