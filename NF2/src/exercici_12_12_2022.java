
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jepa2698
 * 
 * 
    El nostre joc sera mes senzill , crearem un array de tipus lletra on hi haurà una boleta , O (o mayuscula) i dues X.
    Inicialment es ficara aleatoriament tot a X i despres una posició la fiquem a 0.
    Llavors, ha de fer 10 canvi de posicions.
        Un canvi de posicio, es intercanviar el valor de dues de les posicions del cubiletes.
        Per exemple canvia el valor del 0 per la posició 2, HAN DE CANVIAR ELS DOS VALORS.
        Com que no es visual, apart de fer el canvi ha de mostrar la frase "Intercanvio posicions 0 y 2"
S'ha de mostrar les 10 frases del canvi i despres demanar-te a on esta la pilota.

Si encertes has guanyat, sinò has perdut.

Ampliació joc: Segueixes jugant fins que hagis encertat 3 cops on es la pilota
 * 
 * 
 * 
 * 
 * 
 */
public class exercici_12_12_2022 {
    public static void main(String[] args) {
    
        char[] cubiletes = new char [3];
        inicializarCubiletes(cubiletes);
        //mostrarCubiletes(cubiletes);
        for (int i =0; i <=10 ; i++ ){
        
            System.out.println("Cambio: " + i);
            moverCubiletes(cubiletes);
            //mostrarCubiletes(cubiletes);
        }
       
            int pos = pedirPosicionBolita();
            if (cubiletes [pos] =='0')
            {
            
                System.out.println("Has ganao");
                
            }
            else{
            
                System.out.println("Has perdio ");
            }
            
    }
    private static void inicializarCubiletes(char[] cubiletes){
    for(int i =0;i < cubiletes.length;i++){
    
    cubiletes[i] = 'X';
    }
    
    Random rd = new Random();
    int pos = rd.nextInt(3);
    cubiletes [pos] = '0';
    
           
           
    }
    
    
    private static void moverCubiletes(char[] cubiletes){
    
        Random rd = new Random ();
        int pos1 ,pos2;
        pos1 = rd.nextInt(3);
        do{
        pos2 = rd.nextInt(3);
        }while(pos1==pos2);
         System.out.println("Cambio la posicion" + (pos1+1)
         + "por la posicion " + (pos2+1));
         char aux = cubiletes[pos1];
         cubiletes[pos1] = cubiletes[pos2];
         cubiletes[pos2] = aux;
                 
        
    
    
    }

    private static int pedirPosicionBolita() {
     Scanner sc = new Scanner (System.in);
     int valor;
     do{
         System.out.println("Pon el cubilete donde esta la bola");
         valor = sc.nextInt();
       
     }while (!(valor>=1 && valor<=3));
     
     return valor -1;
    }
    
    
}
