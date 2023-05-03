/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.SQLException;
import java.util.List;

/**
 * Model per guardar la aplicacio tenda (Productes i categories )
 * @author jepa2698
 */
public class StoreModel {
    private final ProductDAO productDao;
  //  private final CategoryDAO categoryDAO;

    public StoreModel() {
        this.productDao = new ProductDAO();
    }

    
    public int addProduct(Product add) throws SQLException {
    
        int result=0;
        
    boolean dataValid = true;    
    if(add != null){
    String code = add.getCode();
    if (code== null ){

    
        dataValid= false;
    }
    else{
    
    Product p = productDao.selectWhereCode(code);
    if (p!=null){
    
    
    dataValid=false;
    }
    }
    
    }
    else{
    
    dataValid= false;
    }
    
    if(dataValid=true){
    
    result = productDao.insert(add);
    }else
    {
    
    result = 0;
    }
    return result;
    
    }
    
    
    public List<Product> findAllProducts() throws SQLException{
 
    return productDao.selectAll();
    
    }    
    
    public Product findProductByCode(String code)throws SQLException{
    
    Product c= null;
    if(code!=null){
    
    c = productDao.selectWhereCode(code);
    }
    return c;

    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
