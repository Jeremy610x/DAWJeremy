/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.Objectes;

import java.util.Scanner;

/**
 * clase botella en servira per definir les caracteristiques basiques de la botella (ampolla)
 * @author jepa2698
 */
public class Botella {
 /*atributs objecte*/
   private String material; /*de que esta feta la Botella*/
   private int capacitat; /*capacitat maxima Botella*/
   private String tipo_contenido; /*quin(aigua/whisky/cola) liquid hi ha a la Botella*/
   private int any_caducitat;
   private boolean  abierta; /*true si esta abierta*/
   private int volum_actual; /*liquid que conte la Botella*/
    
   //metodes propis botella
   //Constructors
   public Botella() /*constructor 1 buit*/
   {
       this.capacitat=1000; //també podria cridar al setCapacitat
       this.setMaterial("Vidre"); //perque passi la validació
       this.abierta=false; //es millor cridar al SetAbierta
       this.setLiquid_actual(1000);
      // this.volum_actual=this.capacitat;
   }
   
   public Botella(String material, int capacitat) /*constructor 2 parametres (String, int)*/
   {
       this.setMaterial(material);
       this.capacitat=capacitat;
       this.abierta=false;
       this.setLiquid_actual(1000);
   }
   
   /*aquest es valid perque si que te 2 parametres pero 
   el ordre no es el mateix que el constructor anterior
   el anterior es (String, int) i aquest és (int, String)
   */
   public Botella(int caducitat, String contenido)
   {
       this.tipo_contenido = contenido;
       this.any_caducitat = caducitat;
       this.setLiquid_actual(1000);
   }

    public Botella(String material, int capacitat, String tipo_contenido, int any_caducitat, boolean abierta, int liquid_actual) {
        this.material = material;
        this.capacitat = capacitat;
        this.tipo_contenido = tipo_contenido;
        this.any_caducitat = any_caducitat;
        this.abierta = abierta;
        this.setLiquid_actual(1000);
    }
   //get -> Obtener
   /**
    * 
    * @return el tipo de material de la botella
    */
   public String getMaterial()
   {
       return material;
       //return this.material;
   }
   
   /**
    * informar a la botella con el material que nos han pasado
    * @param material_botella que queremos que sea la botella
    */
   public void setMaterial(String material_botella)
   {
       if (material_botella.equalsIgnoreCase("Vidre")
               || material_botella.equalsIgnoreCase("Plastic"))
       {//materials valids
           //material = material_botella;
            this.material = material_botella; //this = el objeto llamado
       }
       else
       {//si no es material valid
           System.out.println("El material" + material_botella + " no es valido."
                   + "Creamos una botella de Vidre");
           this.material="Vidre";         
           
       }
       
   }

    public int getCapacitat() {
        return capacitat;
    }

    public String getTipo_contenido() {
        return tipo_contenido;
    }

    public int getAny_caducitat() {
        return any_caducitat;
    }

    /* getter, pero al ser boolea es nombra isNomAtribut*/
    public boolean isAbierta() {
        return abierta;
    }

    public int getLiquid_actual() {
        return volum_actual;
    }

    public void setTipo_contenido(String tipo_contenido) {
        
        this.tipo_contenido = tipo_contenido;
    }

    public void setAny_caducitat(int any_caducitat) {
        if (any_caducitat>=2023)
        {
            this.any_caducitat = any_caducitat;
        }
        else
        {//
            System.out.println("Data caducidad debe ser superior a 2022"); 
        }
        
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public void setLiquid_actual(int liquid_actual) {
        this.volum_actual = liquid_actual;
    }
   
    /**
     * vierte cada vez que se llama 10 ml y baja su volumen
     * @return la cantidad 10
     */
    public int verterLiquido()
    {
        int liquido_vertido = 10;
        if (this.volum_actual>10)
        {
            this.volum_actual = this.volum_actual-liquido_vertido;
        }
        else 
        { //si queda menos de 10
            liquido_vertido = this.volum_actual;
            this.volum_actual= 0;
        }
        
        return liquido_vertido;
    }
    
    public int beberLiquido()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto bebes?");
        int liquido_vertido = sc.nextInt();
        this.volum_actual = this.volum_actual-liquido_vertido;
        return liquido_vertido;
    }
}
