/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package categprodui;

import Model.Product;
import Model.StoreModel;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class CategProdUI2 {

    private final Menu mainMenu;
    private Scanner uiReader;
    
    private StoreModel model;
    
    public CategProdUI2(StoreModel model) {
        this.model = model;
        mainMenu = new Menu("Category and products Menú");
        uiReader = new Scanner(System.in);

    }
    
    public static void main(String[] args) throws SQLException {
        StoreModel model_local = new StoreModel();

        CategProdUI2 app = new CategProdUI2(model_local);
        app.run(); 
        
        
        
        
    }
    
     /**
     * application logic entry point
     */
    public void run() throws SQLException {
        boolean exit = false;  //set exit flag to false
        //control loop
        do {
            //display menu and read user's choice
            mainMenu.show();
            int option = mainMenu.getSelectedOption();
            
            //process user's choice: one control method for each functionality
            switch (option) {
                case 0:  //exit application
                    exit = doExit();
                    break;
                case 1:  //list all categories
                    doListAllCategories();
                    break;
                case 2:  //list category given its code
                    doListCategoryByCode();
                    break;
                case 3:  //add a new category
                    doAddCategory();
                    break;
                case 4:  //list all products
                    doListAllProducts();
                    break;
                case 5:  //add a new product
                    doAddProduct();
                    break;
                case 6:  //list products given their category
                    doListProductsByCategory();
                    break;
                default:  //default option
                    doDefault();
                    break;
            }
        } while (!exit);
    }



    private boolean doExit() {
        
        System.out.println("Sure to Exit(Yes/No)");
         String confirm = uiReader.nextLine();
        if (confirm.equalsIgnoreCase("YES")) {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
        /**
     * process default action
     */
    public void doDefault() {
        //System.out.println("Unknown option!");
        System.out.println("Not implemented yet!");
    }

    
    /**
     * reads from user data for a category
     * @return category object or null in case of error
     */
/*  BORRAR   
    public Category doInputCategory() {
        Category c;
        try {
//            String sid = doInput("id: ");
//            long id = Long.parseLong(sid);
            long id = 0;  //id is autoincrement
            String code = doInput("code: ");
            String name = doInput("name: ");
            c = new Category(id, code, name);            
        } catch (NumberFormatException ex) {
            c = null;
        }
        return c;
    }
   
    /**
     * reads from user data for a category
     * @return category object or null in case of error
     */
/*  BORRAR 
    public Product doInputProduct() {
        Product p;
        try {
            //get a number formatter for our locale
//            String sid = doInput("id: ");
//            long id = Long.parseLong(sid);
            long id = 0;  //id is autoincrement
            String code = doInput("code: ");
            String name = doInput("name: ");
            String sstock = doInput("stock: " );
            int stock = Integer.parseInt(sstock);
            String sprice = doInput("price: " );
            double price = Double.parseDouble(sprice);
            String scatId = doInput("category id: " );
            long catId = Long.parseLong(scatId);
            Category cat = new Category(catId); 
            p = new Product(id, code, name, stock, price, cat);            
        } catch (NumberFormatException ex) {
            p = null;
        }
        return p;
    }  
BORRAR */     
    
    /**
     * displays a message and gets ans answer from user
     * @param message the message to display
     * @return user's answer
     */
    public String doInput(String message) {
        System.out.print(message);
        return uiReader.nextLine();
    }

    private void doListAllCategories() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void doListCategoryByCode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void doAddCategory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void doListAllProducts() throws SQLException {
       
            List<Product> items = model.findAllProducts();
         for(Product show_product :items) {
            System.out.println(show_product);
        
        }
    }
    
    private void doAddProduct() {
        Product prod = doInputProduct();
        if (prod != null) {
            int result = model.addProduct(prod);
            String message = (result == 1) ? "Successfully added" : "Not added";
            doAlert(message);
        } else {
            doAlert("Error validating data");
        }
    }

    private void doListProductsByCategory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
