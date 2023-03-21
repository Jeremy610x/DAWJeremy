/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionset;

import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jepa2698
 */
public class Cromo {
   private int num;
    private String descripcio_cromo;

    public Cromo(int num) throws Exception {
        this.setNum(num);
        this.descripcio_cromo = "Descripcio sense valor";
    }

    public Cromo(int num, String descripcio_cromo){
       try {
           this.setNum(num);
       } catch (Exception ex) {
           Logger.getLogger(Cromo.class.getName()).log(Level.SEVERE, null, ex);
       }
        this.setDescripcio_cromo(descripcio_cromo);
        
    }

    public int getNum() {
        return num;
    }

    /**
     * canvia el valor de num
     * @param num introducido.
     * @throws Exception si el numero introducido es negativo
     */
    public void setNum(int num) throws Exception {

        {
            this.num = num;
        }
        
    }

    public String getDescripcio_cromo() {
        return descripcio_cromo;
    }

    public void setDescripcio_cromo(String descripcio_cromo){

  
            this.descripcio_cromo = descripcio_cromo;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cromo)) {
            return false;
        }
        final Cromo other = (Cromo) obj;
        return this.num == other.num;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("num");
        sb.append(num);
        sb.append("-");
        sb.append(descripcio_cromo);
        return sb.toString();
        //return "num=" + num + "-" + descripcio_cromo ;
    }

 

}
