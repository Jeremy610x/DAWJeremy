/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4;

/**
 *
 * @author mabardaji
 */
public class Rectangulo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if(x2<x1 || y2<y1)
        {
            System.out.println("Error segundas coordenadas"
                    + " mas peque�as que primeras");
            
            if (x2<x1)
            {//lo arreglo yo
                this.x1 = x2;
                this.x2 = x1;
            }
            if (y2<y1)
            {//lo arreglo yo 
                this.y1 = y2;
                this.y2 = y1;
            }
            
        }
        else
        {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        
    }
    
    

    public int getX1() {
        return x1;
    }

    /** comprobar que el x1 es mas peque�o que el x2*/
    public void setX1(int x1) {
        if(x1<this.x2)
        {
            this.x1 = x1;    
        }
        else //x2 pasaria a ser mas peque�o
        { //y no debe ser asi
            System.out.println("La coordenada x1 no puede"
                    + " ser superior a x2" + 
            "x1->" + x1 + " x2->" + this.x2);
        }
        
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if(y1>this.y2)
        {
            System.out.println("La coordenada y1 no puede"
                    + " ser superior a y2" + 
            "y1->" + y1 + " y2->" + this.y2); 
        }
        else
        {
           this.y1 = y1;  
        }
       
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if(x2<this.x1)
        {
            System.out.println("La coordenada x1 no puede"
                    + " ser superior a x2" + 
            "x1->" + this.x1 + " x2->" + x2); 
        }
        else
        {
            this.x2 = x2;
        }
        
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if(y2<this.y1)
        {
            System.out.println("La coordenada x1 no puede"
                    + " ser superior a x2" + 
            "x1->" + this.y1 + " x2->" + y2); 
        }
        else
        {
            this.y2 = y2;
        }
    }

    public void imprime() {
        System.out.println("Rectangulo(" + this.getX1()+
        "," + this.getY2()+")-("+this.x2+","+
                this.y2 + ")");
        
     //   System.out.println("Rectangulo(" + this.getX1()+
     //   "," + this.getY2()+")-("+this.x2+","+
       //         y2 + ")");
    }
    public int getPerimetro(){
    int base = this.getX2()-this.getX1();
        int lado = this.getY2()-this.getY1();
        int perimetro = (base*2) + (lado*2);
        return perimetro;
    
    }
    
    

    public int AreaPerimetro(){
   
      int base = this.getX2()-this.getX1();
        int altura = this.getY2()-this.getY1();
        int area = base*altura;
        return area;
    }
    public  boolean setX1Y1(int x1,int y1){
        boolean correcto = true;
        
        if(x1<this.x2)
        {
            this.x1 = x1;    
        }
        else //x2 pasaria a ser mas peque�o
        { //y no debe ser asi
            System.out.println("La coordenada x1 no puede"
                    + " ser superior a x2" + 
            "x1->" + x1 + " x2->" + this.x2);
        }
        
   return correcto=false;
       
    
    }
    
    
}
